/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
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

package com.liferay.portalweb.portal.dbupgrade.sampledata527.documentlibrary.documentlock;

import com.liferay.portalweb.portal.BaseTestCase;
import com.liferay.portalweb.portal.util.RuntimeVariables;

/**
 * @author Brian Wing Shun Chan
 */
public class AddDocumentTest extends BaseTestCase {
	public void testAddDocument() throws Exception {
		selenium.selectWindow("null");
		selenium.selectFrame("relative=top");
		selenium.open("/web/document-library-document-lock-community/");
		selenium.clickAt("link=Document Lock Page",
			RuntimeVariables.replace("Document Lock Page"));
		selenium.waitForPageToLoad("30000");
		assertEquals(RuntimeVariables.replace("Test1 Folder1"),
			selenium.getText("//b"));
		selenium.clickAt("//b", RuntimeVariables.replace("Test1 Folder1"));
		selenium.waitForPageToLoad("30000");
		selenium.clickAt("//input[@value='Add Document']",
			RuntimeVariables.replace("Add Document"));
		selenium.waitForPageToLoad("30000");
		selenium.waitForVisible("//a[@class='use-fallback using-new-uploader']");
		assertEquals(RuntimeVariables.replace("Use the classic uploader."),
			selenium.getText("//a[@class='use-fallback using-new-uploader']"));
		selenium.click("//a[@class='use-fallback using-new-uploader']");
		selenium.uploadCommonFile("//input[@id='_20_file']",
			RuntimeVariables.replace("Document_1.txt"));
		selenium.type("//input[@id='_20_title']",
			RuntimeVariables.replace("Test1 Document1"));
		selenium.type("//textarea[@id='_20_description']",
			RuntimeVariables.replace("This is Test1 Document1"));
		selenium.clickAt("//input[@value='Save']",
			RuntimeVariables.replace("Save"));
		selenium.waitForPageToLoad("30000");
		assertEquals(RuntimeVariables.replace(
				"Your request processed successfully."),
			selenium.getText("//div[@class='portlet-msg-success']"));
		assertTrue(selenium.isPartialText("//td[1]/a", "Test1 Document1.txt"));
		assertTrue(selenium.isPartialText("//td[1]/a", "This is Test1 Document1"));
		assertEquals(RuntimeVariables.replace("0.3k"),
			selenium.getText("//td[2]/a"));
		assertEquals(RuntimeVariables.replace("0"),
			selenium.getText("//td[3]/a"));
		assertEquals(RuntimeVariables.replace("No"),
			selenium.getText("//td[4]/a"));
	}
}