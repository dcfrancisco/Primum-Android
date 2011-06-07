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

/**
 * <p>
 * This class is a wrapper for {@link Patient}.
 * </p>
 *
 * @author    Juan Fernández
 * @see       Patient
 * @generated
 */
public class PatientWrapper implements Patient {
	public PatientWrapper(Patient patient) {
		_patient = patient;
	}

	public long getPrimaryKey() {
		return _patient.getPrimaryKey();
	}

	public void setPrimaryKey(long pk) {
		_patient.setPrimaryKey(pk);
	}

	public long getPatientId() {
		return _patient.getPatientId();
	}

	public void setPatientId(long patientId) {
		_patient.setPatientId(patientId);
	}

	public long getCompanyId() {
		return _patient.getCompanyId();
	}

	public void setCompanyId(long companyId) {
		_patient.setCompanyId(companyId);
	}

	public long getGroupId() {
		return _patient.getGroupId();
	}

	public void setGroupId(long groupId) {
		_patient.setGroupId(groupId);
	}

	public long getCreatorUserId() {
		return _patient.getCreatorUserId();
	}

	public void setCreatorUserId(long creatorUserId) {
		_patient.setCreatorUserId(creatorUserId);
	}

	public java.lang.String getCreatorUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _patient.getCreatorUserUuid();
	}

	public void setCreatorUserUuid(java.lang.String creatorUserUuid) {
		_patient.setCreatorUserUuid(creatorUserUuid);
	}

	public java.util.Date getCreateDate() {
		return _patient.getCreateDate();
	}

	public void setCreateDate(java.util.Date createDate) {
		_patient.setCreateDate(createDate);
	}

	public java.util.Date getModifiedDate() {
		return _patient.getModifiedDate();
	}

	public void setModifiedDate(java.util.Date modifiedDate) {
		_patient.setModifiedDate(modifiedDate);
	}

	public java.lang.String getName() {
		return _patient.getName();
	}

	public void setName(java.lang.String name) {
		_patient.setName(name);
	}

	public java.lang.String getSurname1() {
		return _patient.getSurname1();
	}

	public void setSurname1(java.lang.String surname1) {
		_patient.setSurname1(surname1);
	}

	public java.lang.String getSurname2() {
		return _patient.getSurname2();
	}

	public void setSurname2(java.lang.String surname2) {
		_patient.setSurname2(surname2);
	}

	public java.lang.String getId() {
		return _patient.getId();
	}

	public void setId(java.lang.String id) {
		_patient.setId(id);
	}

	public java.util.Date getBirthDate() {
		return _patient.getBirthDate();
	}

	public void setBirthDate(java.util.Date birthDate) {
		_patient.setBirthDate(birthDate);
	}

	public com.primus.model.Patient toEscapedModel() {
		return _patient.toEscapedModel();
	}

	public boolean isNew() {
		return _patient.isNew();
	}

	public void setNew(boolean n) {
		_patient.setNew(n);
	}

	public boolean isCachedModel() {
		return _patient.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_patient.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _patient.isEscapedModel();
	}

	public void setEscapedModel(boolean escapedModel) {
		_patient.setEscapedModel(escapedModel);
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _patient.getPrimaryKeyObj();
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _patient.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_patient.setExpandoBridgeAttributes(serviceContext);
	}

	public java.lang.Object clone() {
		return _patient.clone();
	}

	public int compareTo(com.primus.model.Patient patient) {
		return _patient.compareTo(patient);
	}

	public int hashCode() {
		return _patient.hashCode();
	}

	public java.lang.String toString() {
		return _patient.toString();
	}

	public java.lang.String toXmlString() {
		return _patient.toXmlString();
	}

	public Patient getWrappedPatient() {
		return _patient;
	}

	private Patient _patient;
}