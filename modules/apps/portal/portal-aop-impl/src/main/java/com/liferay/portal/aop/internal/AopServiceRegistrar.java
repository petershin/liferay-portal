/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portal.aop.internal;

import com.liferay.petra.string.StringPool;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.monitoring.ServiceMonitoringControl;
import com.liferay.portal.kernel.util.HashMapDictionary;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.spring.aop.AopCacheManager;
import com.liferay.portal.spring.aop.AopInvocationHandler;
import com.liferay.portal.spring.transaction.TransactionExecutor;

import java.util.Arrays;
import java.util.Dictionary;
import java.util.HashSet;
import java.util.Set;

import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.Constants;
import org.osgi.framework.PrototypeServiceFactory;
import org.osgi.framework.ServiceFactory;
import org.osgi.framework.ServiceObjects;
import org.osgi.framework.ServiceReference;
import org.osgi.framework.ServiceRegistration;
import org.osgi.service.component.ComponentConstants;

/**
 * @author Preston Crary
 */
public class AopServiceRegistrar {

	public AopServiceRegistrar(
		ServiceReference<AopService> serviceReference, AopService aopService,
		Class<?>[] aopServiceInterfaces) {

		_serviceReference = serviceReference;
		_aopService = aopService;
		_aopServiceInterfaces = aopServiceInterfaces;

		Bundle bundle = serviceReference.getBundle();

		Dictionary<String, String> headers = bundle.getHeaders(
			StringPool.BLANK);

		if (headers.get("Liferay-Service") == null) {
			_liferayService = false;
		}
		else {
			_liferayService = true;
		}
	}

	public boolean isLiferayService() {
		return _liferayService;
	}

	public void register(
		TransactionExecutor transactionExecutor,
		ServiceMonitoringControl serviceMonitoringControl) {

		Bundle bundle = _serviceReference.getBundle();

		BundleContext bundleContext = bundle.getBundleContext();

		String[] aopServiceNames = new String[_aopServiceInterfaces.length];

		for (int i = 0; i < _aopServiceInterfaces.length; i++) {
			aopServiceNames[i] = _aopServiceInterfaces[i].getName();
		}

		String serviceScope = (String)_serviceReference.getProperty(
			Constants.SERVICE_SCOPE);

		Object service = null;

		if (Constants.SCOPE_SINGLETON.equals(serviceScope)) {
			_aopInvocationHandler = AopCacheManager.create(
				_aopService,
				AopCacheManager.createChainableMethodAdvices(
					transactionExecutor, serviceMonitoringControl));

			Class<? extends AopService> aopServiceClass =
				_aopService.getClass();

			Object aopProxy = ProxyUtil.newProxyInstance(
				aopServiceClass.getClassLoader(), _aopServiceInterfaces,
				_aopInvocationHandler);

			_aopService.setAopProxy(aopProxy);

			service = aopProxy;
		}
		else {
			ServiceObjects<AopService> serviceObjects =
				bundleContext.getServiceObjects(_serviceReference);

			if (Constants.SCOPE_BUNDLE.equals(serviceScope)) {
				service = new AopServiceServiceFactory(
					serviceObjects, transactionExecutor,
					serviceMonitoringControl);
			}
			else {
				service = new AopServicePrototypeServiceFactory(
					serviceObjects, transactionExecutor,
					serviceMonitoringControl);
			}
		}

		_serviceRegistration = bundleContext.registerService(
			aopServiceNames, service, _getProperties(_serviceReference));
	}

	public void unregister() {
		if (_serviceRegistration != null) {
			if (_aopInvocationHandler != null) {
				AopCacheManager.destroy(_aopInvocationHandler);

				_aopInvocationHandler = null;
			}

			_serviceRegistration.unregister();

			_serviceRegistration = null;
		}
	}

	public void updateProperties() {
		if (_serviceRegistration != null) {
			_serviceRegistration.setProperties(
				_getProperties(_serviceReference));
		}
	}

	private Dictionary<String, Object> _getProperties(
		ServiceReference<AopService> serviceReference) {

		Dictionary<String, Object> properties = null;

		for (String key : serviceReference.getPropertyKeys()) {
			if (_frameworkKeys.contains(key)) {
				continue;
			}

			if (properties == null) {
				properties = new HashMapDictionary<>();
			}

			properties.put(key, serviceReference.getProperty(key));
		}

		return properties;
	}

	private static final Set<String> _frameworkKeys = new HashSet<>(
		Arrays.asList(
			ComponentConstants.COMPONENT_ID, ComponentConstants.COMPONENT_NAME,
			Constants.OBJECTCLASS, Constants.SERVICE_BUNDLEID,
			Constants.SERVICE_ID, Constants.SERVICE_SCOPE));

	private AopInvocationHandler _aopInvocationHandler;
	private final AopService _aopService;
	private final Class<?>[] _aopServiceInterfaces;
	private final boolean _liferayService;
	private final ServiceReference<AopService> _serviceReference;
	private ServiceRegistration<?> _serviceRegistration;

	private class AopServicePrototypeServiceFactory
		extends AopServiceServiceFactory
		implements PrototypeServiceFactory<Object> {

		private AopServicePrototypeServiceFactory(
			ServiceObjects<AopService> serviceObjects,
			TransactionExecutor transactionExecutor,
			ServiceMonitoringControl serviceMonitoringControl) {

			super(
				serviceObjects, transactionExecutor, serviceMonitoringControl);
		}

	}

	private class AopServiceServiceFactory implements ServiceFactory<Object> {

		@Override
		public Object getService(
			Bundle bundle, ServiceRegistration<Object> serviceRegistration) {

			AopService aopService = _serviceObjects.getService();

			AopInvocationHandler aopInvocationHandler = AopCacheManager.create(
				aopService,
				AopCacheManager.createChainableMethodAdvices(
					_transactionExecutor, _serviceMonitoringControl));

			Class<? extends AopService> aopServiceClass = aopService.getClass();

			Object aopProxy = ProxyUtil.newProxyInstance(
				aopServiceClass.getClassLoader(), _aopServiceInterfaces,
				aopInvocationHandler);

			aopService.setAopProxy(aopProxy);

			return aopProxy;
		}

		@Override
		public void ungetService(
			Bundle bundle, ServiceRegistration<Object> serviceRegistration,
			Object aopProxy) {

			AopInvocationHandler aopInvocationHandler =
				ProxyUtil.fetchInvocationHandler(
					aopProxy, AopInvocationHandler.class);

			if (aopInvocationHandler == null) {
				throw new NullPointerException(
					"Missing AopInvocationHandler for " + aopProxy);
			}

			AopCacheManager.destroy(aopInvocationHandler);

			_serviceObjects.ungetService(
				(AopService)aopInvocationHandler.getTarget());
		}

		private AopServiceServiceFactory(
			ServiceObjects<AopService> serviceObjects,
			TransactionExecutor transactionExecutor,
			ServiceMonitoringControl serviceMonitoringControl) {

			_serviceObjects = serviceObjects;
			_transactionExecutor = transactionExecutor;
			_serviceMonitoringControl = serviceMonitoringControl;
		}

		private final ServiceMonitoringControl _serviceMonitoringControl;
		private final ServiceObjects<AopService> _serviceObjects;
		private final TransactionExecutor _transactionExecutor;

	}

}