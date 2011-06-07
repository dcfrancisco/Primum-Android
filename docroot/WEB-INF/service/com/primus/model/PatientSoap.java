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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * <p>
 * This class is used by
 * {@link com.primus.service.http.PatientServiceSoap}.
 * </p>
 *
 * @author    Juan Fernández
 * @see       com.primus.service.http.PatientServiceSoap
 * @generated
 */
public class PatientSoap implements Serializable {
	public static PatientSoap toSoapModel(Patient model) {
		PatientSoap soapModel = new PatientSoap();

		soapModel.setPatientId(model.getPatientId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCreatorUserId(model.getCreatorUserId());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setName(model.getName());
		soapModel.setSurname1(model.getSurname1());
		soapModel.setSurname2(model.getSurname2());
		soapModel.setId(model.getId());
		soapModel.setBirthDate(model.getBirthDate());

		return soapModel;
	}

	public static PatientSoap[] toSoapModels(Patient[] models) {
		PatientSoap[] soapModels = new PatientSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static PatientSoap[][] toSoapModels(Patient[][] models) {
		PatientSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new PatientSoap[models.length][models[0].length];
		}
		else {
			soapModels = new PatientSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static PatientSoap[] toSoapModels(List<Patient> models) {
		List<PatientSoap> soapModels = new ArrayList<PatientSoap>(models.size());

		for (Patient model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new PatientSoap[soapModels.size()]);
	}

	public PatientSoap() {
	}

	public long getPrimaryKey() {
		return _patientId;
	}

	public void setPrimaryKey(long pk) {
		setPatientId(pk);
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

	private long _patientId;
	private long _companyId;
	private long _groupId;
	private long _creatorUserId;
	private Date _createDate;
	private Date _modifiedDate;
	private String _name;
	private String _surname1;
	private String _surname2;
	private String _id;
	private Date _birthDate;
}