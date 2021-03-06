/**
 * Copyright (c) MuleSoft, Inc. All rights reserved. http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.md file.
 */

package org.mule.modules.hdfs.automation.testrunners;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;
import org.mule.modules.hdfs.automation.SmokeTests;
import org.mule.modules.hdfs.automation.testcases.*;

@RunWith(Categories.class)
@IncludeCategory(SmokeTests.class)
@SuiteClasses({
        AppendTestCases.class,
        DeleteFileTestCases.class,
        GetMetadataTestCases.class,
        MakeDirectoriesTestCases.class,
        ReadTestCases.class,
        WriteTestCases.class,
        DeleteDirectoryTestCases.class
})
public class SmokeTestSuite {
}
