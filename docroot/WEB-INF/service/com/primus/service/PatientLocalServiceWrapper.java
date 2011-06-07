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

package com.primus.service;

/**
 * <p>
 * This class is a wrapper for {@link PatientLocalService}.
 * </p>
 *
 * @author    Juan Fernández
 * @see       PatientLocalService
 * @generated
 */
public class PatientLocalServiceWrapper implements PatientLocalService {
	public PatientLocalServiceWrapper(PatientLocalService patientLocalService) {
		_patientLocalService = patientLocalService;
	}

	/**
	* Adds the patient to the database. Also notifies the appropriate model listeners.
	*
	* @param patient the patient to add
	* @return the patient that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.primus.model.Patient addPatient(com.primus.model.Patient patient)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _patientLocalService.addPatient(patient);
	}

	/**
	* Creates a new patient with the primary key. Does not add the patient to the database.
	*
	* @param patientId the primary key for the new patient
	* @return the new patient
	*/
	public com.primus.model.Patient createPatient(long patientId) {
		return _patientLocalService.createPatient(patientId);
	}

	/**
	* Deletes the patient with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param patientId the primary key of the patient to delete
	* @throws PortalException if a patient with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public void deletePatient(long patientId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			com.primus.NoSuchPatientException {
		_patientLocalService.deletePatient(patientId);
	}

	/**
	* Deletes the patient from the database. Also notifies the appropriate model listeners.
	*
	* @param patient the patient to delete
	* @throws SystemException if a system exception occurred
	*/
	public void deletePatient(com.primus.model.Patient patient)
		throws com.liferay.portal.kernel.exception.SystemException {
		_patientLocalService.deletePatient(patient);
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query to search with
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _patientLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query to search with
	* @param start the lower bound of the range of model instances to return
	* @param end the upper bound of the range of model instances to return (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _patientLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query to search with
	* @param start the lower bound of the range of model instances to return
	* @param end the upper bound of the range of model instances to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _patientLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Counts the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query to search with
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _patientLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Gets the patient with the primary key.
	*
	* @param patientId the primary key of the patient to get
	* @return the patient
	* @throws PortalException if a patient with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.primus.model.Patient getPatient(long patientId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _patientLocalService.getPatient(patientId);
	}

	/**
	* Gets a range of all the patients.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of patients to return
	* @param end the upper bound of the range of patients to return (not inclusive)
	* @return the range of patients
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.primus.model.Patient> getPatients(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _patientLocalService.getPatients(start, end);
	}

	/**
	* Gets the number of patients.
	*
	* @return the number of patients
	* @throws SystemException if a system exception occurred
	*/
	public int getPatientsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _patientLocalService.getPatientsCount();
	}

	/**
	* Updates the patient in the database. Also notifies the appropriate model listeners.
	*
	* @param patient the patient to update
	* @return the patient that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.primus.model.Patient updatePatient(
		com.primus.model.Patient patient)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _patientLocalService.updatePatient(patient);
	}

	/**
	* Updates the patient in the database. Also notifies the appropriate model listeners.
	*
	* @param patient the patient to update
	* @param merge whether to merge the patient with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the patient that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.primus.model.Patient updatePatient(
		com.primus.model.Patient patient, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _patientLocalService.updatePatient(patient, merge);
	}

	public java.util.List<com.primus.model.Patient> getPatientsByCompanyId(
		long companyId) {
		return _patientLocalService.getPatientsByCompanyId(companyId);
	}

	public int getPatientsByCompanyIdCount(long companyId) {
		return _patientLocalService.getPatientsByCompanyIdCount(companyId);
	}

	public java.util.List<com.primus.model.Patient> getPatientsByCreatorUserId(
		long creatorUserId) {
		return _patientLocalService.getPatientsByCreatorUserId(creatorUserId);
	}

	public int getPatientsByCreatorUserIdCount(long creatorUserId) {
		return _patientLocalService.getPatientsByCreatorUserIdCount(creatorUserId);
	}

	public java.util.List<com.primus.model.Patient> getPatientsByGroup(
		long groupId) {
		return _patientLocalService.getPatientsByGroup(groupId);
	}

	public int getPatientsByGroupCount(long groupId) {
		return _patientLocalService.getPatientsByGroupCount(groupId);
	}

	public PatientLocalService getWrappedPatientLocalService() {
		return _patientLocalService;
	}

	private PatientLocalService _patientLocalService;
}