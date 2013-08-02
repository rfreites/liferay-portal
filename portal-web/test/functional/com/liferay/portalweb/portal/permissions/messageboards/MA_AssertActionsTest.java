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

package com.liferay.portalweb.portal.permissions.messageboards;

import com.liferay.portalweb.portal.BaseTestCase;
import com.liferay.portalweb.portal.util.RuntimeVariables;

/**
 * @author Brian Wing Shun Chan
 */
public class MA_AssertActionsTest extends BaseTestCase {
	public void testMA_AssertActions() throws Exception {
		selenium.selectWindow("null");
		selenium.selectFrame("relative=top");
		selenium.open("/web/site-name/");
		selenium.clickAt("link=Message Boards Test Page",
			RuntimeVariables.replace("Message Boards Test Page"));
		selenium.waitForPageToLoad("30000");
		Thread.sleep(1000);
		assertTrue(selenium.isVisible("//input[@title='Search Messages']"));
		assertTrue(selenium.isVisible("//input[@value='Search']"));
		assertEquals(RuntimeVariables.replace("RSS"),
			selenium.getText(
				"//div[@class='category-subscription-types']/span/a/span[contains(.,'RSS')]"));
		assertEquals(RuntimeVariables.replace("Subscribe"),
			selenium.getText(
				"//div[@class='category-subscription-types']/span/a/span[contains(.,'Subscribe')]"));
		assertTrue(selenium.isVisible("//input[@value='Add Category']"));
		assertTrue(selenium.isVisible("//input[@value='Post New Thread']"));
		assertTrue(selenium.isVisible("//input[@value='Permissions']"));
		assertEquals(RuntimeVariables.replace("MB Category Name"),
			selenium.getText("//tr[contains(.,'MB Category Name')]/td[1]/a"));
		assertEquals(RuntimeVariables.replace("0"),
			selenium.getText("//tr[contains(.,'MB Category Name')]/td[2]"));
		assertEquals(RuntimeVariables.replace("1"),
			selenium.getText("//tr[contains(.,'MB Category Name')]/td[3]"));
		assertEquals(RuntimeVariables.replace("1"),
			selenium.getText("//tr[contains(.,'MB Category Name')]/td[4]"));
		assertEquals(RuntimeVariables.replace("Actions"),
			selenium.getText(
				"//tr[contains(.,'MB Category Name')]/td[5]/span[@title='Actions']/ul/li/strong/a"));
		selenium.clickAt("//tr[contains(.,'MB Category Name')]/td[5]/span[@title='Actions']/ul/li/strong/a",
			RuntimeVariables.replace("Actions"));
		selenium.waitForVisible(
			"//div[@class='lfr-component lfr-menu-list']/ul/li/a[contains(.,'Edit')]");
		assertEquals(RuntimeVariables.replace("Edit"),
			selenium.getText(
				"//div[@class='lfr-component lfr-menu-list']/ul/li/a[contains(.,'Edit')]"));
		assertEquals(RuntimeVariables.replace("Permissions"),
			selenium.getText(
				"//div[@class='lfr-component lfr-menu-list']/ul/li/a[contains(.,'Permissions')]"));
		assertEquals(RuntimeVariables.replace("RSS (Opens New Window)"),
			selenium.getText(
				"//div[@class='lfr-component lfr-menu-list']/ul/li/a[contains(.,'RSS')]"));
		assertEquals(RuntimeVariables.replace("Subscribe"),
			selenium.getText(
				"//div[@class='lfr-component lfr-menu-list']/ul/li/a[contains(.,'Subscribe')]"));
		assertEquals(RuntimeVariables.replace("Delete"),
			selenium.getText(
				"//div[@class='lfr-component lfr-menu-list']/ul/li/a[contains(.,'Delete')]"));
		selenium.clickAt("//div[@class='lfr-component lfr-menu-list']/ul/li/a[contains(.,'Edit')]",
			RuntimeVariables.replace("Edit"));
		selenium.waitForPageToLoad("30000");
		assertTrue(selenium.isVisible("//input[@id='_19_name']"));
		assertEquals("MB Category Name",
			selenium.getValue("//input[@id='_19_name']"));
		assertTrue(selenium.isVisible("//textarea[@id='_19_description']"));
		assertEquals("", selenium.getValue("//textarea[@id='_19_description']"));
		selenium.open("/web/site-name/");
		selenium.clickAt("link=Message Boards Test Page",
			RuntimeVariables.replace("Message Boards Test Page"));
		selenium.waitForPageToLoad("30000");
		Thread.sleep(1000);
		assertEquals(RuntimeVariables.replace("Actions"),
			selenium.getText(
				"//tr[contains(.,'MB Category Name')]/td[5]/span[@title='Actions']/ul/li/strong/a"));
		selenium.clickAt("//tr[contains(.,'MB Category Name')]/td[5]/span[@title='Actions']/ul/li/strong/a",
			RuntimeVariables.replace("Actions"));
		selenium.waitForVisible(
			"//div[@class='lfr-component lfr-menu-list']/ul/li[contains(.,'Permissions')]/a");
		assertEquals(RuntimeVariables.replace("Permissions"),
			selenium.getText(
				"//div[@class='lfr-component lfr-menu-list']/ul/li[contains(.,'Permissions')]/a"));
		selenium.clickAt("//div[@class='lfr-component lfr-menu-list']/ul/li[contains(.,'Permissions')]/a",
			RuntimeVariables.replace("Permissions"));
		selenium.waitForPageToLoad("30000");
		assertEquals(RuntimeVariables.replace("MB Category Name"),
			selenium.getText("//h1[@class='header-title']/span"));
		assertTrue(selenium.isVisible("//input[@value='Save']"));
		selenium.open("/web/site-name/");
		selenium.clickAt("link=Message Boards Test Page",
			RuntimeVariables.replace("Message Boards Test Page"));
		selenium.waitForPageToLoad("30000");
		assertEquals(RuntimeVariables.replace("Banned Users"),
			selenium.getText(
				"//ul[@class='top-links-navigation']/li[contains(.,'Banned Users')]/span/a"));
		selenium.clickAt("//ul[@class='top-links-navigation']/li[contains(.,'Banned Users')]/span/a",
			RuntimeVariables.replace("Banned Users"));
		selenium.waitForPageToLoad("30000");
		assertEquals(RuntimeVariables.replace("There are no banned users."),
			selenium.getText("//div[@class='portlet-msg-info']"));
		selenium.clickAt("//ul[@class='top-links-navigation']/li/span/a/span",
			RuntimeVariables.replace("Message Boards Home"));
		selenium.waitForPageToLoad("30000");
		assertEquals(RuntimeVariables.replace("MB Category Name"),
			selenium.getText("//tr[contains(.,'MB Category Name')]/td[1]/a"));
		selenium.clickAt("//tr[contains(.,'MB Category Name')]/td[1]/a",
			RuntimeVariables.replace("MB Category Name"));
		selenium.waitForPageToLoad("30000");
		Thread.sleep(1000);
		assertTrue(selenium.isVisible("//input[@title='Search Messages']"));
		assertTrue(selenium.isVisible("//input[@value='Search']"));
		assertTrue(selenium.isVisible("//input[@value='Add Subcategory']"));
		assertTrue(selenium.isVisible("//input[@value='Post New Thread']"));
		assertTrue(selenium.isVisible("//input[@value='Permissions']"));
		assertEquals(RuntimeVariables.replace(
				"\u00ab Back to Message Boards Home"),
			selenium.getText("//span[@class='header-back-to']/a"));
		assertEquals(RuntimeVariables.replace("MB Category Name"),
			selenium.getText("//h1[@class='header-title']"));
		assertEquals(RuntimeVariables.replace("MB Thread Message Subject"),
			selenium.getText(
				"//tr[contains(.,'MB Thread Message Subject')]/td[1]/a"));
		assertTrue(selenium.isVisible(
				"//tr[contains(.,'MB Thread Message Subject')]/td[2]"));
		assertEquals(RuntimeVariables.replace("MA Liferay"),
			selenium.getText(
				"//tr[contains(.,'MB Thread Message Subject')]/td[3]"));
		assertEquals(RuntimeVariables.replace("1"),
			selenium.getText(
				"//tr[contains(.,'MB Thread Message Subject')]/td[4]"));
		assertEquals(RuntimeVariables.replace("1"),
			selenium.getText(
				"//tr[contains(.,'MB Thread Message Subject')]/td[5]"));
		assertTrue(selenium.isVisible(
				"//tr[contains(.,'MB Thread Message Subject')]/td[6]"));
		assertEquals(RuntimeVariables.replace("Actions"),
			selenium.getText(
				"//tr[contains(.,'MB Thread Message Subject')]/td[7]/span[@title='Actions']/ul/li/strong/a"));
		selenium.clickAt("//tr[contains(.,'MB Thread Message Subject')]/td[7]/span[@title='Actions']/ul/li/strong/a",
			RuntimeVariables.replace("Actions"));
		selenium.waitForVisible(
			"//div[@class='lfr-component lfr-menu-list']/ul/li/a[contains(.,'Edit')]");
		assertEquals(RuntimeVariables.replace("Edit"),
			selenium.getText(
				"//div[@class='lfr-component lfr-menu-list']/ul/li/a[contains(.,'Edit')]"));
		assertEquals(RuntimeVariables.replace("Permissions"),
			selenium.getText(
				"//div[@class='lfr-component lfr-menu-list']/ul/li/a[contains(.,'Permissions')]"));
		assertEquals(RuntimeVariables.replace("Unsubscribe"),
			selenium.getText(
				"//div[@class='lfr-component lfr-menu-list']/ul/li/a[contains(.,'Unsubscribe')]"));
		assertEquals(RuntimeVariables.replace("Lock Thread"),
			selenium.getText(
				"//div[@class='lfr-component lfr-menu-list']/ul/li/a[contains(.,'Lock Thread')]"));
		assertEquals(RuntimeVariables.replace("Move Thread"),
			selenium.getText(
				"//div[@class='lfr-component lfr-menu-list']/ul/li/a[contains(.,'Move Thread')]"));
		assertEquals(RuntimeVariables.replace("Delete"),
			selenium.getText(
				"//div[@class='lfr-component lfr-menu-list']/ul/li/a[contains(.,'Delete')]"));
		selenium.clickAt("//tr[contains(.,'MB Thread Message Subject')]/td[1]/a",
			RuntimeVariables.replace("MB Thread Message Subject"));
		selenium.waitForPageToLoad("30000");
		assertEquals(RuntimeVariables.replace("MB Thread Message Subject"),
			selenium.getText("//h1[@class='header-title']"));
		assertEquals(RuntimeVariables.replace("Post New Thread"),
			selenium.getText(
				"//div[@class='thread-actions']/table/tbody/tr/td/span/a[contains(.,'Post New Thread')]"));
		assertEquals(RuntimeVariables.replace("Unsubscribe"),
			selenium.getText(
				"//div[@class='thread-actions']/table/tbody/tr/td/span/a[contains(.,'Unsubscribe')]"));
		assertEquals(RuntimeVariables.replace("Lock Thread"),
			selenium.getText(
				"//div[@class='thread-actions']/table/tbody/tr/td/span/a[contains(.,'Lock Thread')]"));
		assertEquals(RuntimeVariables.replace("Move Thread"),
			selenium.getText(
				"//div[@class='thread-actions']/table/tbody/tr/td/span/a[contains(.,'Move Thread')]"));
		assertEquals(RuntimeVariables.replace("Reply"),
			selenium.getText(
				"//ul[@class='edit-controls lfr-component']/li[2]/span/a"));
		assertEquals(RuntimeVariables.replace("Reply with Quote"),
			selenium.getText(
				"//ul[@class='edit-controls lfr-component']/li[3]/span/a"));
		assertEquals(RuntimeVariables.replace("Quick Reply"),
			selenium.getText(
				"//ul[@class='edit-controls lfr-component']/li[4]/span/a"));
		assertEquals(RuntimeVariables.replace("Edit"),
			selenium.getText(
				"//ul[@class='edit-controls lfr-component']/li/span/a[contains(.,'Edit')]"));
		assertEquals(RuntimeVariables.replace("Delete"),
			selenium.getText(
				"//ul[@class='edit-controls lfr-component']/li/span/a[contains(.,'Delete')]"));
	}
}