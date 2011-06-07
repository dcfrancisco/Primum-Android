/**
 * Copyright (c) 2000-2011 Liferay, Inc. All rights reserved.
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

package com.primus.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.Date;

/**
 * @author Juan Fernández
 */
public class PatientClp extends BaseModelImpl<Patient> implements Patient {
	public PatientClp() {
	}

	public long getPrimaryKey() {
		return _patientId;
	}

	public void setPrimaryKey(long pk) {
		setPatientId(pk);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_patientId);
	}

	public long getPatientId() {
		return _patientId;
	}

	public void setPatientId(long patientId) {
		_patientId = patientId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCreatorUserId() {
		return _creatorUserId;
	}

	public void setCreatorUserId(long creatorUserId) {
		_creatorUserId = creatorUserId;
	}

	public String getCreatorUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getCreatorUserId(), "uuid",
			_creatorUserUuid);
	}

	public void setCreatorUserUuid(String creatorUserUuid) {
		_creatorUserUuid = creatorUserUuid;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public String getSurname1() {
		return _surname1;
	}

	public void setSurname1(String surname1) {
		_surname1 = surname1;
	}

	public String getSurname2() {
		return _surname2;
	}

	public void setSurname2(String surname2) {
		_surname2 = surname2;
	}

	public String getId() {
		return _id;
	}

	public void setId(String id) {
		_id = id;
	}

	public Date getBirthDate() {
		return _birthDate;
	}

	public void setBirthDate(Date birthDate) {
		_birthDate = birthDate;
	}

	public Patient toEscapedModel() {
		if (isEscapedModel()) {
			return this;
		}
		else {
			return (Patient)Proxy.newProxyInstance(Patient.class.getClassLoader(),
				new Class[] { Patient.class }, new AutoEscapeBeanHandler(this));
		}
	}

	public Object clone() {
		PatientClp clone = new PatientClp();

		clone.setPatientId(getPatientId());
		clone.setCompanyId(getCompanyId());
		clone.setGroupId(getGroupId());
		clone.setCreatorUserId(getCreatorUserId());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setName(getName());
		clone.setSurname1(getSurname1());
		clone.setSurname2(getSurname2());
		clone.setId(getId());
		clone.setBirthDate(getBirthDate());

		return clone;
	}

	public int compareTo(Patient patient) {
		int value = 0;

		value = getSurname1().compareTo(patient.getSurname1());

		if (value != 0) {
			return value;
		}

		return 0;
	}

	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		PatientClp patient = null;

		try {
			patient = (PatientClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long pk = patient.getPrimaryKey();

		if (getPrimaryKey() == pk) {
			return true;
		}
		else {
			return false;
		}
	}

	public int hashCode() {
		return (int)getPrimaryKey();
	}

	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{patientId=");
		sb.append(getPatientId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", creatorUserId=");
		sb.append(getCreatorUserId());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", name=");
		sb.append(getName());
		sb.append(", surname1=");
		sb.append(getSurname1());
		sb.append(", surname2=");
		sb.append(getSurname2());
		sb.append(", id=");
		sb.append(getId());
		sb.append(", birthDate=");
		sb.append(getBirthDate());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(37);

		sb.append("<model><model-name>");
		sb.append("com.primus.model.Patient");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>patientId</column-name><column-value><![CDATA[");
		sb.append(getPatientId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>creatorUserId</column-name><column-value><![CDATA[");
		sb.append(getCreatorUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>surname1</column-name><column-value><![CDATA[");
		sb.append(getSurname1());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>surname2</column-name><column-value><![CDATA[");
		sb.append(getSurname2());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>birthDate</column-name><column-value><![CDATA[");
		sb.append(getBirthDate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _patientId;
	private long _companyId;
	private long _groupId;
	private long _creatorUserId;
	private String _creatorUserUuid;
	private Date _createDate;
	private Date _modifiedDate;
	private String _name;
	private String _surname1;
	private String _surname2;
	private String _id;
	private Date _birthDate;
}