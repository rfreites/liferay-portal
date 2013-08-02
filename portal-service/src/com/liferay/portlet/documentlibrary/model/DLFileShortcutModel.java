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

package com.liferay.portlet.documentlibrary.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.GroupedModel;
import com.liferay.portal.model.WorkflowedModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the DLFileShortcut service. Represents a row in the &quot;DLFileShortcut&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.portlet.documentlibrary.model.impl.DLFileShortcutModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.portlet.documentlibrary.model.impl.DLFileShortcutImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DLFileShortcut
 * @see com.liferay.portlet.documentlibrary.model.impl.DLFileShortcutImpl
 * @see com.liferay.portlet.documentlibrary.model.impl.DLFileShortcutModelImpl
 * @generated
 */
public interface DLFileShortcutModel extends BaseModel<DLFileShortcut>,
	GroupedModel, WorkflowedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a document library file shortcut model instance should use the {@link DLFileShortcut} interface instead.
	 */

	/**
	 * Returns the primary key of this document library file shortcut.
	 *
	 * @return the primary key of this document library file shortcut
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this document library file shortcut.
	 *
	 * @param primaryKey the primary key of this document library file shortcut
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this document library file shortcut.
	 *
	 * @return the uuid of this document library file shortcut
	 */
	@AutoEscape
	public String getUuid();

	/**
	 * Sets the uuid of this document library file shortcut.
	 *
	 * @param uuid the uuid of this document library file shortcut
	 */
	public void setUuid(String uuid);

	/**
	 * Returns the file shortcut ID of this document library file shortcut.
	 *
	 * @return the file shortcut ID of this document library file shortcut
	 */
	public long getFileShortcutId();

	/**
	 * Sets the file shortcut ID of this document library file shortcut.
	 *
	 * @param fileShortcutId the file shortcut ID of this document library file shortcut
	 */
	public void setFileShortcutId(long fileShortcutId);

	/**
	 * Returns the group ID of this document library file shortcut.
	 *
	 * @return the group ID of this document library file shortcut
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this document library file shortcut.
	 *
	 * @param groupId the group ID of this document library file shortcut
	 */
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this document library file shortcut.
	 *
	 * @return the company ID of this document library file shortcut
	 */
	public long getCompanyId();

	/**
	 * Sets the company ID of this document library file shortcut.
	 *
	 * @param companyId the company ID of this document library file shortcut
	 */
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this document library file shortcut.
	 *
	 * @return the user ID of this document library file shortcut
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this document library file shortcut.
	 *
	 * @param userId the user ID of this document library file shortcut
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this document library file shortcut.
	 *
	 * @return the user uuid of this document library file shortcut
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this document library file shortcut.
	 *
	 * @param userUuid the user uuid of this document library file shortcut
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this document library file shortcut.
	 *
	 * @return the user name of this document library file shortcut
	 */
	@AutoEscape
	public String getUserName();

	/**
	 * Sets the user name of this document library file shortcut.
	 *
	 * @param userName the user name of this document library file shortcut
	 */
	public void setUserName(String userName);

	/**
	 * Returns the create date of this document library file shortcut.
	 *
	 * @return the create date of this document library file shortcut
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this document library file shortcut.
	 *
	 * @param createDate the create date of this document library file shortcut
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this document library file shortcut.
	 *
	 * @return the modified date of this document library file shortcut
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this document library file shortcut.
	 *
	 * @param modifiedDate the modified date of this document library file shortcut
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the repository ID of this document library file shortcut.
	 *
	 * @return the repository ID of this document library file shortcut
	 */
	public long getRepositoryId();

	/**
	 * Sets the repository ID of this document library file shortcut.
	 *
	 * @param repositoryId the repository ID of this document library file shortcut
	 */
	public void setRepositoryId(long repositoryId);

	/**
	 * Returns the folder ID of this document library file shortcut.
	 *
	 * @return the folder ID of this document library file shortcut
	 */
	public long getFolderId();

	/**
	 * Sets the folder ID of this document library file shortcut.
	 *
	 * @param folderId the folder ID of this document library file shortcut
	 */
	public void setFolderId(long folderId);

	/**
	 * Returns the to file entry ID of this document library file shortcut.
	 *
	 * @return the to file entry ID of this document library file shortcut
	 */
	public long getToFileEntryId();

	/**
	 * Sets the to file entry ID of this document library file shortcut.
	 *
	 * @param toFileEntryId the to file entry ID of this document library file shortcut
	 */
	public void setToFileEntryId(long toFileEntryId);

	/**
	 * Returns the status of this document library file shortcut.
	 *
	 * @return the status of this document library file shortcut
	 */
	public int getStatus();

	/**
	 * Sets the status of this document library file shortcut.
	 *
	 * @param status the status of this document library file shortcut
	 */
	public void setStatus(int status);

	/**
	 * Returns the status by user ID of this document library file shortcut.
	 *
	 * @return the status by user ID of this document library file shortcut
	 */
	public long getStatusByUserId();

	/**
	 * Sets the status by user ID of this document library file shortcut.
	 *
	 * @param statusByUserId the status by user ID of this document library file shortcut
	 */
	public void setStatusByUserId(long statusByUserId);

	/**
	 * Returns the status by user uuid of this document library file shortcut.
	 *
	 * @return the status by user uuid of this document library file shortcut
	 * @throws SystemException if a system exception occurred
	 */
	public String getStatusByUserUuid() throws SystemException;

	/**
	 * Sets the status by user uuid of this document library file shortcut.
	 *
	 * @param statusByUserUuid the status by user uuid of this document library file shortcut
	 */
	public void setStatusByUserUuid(String statusByUserUuid);

	/**
	 * Returns the status by user name of this document library file shortcut.
	 *
	 * @return the status by user name of this document library file shortcut
	 */
	@AutoEscape
	public String getStatusByUserName();

	/**
	 * Sets the status by user name of this document library file shortcut.
	 *
	 * @param statusByUserName the status by user name of this document library file shortcut
	 */
	public void setStatusByUserName(String statusByUserName);

	/**
	 * Returns the status date of this document library file shortcut.
	 *
	 * @return the status date of this document library file shortcut
	 */
	public Date getStatusDate();

	/**
	 * Sets the status date of this document library file shortcut.
	 *
	 * @param statusDate the status date of this document library file shortcut
	 */
	public void setStatusDate(Date statusDate);

	/**
	 * @deprecated Renamed to {@link #isApproved()}
	 */
	public boolean getApproved();

	/**
	 * Returns <code>true</code> if this document library file shortcut is approved.
	 *
	 * @return <code>true</code> if this document library file shortcut is approved; <code>false</code> otherwise
	 */
	public boolean isApproved();

	/**
	 * Returns <code>true</code> if this document library file shortcut is denied.
	 *
	 * @return <code>true</code> if this document library file shortcut is denied; <code>false</code> otherwise
	 */
	public boolean isDenied();

	/**
	 * Returns <code>true</code> if this document library file shortcut is a draft.
	 *
	 * @return <code>true</code> if this document library file shortcut is a draft; <code>false</code> otherwise
	 */
	public boolean isDraft();

	/**
	 * Returns <code>true</code> if this document library file shortcut is expired.
	 *
	 * @return <code>true</code> if this document library file shortcut is expired; <code>false</code> otherwise
	 */
	public boolean isExpired();

	/**
	 * Returns <code>true</code> if this document library file shortcut is inactive.
	 *
	 * @return <code>true</code> if this document library file shortcut is inactive; <code>false</code> otherwise
	 */
	public boolean isInactive();

	/**
	 * Returns <code>true</code> if this document library file shortcut is incomplete.
	 *
	 * @return <code>true</code> if this document library file shortcut is incomplete; <code>false</code> otherwise
	 */
	public boolean isIncomplete();

	/**
	 * Returns <code>true</code> if this document library file shortcut is pending.
	 *
	 * @return <code>true</code> if this document library file shortcut is pending; <code>false</code> otherwise
	 */
	public boolean isPending();

	/**
	 * Returns <code>true</code> if this document library file shortcut is scheduled.
	 *
	 * @return <code>true</code> if this document library file shortcut is scheduled; <code>false</code> otherwise
	 */
	public boolean isScheduled();

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

	public int compareTo(DLFileShortcut dlFileShortcut);

	public int hashCode();

	public CacheModel<DLFileShortcut> toCacheModel();

	public DLFileShortcut toEscapedModel();

	public DLFileShortcut toUnescapedModel();

	public String toString();

	public String toXmlString();
}