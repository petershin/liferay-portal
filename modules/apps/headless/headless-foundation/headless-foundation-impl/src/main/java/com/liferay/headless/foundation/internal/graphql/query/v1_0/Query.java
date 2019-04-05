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

package com.liferay.headless.foundation.internal.graphql.query.v1_0;

import com.liferay.headless.foundation.dto.v1_0.Email;
import com.liferay.headless.foundation.dto.v1_0.Keyword;
import com.liferay.headless.foundation.dto.v1_0.Organization;
import com.liferay.headless.foundation.dto.v1_0.Phone;
import com.liferay.headless.foundation.dto.v1_0.PostalAddress;
import com.liferay.headless.foundation.dto.v1_0.Role;
import com.liferay.headless.foundation.dto.v1_0.Segment;
import com.liferay.headless.foundation.dto.v1_0.SegmentUser;
import com.liferay.headless.foundation.dto.v1_0.TaxonomyCategory;
import com.liferay.headless.foundation.dto.v1_0.TaxonomyVocabulary;
import com.liferay.headless.foundation.dto.v1_0.UserAccount;
import com.liferay.headless.foundation.dto.v1_0.WebUrl;
import com.liferay.headless.foundation.resource.v1_0.EmailResource;
import com.liferay.headless.foundation.resource.v1_0.KeywordResource;
import com.liferay.headless.foundation.resource.v1_0.OrganizationResource;
import com.liferay.headless.foundation.resource.v1_0.PhoneResource;
import com.liferay.headless.foundation.resource.v1_0.PostalAddressResource;
import com.liferay.headless.foundation.resource.v1_0.RoleResource;
import com.liferay.headless.foundation.resource.v1_0.SegmentResource;
import com.liferay.headless.foundation.resource.v1_0.SegmentUserResource;
import com.liferay.headless.foundation.resource.v1_0.TaxonomyCategoryResource;
import com.liferay.headless.foundation.resource.v1_0.TaxonomyVocabularyResource;
import com.liferay.headless.foundation.resource.v1_0.UserAccountResource;
import com.liferay.headless.foundation.resource.v1_0.WebUrlResource;
import com.liferay.petra.function.UnsafeConsumer;
import com.liferay.petra.function.UnsafeFunction;
import com.liferay.portal.kernel.search.Sort;
import com.liferay.portal.kernel.search.filter.Filter;
import com.liferay.portal.kernel.security.auth.CompanyThreadLocal;
import com.liferay.portal.kernel.service.CompanyLocalServiceUtil;
import com.liferay.portal.vulcan.pagination.Page;
import com.liferay.portal.vulcan.pagination.Pagination;

import graphql.annotations.annotationTypes.GraphQLField;
import graphql.annotations.annotationTypes.GraphQLInvokeDetached;

import java.util.Collection;

import javax.annotation.Generated;

import org.osgi.service.component.ComponentServiceObjects;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class Query {

	public static void setEmailResourceComponentServiceObjects(
		ComponentServiceObjects<EmailResource>
			emailResourceComponentServiceObjects) {

		_emailResourceComponentServiceObjects =
			emailResourceComponentServiceObjects;
	}

	public static void setKeywordResourceComponentServiceObjects(
		ComponentServiceObjects<KeywordResource>
			keywordResourceComponentServiceObjects) {

		_keywordResourceComponentServiceObjects =
			keywordResourceComponentServiceObjects;
	}

	public static void setOrganizationResourceComponentServiceObjects(
		ComponentServiceObjects<OrganizationResource>
			organizationResourceComponentServiceObjects) {

		_organizationResourceComponentServiceObjects =
			organizationResourceComponentServiceObjects;
	}

	public static void setPhoneResourceComponentServiceObjects(
		ComponentServiceObjects<PhoneResource>
			phoneResourceComponentServiceObjects) {

		_phoneResourceComponentServiceObjects =
			phoneResourceComponentServiceObjects;
	}

	public static void setPostalAddressResourceComponentServiceObjects(
		ComponentServiceObjects<PostalAddressResource>
			postalAddressResourceComponentServiceObjects) {

		_postalAddressResourceComponentServiceObjects =
			postalAddressResourceComponentServiceObjects;
	}

	public static void setRoleResourceComponentServiceObjects(
		ComponentServiceObjects<RoleResource>
			roleResourceComponentServiceObjects) {

		_roleResourceComponentServiceObjects =
			roleResourceComponentServiceObjects;
	}

	public static void setSegmentResourceComponentServiceObjects(
		ComponentServiceObjects<SegmentResource>
			segmentResourceComponentServiceObjects) {

		_segmentResourceComponentServiceObjects =
			segmentResourceComponentServiceObjects;
	}

	public static void setSegmentUserResourceComponentServiceObjects(
		ComponentServiceObjects<SegmentUserResource>
			segmentUserResourceComponentServiceObjects) {

		_segmentUserResourceComponentServiceObjects =
			segmentUserResourceComponentServiceObjects;
	}

	public static void setTaxonomyCategoryResourceComponentServiceObjects(
		ComponentServiceObjects<TaxonomyCategoryResource>
			taxonomyCategoryResourceComponentServiceObjects) {

		_taxonomyCategoryResourceComponentServiceObjects =
			taxonomyCategoryResourceComponentServiceObjects;
	}

	public static void setTaxonomyVocabularyResourceComponentServiceObjects(
		ComponentServiceObjects<TaxonomyVocabularyResource>
			taxonomyVocabularyResourceComponentServiceObjects) {

		_taxonomyVocabularyResourceComponentServiceObjects =
			taxonomyVocabularyResourceComponentServiceObjects;
	}

	public static void setUserAccountResourceComponentServiceObjects(
		ComponentServiceObjects<UserAccountResource>
			userAccountResourceComponentServiceObjects) {

		_userAccountResourceComponentServiceObjects =
			userAccountResourceComponentServiceObjects;
	}

	public static void setWebUrlResourceComponentServiceObjects(
		ComponentServiceObjects<WebUrlResource>
			webUrlResourceComponentServiceObjects) {

		_webUrlResourceComponentServiceObjects =
			webUrlResourceComponentServiceObjects;
	}

	@GraphQLField
	@GraphQLInvokeDetached
	public Email getEmail(Long emailId) throws Exception {
		return _applyComponentServiceObjects(
			_emailResourceComponentServiceObjects,
			this::_populateResourceContext,
			emailResource -> emailResource.getEmail(emailId));
	}

	@GraphQLField
	@GraphQLInvokeDetached
	public Collection<Email> getOrganizationEmailsPage(Long organizationId)
		throws Exception {

		return _applyComponentServiceObjects(
			_emailResourceComponentServiceObjects,
			this::_populateResourceContext,
			emailResource -> {
				Page paginationPage = emailResource.getOrganizationEmailsPage(
					organizationId);

				return paginationPage.getItems();
			});
	}

	@GraphQLField
	@GraphQLInvokeDetached
	public Collection<Email> getUserAccountEmailsPage(Long userAccountId)
		throws Exception {

		return _applyComponentServiceObjects(
			_emailResourceComponentServiceObjects,
			this::_populateResourceContext,
			emailResource -> {
				Page paginationPage = emailResource.getUserAccountEmailsPage(
					userAccountId);

				return paginationPage.getItems();
			});
	}

	@GraphQLField
	@GraphQLInvokeDetached
	public Collection<Keyword> getContentSpaceKeywordsPage(
			Long contentSpaceId, String search, Filter filter, int pageSize,
			int page, Sort[] sorts)
		throws Exception {

		return _applyComponentServiceObjects(
			_keywordResourceComponentServiceObjects,
			this::_populateResourceContext,
			keywordResource -> {
				Page paginationPage =
					keywordResource.getContentSpaceKeywordsPage(
						contentSpaceId, search, filter,
						Pagination.of(pageSize, page), sorts);

				return paginationPage.getItems();
			});
	}

	@GraphQLField
	@GraphQLInvokeDetached
	public Keyword getKeyword(Long keywordId) throws Exception {
		return _applyComponentServiceObjects(
			_keywordResourceComponentServiceObjects,
			this::_populateResourceContext,
			keywordResource -> keywordResource.getKeyword(keywordId));
	}

	@GraphQLField
	@GraphQLInvokeDetached
	public Collection<Organization> getMyUserAccountOrganizationsPage(
			Long userAccountId, int pageSize, int page)
		throws Exception {

		return _applyComponentServiceObjects(
			_organizationResourceComponentServiceObjects,
			this::_populateResourceContext,
			organizationResource -> {
				Page paginationPage =
					organizationResource.getMyUserAccountOrganizationsPage(
						userAccountId, Pagination.of(pageSize, page));

				return paginationPage.getItems();
			});
	}

	@GraphQLField
	@GraphQLInvokeDetached
	public Collection<Organization> getOrganizationsPage(
			String search, Filter filter, int pageSize, int page, Sort[] sorts)
		throws Exception {

		return _applyComponentServiceObjects(
			_organizationResourceComponentServiceObjects,
			this::_populateResourceContext,
			organizationResource -> {
				Page paginationPage = organizationResource.getOrganizationsPage(
					search, filter, Pagination.of(pageSize, page), sorts);

				return paginationPage.getItems();
			});
	}

	@GraphQLField
	@GraphQLInvokeDetached
	public Organization getOrganization(Long organizationId) throws Exception {
		return _applyComponentServiceObjects(
			_organizationResourceComponentServiceObjects,
			this::_populateResourceContext,
			organizationResource -> organizationResource.getOrganization(
				organizationId));
	}

	@GraphQLField
	@GraphQLInvokeDetached
	public Collection<Organization> getOrganizationOrganizationsPage(
			Long parentOrganizationId, String search, Filter filter,
			int pageSize, int page, Sort[] sorts)
		throws Exception {

		return _applyComponentServiceObjects(
			_organizationResourceComponentServiceObjects,
			this::_populateResourceContext,
			organizationResource -> {
				Page paginationPage =
					organizationResource.getOrganizationOrganizationsPage(
						parentOrganizationId, search, filter,
						Pagination.of(pageSize, page), sorts);

				return paginationPage.getItems();
			});
	}

	@GraphQLField
	@GraphQLInvokeDetached
	public Collection<Organization> getUserAccountOrganizationsPage(
			Long userAccountId, int pageSize, int page)
		throws Exception {

		return _applyComponentServiceObjects(
			_organizationResourceComponentServiceObjects,
			this::_populateResourceContext,
			organizationResource -> {
				Page paginationPage =
					organizationResource.getUserAccountOrganizationsPage(
						userAccountId, Pagination.of(pageSize, page));

				return paginationPage.getItems();
			});
	}

	@GraphQLField
	@GraphQLInvokeDetached
	public Collection<Phone> getOrganizationPhonesPage(
			Long organizationId, int pageSize, int page)
		throws Exception {

		return _applyComponentServiceObjects(
			_phoneResourceComponentServiceObjects,
			this::_populateResourceContext,
			phoneResource -> {
				Page paginationPage = phoneResource.getOrganizationPhonesPage(
					organizationId, Pagination.of(pageSize, page));

				return paginationPage.getItems();
			});
	}

	@GraphQLField
	@GraphQLInvokeDetached
	public Phone getPhone(Long phoneId) throws Exception {
		return _applyComponentServiceObjects(
			_phoneResourceComponentServiceObjects,
			this::_populateResourceContext,
			phoneResource -> phoneResource.getPhone(phoneId));
	}

	@GraphQLField
	@GraphQLInvokeDetached
	public Collection<Phone> getUserAccountPhonesPage(
			Long userAccountId, int pageSize, int page)
		throws Exception {

		return _applyComponentServiceObjects(
			_phoneResourceComponentServiceObjects,
			this::_populateResourceContext,
			phoneResource -> {
				Page paginationPage = phoneResource.getUserAccountPhonesPage(
					userAccountId, Pagination.of(pageSize, page));

				return paginationPage.getItems();
			});
	}

	@GraphQLField
	@GraphQLInvokeDetached
	public Collection<PostalAddress> getOrganizationPostalAddressesPage(
			Long organizationId, int pageSize, int page)
		throws Exception {

		return _applyComponentServiceObjects(
			_postalAddressResourceComponentServiceObjects,
			this::_populateResourceContext,
			postalAddressResource -> {
				Page paginationPage =
					postalAddressResource.getOrganizationPostalAddressesPage(
						organizationId, Pagination.of(pageSize, page));

				return paginationPage.getItems();
			});
	}

	@GraphQLField
	@GraphQLInvokeDetached
	public PostalAddress getPostalAddress(Long postalAddressId)
		throws Exception {

		return _applyComponentServiceObjects(
			_postalAddressResourceComponentServiceObjects,
			this::_populateResourceContext,
			postalAddressResource -> postalAddressResource.getPostalAddress(
				postalAddressId));
	}

	@GraphQLField
	@GraphQLInvokeDetached
	public Collection<PostalAddress> getUserAccountPostalAddressesPage(
			Long userAccountId, int pageSize, int page)
		throws Exception {

		return _applyComponentServiceObjects(
			_postalAddressResourceComponentServiceObjects,
			this::_populateResourceContext,
			postalAddressResource -> {
				Page paginationPage =
					postalAddressResource.getUserAccountPostalAddressesPage(
						userAccountId, Pagination.of(pageSize, page));

				return paginationPage.getItems();
			});
	}

	@GraphQLField
	@GraphQLInvokeDetached
	public Collection<Role> getMyUserAccountRolesPage(
			Long userAccountId, int pageSize, int page)
		throws Exception {

		return _applyComponentServiceObjects(
			_roleResourceComponentServiceObjects,
			this::_populateResourceContext,
			roleResource -> {
				Page paginationPage = roleResource.getMyUserAccountRolesPage(
					userAccountId, Pagination.of(pageSize, page));

				return paginationPage.getItems();
			});
	}

	@GraphQLField
	@GraphQLInvokeDetached
	public Collection<Role> getRolesPage(int pageSize, int page)
		throws Exception {

		return _applyComponentServiceObjects(
			_roleResourceComponentServiceObjects,
			this::_populateResourceContext,
			roleResource -> {
				Page paginationPage = roleResource.getRolesPage(
					Pagination.of(pageSize, page));

				return paginationPage.getItems();
			});
	}

	@GraphQLField
	@GraphQLInvokeDetached
	public Role getRole(Long roleId) throws Exception {
		return _applyComponentServiceObjects(
			_roleResourceComponentServiceObjects,
			this::_populateResourceContext,
			roleResource -> roleResource.getRole(roleId));
	}

	@GraphQLField
	@GraphQLInvokeDetached
	public Collection<Role> getUserAccountRolesPage(
			Long userAccountId, int pageSize, int page)
		throws Exception {

		return _applyComponentServiceObjects(
			_roleResourceComponentServiceObjects,
			this::_populateResourceContext,
			roleResource -> {
				Page paginationPage = roleResource.getUserAccountRolesPage(
					userAccountId, Pagination.of(pageSize, page));

				return paginationPage.getItems();
			});
	}

	@GraphQLField
	@GraphQLInvokeDetached
	public Collection<Segment> getContentSpaceSegmentsPage(
			Long contentSpaceId, int pageSize, int page)
		throws Exception {

		return _applyComponentServiceObjects(
			_segmentResourceComponentServiceObjects,
			this::_populateResourceContext,
			segmentResource -> {
				Page paginationPage =
					segmentResource.getContentSpaceSegmentsPage(
						contentSpaceId, Pagination.of(pageSize, page));

				return paginationPage.getItems();
			});
	}

	@GraphQLField
	@GraphQLInvokeDetached
	public Collection<Segment> getContentSpaceUserAccountSegmentsPage(
			Long contentSpaceId, Long userAccountId, int pageSize, int page)
		throws Exception {

		return _applyComponentServiceObjects(
			_segmentResourceComponentServiceObjects,
			this::_populateResourceContext,
			segmentResource -> {
				Page paginationPage =
					segmentResource.getContentSpaceUserAccountSegmentsPage(
						contentSpaceId, userAccountId,
						Pagination.of(pageSize, page));

				return paginationPage.getItems();
			});
	}

	@GraphQLField
	@GraphQLInvokeDetached
	public Collection<SegmentUser> getSegmentUserAccountsPage(
			Long segmentId, int pageSize, int page)
		throws Exception {

		return _applyComponentServiceObjects(
			_segmentUserResourceComponentServiceObjects,
			this::_populateResourceContext,
			segmentUserResource -> {
				Page paginationPage =
					segmentUserResource.getSegmentUserAccountsPage(
						segmentId, Pagination.of(pageSize, page));

				return paginationPage.getItems();
			});
	}

	@GraphQLField
	@GraphQLInvokeDetached
	public Collection<TaxonomyCategory>
			getTaxonomyCategoryTaxonomyCategoriesPage(
				Long parentTaxonomyCategoryId, String search, Filter filter,
				int pageSize, int page, Sort[] sorts)
		throws Exception {

		return _applyComponentServiceObjects(
			_taxonomyCategoryResourceComponentServiceObjects,
			this::_populateResourceContext,
			taxonomyCategoryResource -> {
				Page paginationPage =
					taxonomyCategoryResource.
						getTaxonomyCategoryTaxonomyCategoriesPage(
							parentTaxonomyCategoryId, search, filter,
							Pagination.of(pageSize, page), sorts);

				return paginationPage.getItems();
			});
	}

	@GraphQLField
	@GraphQLInvokeDetached
	public TaxonomyCategory getTaxonomyCategory(Long taxonomyCategoryId)
		throws Exception {

		return _applyComponentServiceObjects(
			_taxonomyCategoryResourceComponentServiceObjects,
			this::_populateResourceContext,
			taxonomyCategoryResource ->
				taxonomyCategoryResource.getTaxonomyCategory(
					taxonomyCategoryId));
	}

	@GraphQLField
	@GraphQLInvokeDetached
	public Collection<TaxonomyCategory>
			getTaxonomyVocabularyTaxonomyCategoriesPage(
				Long taxonomyVocabularyId, String search, Filter filter,
				int pageSize, int page, Sort[] sorts)
		throws Exception {

		return _applyComponentServiceObjects(
			_taxonomyCategoryResourceComponentServiceObjects,
			this::_populateResourceContext,
			taxonomyCategoryResource -> {
				Page paginationPage =
					taxonomyCategoryResource.
						getTaxonomyVocabularyTaxonomyCategoriesPage(
							taxonomyVocabularyId, search, filter,
							Pagination.of(pageSize, page), sorts);

				return paginationPage.getItems();
			});
	}

	@GraphQLField
	@GraphQLInvokeDetached
	public Collection<TaxonomyVocabulary>
			getContentSpaceTaxonomyVocabulariesPage(
				Long contentSpaceId, String search, Filter filter, int pageSize,
				int page, Sort[] sorts)
		throws Exception {

		return _applyComponentServiceObjects(
			_taxonomyVocabularyResourceComponentServiceObjects,
			this::_populateResourceContext,
			taxonomyVocabularyResource -> {
				Page paginationPage =
					taxonomyVocabularyResource.
						getContentSpaceTaxonomyVocabulariesPage(
							contentSpaceId, search, filter,
							Pagination.of(pageSize, page), sorts);

				return paginationPage.getItems();
			});
	}

	@GraphQLField
	@GraphQLInvokeDetached
	public TaxonomyVocabulary getTaxonomyVocabulary(Long taxonomyVocabularyId)
		throws Exception {

		return _applyComponentServiceObjects(
			_taxonomyVocabularyResourceComponentServiceObjects,
			this::_populateResourceContext,
			taxonomyVocabularyResource ->
				taxonomyVocabularyResource.getTaxonomyVocabulary(
					taxonomyVocabularyId));
	}

	@GraphQLField
	@GraphQLInvokeDetached
	public UserAccount getMyUserAccount(Long userAccountId) throws Exception {
		return _applyComponentServiceObjects(
			_userAccountResourceComponentServiceObjects,
			this::_populateResourceContext,
			userAccountResource -> userAccountResource.getMyUserAccount(
				userAccountId));
	}

	@GraphQLField
	@GraphQLInvokeDetached
	public Collection<UserAccount> getOrganizationUserAccountsPage(
			Long organizationId, String search, Filter filter, int pageSize,
			int page, Sort[] sorts)
		throws Exception {

		return _applyComponentServiceObjects(
			_userAccountResourceComponentServiceObjects,
			this::_populateResourceContext,
			userAccountResource -> {
				Page paginationPage =
					userAccountResource.getOrganizationUserAccountsPage(
						organizationId, search, filter,
						Pagination.of(pageSize, page), sorts);

				return paginationPage.getItems();
			});
	}

	@GraphQLField
	@GraphQLInvokeDetached
	public Collection<UserAccount> getUserAccountsPage(
			String search, Filter filter, int pageSize, int page, Sort[] sorts)
		throws Exception {

		return _applyComponentServiceObjects(
			_userAccountResourceComponentServiceObjects,
			this::_populateResourceContext,
			userAccountResource -> {
				Page paginationPage = userAccountResource.getUserAccountsPage(
					search, filter, Pagination.of(pageSize, page), sorts);

				return paginationPage.getItems();
			});
	}

	@GraphQLField
	@GraphQLInvokeDetached
	public UserAccount getUserAccount(Long userAccountId) throws Exception {
		return _applyComponentServiceObjects(
			_userAccountResourceComponentServiceObjects,
			this::_populateResourceContext,
			userAccountResource -> userAccountResource.getUserAccount(
				userAccountId));
	}

	@GraphQLField
	@GraphQLInvokeDetached
	public Collection<UserAccount> getWebSiteUserAccountsPage(
			Long webSiteId, String search, Filter filter, int pageSize,
			int page, Sort[] sorts)
		throws Exception {

		return _applyComponentServiceObjects(
			_userAccountResourceComponentServiceObjects,
			this::_populateResourceContext,
			userAccountResource -> {
				Page paginationPage =
					userAccountResource.getWebSiteUserAccountsPage(
						webSiteId, search, filter,
						Pagination.of(pageSize, page), sorts);

				return paginationPage.getItems();
			});
	}

	@GraphQLField
	@GraphQLInvokeDetached
	public Collection<WebUrl> getOrganizationWebUrlsPage(
			Long organizationId, int pageSize, int page)
		throws Exception {

		return _applyComponentServiceObjects(
			_webUrlResourceComponentServiceObjects,
			this::_populateResourceContext,
			webUrlResource -> {
				Page paginationPage = webUrlResource.getOrganizationWebUrlsPage(
					organizationId, Pagination.of(pageSize, page));

				return paginationPage.getItems();
			});
	}

	@GraphQLField
	@GraphQLInvokeDetached
	public Collection<WebUrl> getUserAccountWebUrlsPage(
			Long userAccountId, int pageSize, int page)
		throws Exception {

		return _applyComponentServiceObjects(
			_webUrlResourceComponentServiceObjects,
			this::_populateResourceContext,
			webUrlResource -> {
				Page paginationPage = webUrlResource.getUserAccountWebUrlsPage(
					userAccountId, Pagination.of(pageSize, page));

				return paginationPage.getItems();
			});
	}

	@GraphQLField
	@GraphQLInvokeDetached
	public WebUrl getWebUrl(Long webUrlId) throws Exception {
		return _applyComponentServiceObjects(
			_webUrlResourceComponentServiceObjects,
			this::_populateResourceContext,
			webUrlResource -> webUrlResource.getWebUrl(webUrlId));
	}

	private <T, R, E1 extends Throwable, E2 extends Throwable> R
			_applyComponentServiceObjects(
				ComponentServiceObjects<T> componentServiceObjects,
				UnsafeConsumer<T, E1> unsafeConsumer,
				UnsafeFunction<T, R, E2> unsafeFunction)
		throws E1, E2 {

		T resource = componentServiceObjects.getService();

		try {
			unsafeConsumer.accept(resource);

			return unsafeFunction.apply(resource);
		}
		finally {
			componentServiceObjects.ungetService(resource);
		}
	}

	private void _populateResourceContext(EmailResource emailResource)
		throws Exception {

		emailResource.setContextCompany(
			CompanyLocalServiceUtil.getCompany(
				CompanyThreadLocal.getCompanyId()));
	}

	private void _populateResourceContext(KeywordResource keywordResource)
		throws Exception {

		keywordResource.setContextCompany(
			CompanyLocalServiceUtil.getCompany(
				CompanyThreadLocal.getCompanyId()));
	}

	private void _populateResourceContext(
			OrganizationResource organizationResource)
		throws Exception {

		organizationResource.setContextCompany(
			CompanyLocalServiceUtil.getCompany(
				CompanyThreadLocal.getCompanyId()));
	}

	private void _populateResourceContext(PhoneResource phoneResource)
		throws Exception {

		phoneResource.setContextCompany(
			CompanyLocalServiceUtil.getCompany(
				CompanyThreadLocal.getCompanyId()));
	}

	private void _populateResourceContext(
			PostalAddressResource postalAddressResource)
		throws Exception {

		postalAddressResource.setContextCompany(
			CompanyLocalServiceUtil.getCompany(
				CompanyThreadLocal.getCompanyId()));
	}

	private void _populateResourceContext(RoleResource roleResource)
		throws Exception {

		roleResource.setContextCompany(
			CompanyLocalServiceUtil.getCompany(
				CompanyThreadLocal.getCompanyId()));
	}

	private void _populateResourceContext(SegmentResource segmentResource)
		throws Exception {

		segmentResource.setContextCompany(
			CompanyLocalServiceUtil.getCompany(
				CompanyThreadLocal.getCompanyId()));
	}

	private void _populateResourceContext(
			SegmentUserResource segmentUserResource)
		throws Exception {

		segmentUserResource.setContextCompany(
			CompanyLocalServiceUtil.getCompany(
				CompanyThreadLocal.getCompanyId()));
	}

	private void _populateResourceContext(
			TaxonomyCategoryResource taxonomyCategoryResource)
		throws Exception {

		taxonomyCategoryResource.setContextCompany(
			CompanyLocalServiceUtil.getCompany(
				CompanyThreadLocal.getCompanyId()));
	}

	private void _populateResourceContext(
			TaxonomyVocabularyResource taxonomyVocabularyResource)
		throws Exception {

		taxonomyVocabularyResource.setContextCompany(
			CompanyLocalServiceUtil.getCompany(
				CompanyThreadLocal.getCompanyId()));
	}

	private void _populateResourceContext(
			UserAccountResource userAccountResource)
		throws Exception {

		userAccountResource.setContextCompany(
			CompanyLocalServiceUtil.getCompany(
				CompanyThreadLocal.getCompanyId()));
	}

	private void _populateResourceContext(WebUrlResource webUrlResource)
		throws Exception {

		webUrlResource.setContextCompany(
			CompanyLocalServiceUtil.getCompany(
				CompanyThreadLocal.getCompanyId()));
	}

	private static ComponentServiceObjects<EmailResource>
		_emailResourceComponentServiceObjects;
	private static ComponentServiceObjects<KeywordResource>
		_keywordResourceComponentServiceObjects;
	private static ComponentServiceObjects<OrganizationResource>
		_organizationResourceComponentServiceObjects;
	private static ComponentServiceObjects<PhoneResource>
		_phoneResourceComponentServiceObjects;
	private static ComponentServiceObjects<PostalAddressResource>
		_postalAddressResourceComponentServiceObjects;
	private static ComponentServiceObjects<RoleResource>
		_roleResourceComponentServiceObjects;
	private static ComponentServiceObjects<SegmentResource>
		_segmentResourceComponentServiceObjects;
	private static ComponentServiceObjects<SegmentUserResource>
		_segmentUserResourceComponentServiceObjects;
	private static ComponentServiceObjects<TaxonomyCategoryResource>
		_taxonomyCategoryResourceComponentServiceObjects;
	private static ComponentServiceObjects<TaxonomyVocabularyResource>
		_taxonomyVocabularyResourceComponentServiceObjects;
	private static ComponentServiceObjects<UserAccountResource>
		_userAccountResourceComponentServiceObjects;
	private static ComponentServiceObjects<WebUrlResource>
		_webUrlResourceComponentServiceObjects;

}