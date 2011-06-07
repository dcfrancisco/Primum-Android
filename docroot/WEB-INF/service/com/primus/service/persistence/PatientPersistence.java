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

package com.primus.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.primus.model.Patient;

/**
 * The persistence interface for the patient service.
 *
 * <p>
 * Never modify or reference this interface directly. Always use {@link PatientUtil} to access the patient persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Juan Fernández
 * @see PatientPersistenceImpl
 * @see PatientUtil
 * @generated
 */
public interface PatientPersistence extends BasePersistence<Patient> {
	/**
	* Caches the patient in the entity cache if it is enabled.
	*
	* @param patient the patient to cache
	*/
	public void cacheResult(com.primus.model.Patient patient);

	/**
	* Caches the patients in the entity cache if it is enabled.
	*
	* @param patients the patients to cache
	*/
	public void cacheResult(java.util.List<com.primus.model.Patient> patients);

	/**
	* Creates a new patient with the primary key. Does not add the patient to the database.
	*
	* @param patientId the primary key for the new patient
	* @return the new patient
	*/
	public com.primus.model.Patient create(long patientId);

	/**
	* Removes the patient with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param patientId the primary key of the patient to remove
	* @return the patient that was removed
	* @throws com.primus.NoSuchPatientException if a patient with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.primus.model.Patient remove(long patientId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.primus.NoSuchPatientException;

	public com.primus.model.Patient updateImpl(
		com.primus.model.Patient patient, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the patient with the primary key or throws a {@link com.primus.NoSuchPatientException} if it could not be found.
	*
	* @param patientId the primary key of the patient to find
	* @return the patient
	* @throws com.primus.NoSuchPatientException if a patient with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.primus.model.Patient findByPrimaryKey(long patientId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.primus.NoSuchPatientException;

	/**
	* Finds the patient with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param patientId the primary key of the patient to find
	* @return the patient, or <code>null</code> if a patient with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.primus.model.Patient fetchByPrimaryKey(long patientId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the patient where id = &#63; or throws a {@link com.primus.NoSuchPatientException} if it could not be found.
	*
	* @param id the id to search with
	* @return the matching patient
	* @throws com.primus.NoSuchPatientException if a matching patient could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.primus.model.Patient findByid(java.lang.String id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.primus.NoSuchPatientException;

	/**
	* Finds the patient where id = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param id the id to search with
	* @return the matching patient, or <code>null</code> if a matching patient could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.primus.model.Patient fetchByid(java.lang.String id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the patient where id = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param id the id to search with
	* @return the matching patient, or <code>null</code> if a matching patient could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.primus.model.Patient fetchByid(java.lang.String id,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds all the patients.
	*
	* @return the patients
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.primus.model.Patient> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the patients.
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
	public java.util.List<com.primus.model.Patient> findAll(int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the patients.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of patients to return
	* @param end the upper bound of the range of patients to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of patients
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.primus.model.Patient> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the patient where id = &#63; from the database.
	*
	* @param id the id to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByid(java.lang.String id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.primus.NoSuchPatientException;

	/**
	* Removes all the patients from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the patients where id = &#63;.
	*
	* @param id the id to search with
	* @return the number of matching patients
	* @throws SystemException if a system exception occurred
	*/
	public int countByid(java.lang.String id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the patients.
	*
	* @return the number of patients
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}