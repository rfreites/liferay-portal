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

package com.liferay.portal.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the ClassName service. Represents a row in the &quot;ClassName_&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.portal.model.impl.ClassNameModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.portal.model.impl.ClassNameImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ClassName
 * @see com.liferay.portal.model.impl.ClassNameImpl
 * @see com.liferay.portal.model.impl.ClassNameModelImpl
 * @generated
 */
public interface ClassNameModel extends BaseModel<ClassName> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a class name model instance should use the {@link ClassName} interface instead.
	 */

	/**
	 * Returns the primary key of this class name.
	 *
	 * @return the primary key of this class name
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this class name.
	 *
	 * @param primaryKey the primary key of this class name
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the fully qualified class name of this class name.
	 *
	 * @return the fully qualified class name of this class name
	 */
	public String getClassName();

	public void setClassName(String className);

	/**
	 * Returns the class name ID of this class name.
	 *
	 * @return the class name ID of this class name
	 */
	public long getClassNameId();

	/**
	 * Sets the class name ID of this class name.
	 *
	 * @param classNameId the class name ID of this class name
	 */
	public void setClassNameId(long classNameId);

	/**
	 * Returns the value of this class name.
	 *
	 * @return the value of this class name
	 */
	@AutoEscape
	public String getValue();

	/**
	 * Sets the value of this class name.
	 *
	 * @param value the value of this class name
	 */
	public void setValue(String value);

	public boolean isNew();

	public void setNew(boolean n);

	public boolean isCachedModel();

	public void setCachedModel(boolean cachedModel);

	public boolean isEscapedModel();

	public Serializable getPrimaryKeyObj();

	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	public ExpandoBridge getExpandoBridge();

	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	public Object clone();

	public int compareTo(ClassName className);

	public int hashCode();

	public CacheModel<ClassName> toCacheModel();

	public ClassName toEscapedModel();

	public ClassName toUnescapedModel();

	public String toString();

	public String toXmlString();
}