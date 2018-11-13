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

package coverage.test.util;

/**
Some times, our code has to call static methods that are too hard to setup
what leave us with two choices: Forget about the unit test and create an
integration one or Mock the static call with power mock.

Both solutions have a direct impact in test perfomance or code coverage report.

For Example, ResourceBundleUtil is too hard to setup so we need to (Power)
mock it when testing code that calls it.

@author Jeyvison Nascimento
 */
public class VeryHardToSetupUtilClass {

	public static int staticReturnsIntegerValue() {
		return 1;
	}

}