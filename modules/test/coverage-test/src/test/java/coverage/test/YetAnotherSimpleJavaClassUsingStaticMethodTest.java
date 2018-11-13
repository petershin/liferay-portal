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

package coverage.test;

import coverage.test.util.VeryHardToSetupUtilClass;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

/**
 * @author Jeyvison Nascimento
 */
@PrepareForTest(VeryHardToSetupUtilClass.class)
@RunWith(PowerMockRunner.class)
public class YetAnotherSimpleJavaClassUsingStaticMethodTest {

	@Before
	public void setUp() throws Exception {
		PowerMockito.mockStatic(VeryHardToSetupUtilClass.class);

		PowerMockito.when(
			VeryHardToSetupUtilClass.staticReturnsIntegerValue()
		).thenReturn(
			2
		);
	}

	@Test
	public void testDoSameStuffCallingStaticCode() {
		YetAnotherSimpleJavaClassUsingStaticMethod
			anotherSimpleJavaClassUsingStaticMethod =
				new YetAnotherSimpleJavaClassUsingStaticMethod();

		Assert.assertEquals(
			12,
			anotherSimpleJavaClassUsingStaticMethod.
				doSameStuffCallingStaticCode());
	}

}