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

package com.liferay.portalweb.demo.useradmin.usermanagementorganizations;

import com.liferay.portalweb.portal.BaseTestCase;
import com.liferay.portalweb.portal.util.RuntimeVariables;

/**
 * @author Brian Wing Shun Chan
 */
public class AddUserTest extends BaseTestCase {
	public void testAddUser() throws Exception {
		selenium.selectWindow("null");
		selenium.selectFrame("relative=top");
		selenium.open("/web/guest/home/");
		selenium.waitForElementPresent("link=Control Panel");
		selenium.clickAt("link=Control Panel",
			RuntimeVariables.replace("Control Panel"));
		selenium.waitForPageToLoad("30000");
		selenium.clickAt("link=Users and Organizations",
			RuntimeVariables.replace("Users and Organizations"));
		selenium.waitForPageToLoad("30000");
		selenium.clickAt("link=Add", RuntimeVariables.replace("Add"));
		selenium.waitForVisible(
			"//div[@class='lfr-component lfr-menu-list']/ul/li/a");
		assertEquals(RuntimeVariables.replace("User"),
			selenium.getText(
				"//div[@class='lfr-component lfr-menu-list']/ul/li/a"));
		selenium.click(RuntimeVariables.replace(
				"//div[@class='lfr-component lfr-menu-list']/ul/li/a"));
		selenium.waitForPageToLoad("30000");
		selenium.select("//select[@id='_125_prefixId']",
			RuntimeVariables.replace("label=Mr."));
		selenium.type("//input[@id='_125_screenName']",
			RuntimeVariables.replace("selenium01"));
		selenium.type("//input[@id='_125_emailAddress']",
			RuntimeVariables.replace("liferay.qa.server.trunk2@gmail.com"));
		selenium.type("//input[@id='_125_firstName']",
			RuntimeVariables.replace("selen01"));
		selenium.type("//input[@id='_125_middleName']",
			RuntimeVariables.replace("lenn"));
		selenium.type("//input[@id='_125_lastName']",
			RuntimeVariables.replace("nium01"));
		selenium.select("//select[@id='_125_suffixId']",
			RuntimeVariables.replace("label=Phd."));
		selenium.select("//select[@id='_125_birthdaymonth']",
			RuntimeVariables.replace("label=April"));
		selenium.select("//select[@id='_125_birthdayday']",
			RuntimeVariables.replace("label=10"));
		selenium.select("//select[@id='_125_birthdayyear']",
			RuntimeVariables.replace("label=1986"));
		selenium.select("//select[@id='_125_male']",
			RuntimeVariables.replace("label=Male"));
		selenium.clickAt("//input[@value='Save']",
			RuntimeVariables.replace("Save"));
		selenium.waitForPageToLoad("30000");
		assertEquals(RuntimeVariables.replace(
				"Your request completed successfully."),
			selenium.getText("//div[@class='portlet-msg-success']"));
		assertEquals("selenium01",
			selenium.getValue("//input[@id='_125_screenName']"));
		assertEquals("liferay.qa.server.trunk2@gmail.com",
			selenium.getValue("//input[@id='_125_emailAddress']"));
		assertEquals("selen01",
			selenium.getValue("//input[@id='_125_firstName']"));
		assertEquals("lenn", selenium.getValue("//input[@id='_125_middleName']"));
		assertEquals("nium01", selenium.getValue("//input[@id='_125_lastName']"));
	}
}