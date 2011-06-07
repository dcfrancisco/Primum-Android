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

package com.primus.service.http;

import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.util.StringPool;

import com.primus.model.Patient;

import java.util.Date;
import java.util.List;

/**
 * @author    Juan Fernández
 * @generated
 */
public class PatientJSONSerializer {
	public static JSONObject toJSONObject(Patient model) {
		JSONObject jsonObj = JSONFactoryUtil.createJSONObject();

		jsonObj.put("patientId", model.getPatientId());
		jsonObj.put("companyId", model.getCompanyId());
		jsonObj.put("groupId", model.getGroupId());
		jsonObj.put("creatorUserId", model.getCreatorUserId());

		Date createDate = model.getCreateDate();

		String createDateJSON = StringPool.BLANK;

		if (createDate != null) {
			createDateJSON = String.valueOf(createDate.getTime());
		}

		jsonObj.put("createDate", createDateJSON);

		Date modifiedDate = model.getModifiedDate();

		String modifiedDateJSON = StringPool.BLANK;

		if (modifiedDate != null) {
			modifiedDateJSON = String.valueOf(modifiedDate.getTime());
		}

		jsonObj.put("modifiedDate", modifiedDateJSON);
		jsonObj.put("name", model.getName());
		jsonObj.put("surname1", model.getSurname1());
		jsonObj.put("surname2", model.getSurname2());
		jsonObj.put("id", model.getId());

		Date birthDate = model.getBirthDate();

		String birthDateJSON = StringPool.BLANK;

		if (birthDate != null) {
			birthDateJSON = String.valueOf(birthDate.getTime());
		}

		jsonObj.put("birthDate", birthDateJSON);

		return jsonObj;
	}

	public static JSONArray toJSONArray(com.primus.model.Patient[] models) {
		JSONArray jsonArray = JSONFactoryUtil.createJSONArray();

		for (Patient model : models) {
			jsonArray.put(toJSONObject(model));
		}

		return jsonArray;
	}

	public static JSONArray toJSONArray(com.primus.model.Patient[][] models) {
		JSONArray jsonArray = JSONFactoryUtil.createJSONArray();

		for (Patient[] model : models) {
			jsonArray.put(toJSONArray(model));
		}

		return jsonArray;
	}

	public static JSONArray toJSONArray(List<com.primus.model.Patient> models) {
		JSONArray jsonArray = JSONFactoryUtil.createJSONArray();

		for (Patient model : models) {
			jsonArray.put(toJSONObject(model));
		}

		return jsonArray;
	}
}