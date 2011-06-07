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

package com.primus.service.impl;

import java.util.List;

import com.liferay.portal.kernel.exception.SystemException;
import com.primus.NoSuchPatientException;
import com.primus.model.Patient;
import com.primus.service.base.PatientLocalServiceBaseImpl;

/**
 * The implementation of the patient local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.primus.service.PatientLocalService} interface.
 * </p>
 *
 * <p>
 * Never reference this interface directly. Always use {@link com.primus.service.PatientLocalServiceUtil} to access the patient local service.
 * </p>
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Juan Fernández
 * @see com.primus.service.base.PatientLocalServiceBaseImpl
 * @see com.primus.service.PatientLocalServiceUtil
 */
public class PatientLocalServiceImpl extends PatientLocalServiceBaseImpl {

	public void deletePatient(long patientId) 
		throws NoSuchPatientException, SystemException {
		
		patientPersistence.remove(patientId);
	}
	
	public List<Patient> getPatientsByCompanyId(long companyId) {
		return null;
	}
	
	public int getPatientsByCompanyIdCount(long companyId) {
		return 0;
	}
	
	public List<Patient> getPatientsByCreatorUserId(long creatorUserId) {
		return null;
	}
	
	public int getPatientsByCreatorUserIdCount(long creatorUserId) {
		return 0;
	}
	
	public List<Patient> getPatientsByGroup(long groupId) {
		return null;
	}
	
	public int getPatientsByGroupCount(long groupId) {
		return 0;
	}
}