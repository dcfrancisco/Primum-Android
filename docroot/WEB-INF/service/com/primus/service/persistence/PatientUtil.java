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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.service.ServiceContext;

import com.primus.model.Patient;

import java.util.List;

/**
 * The persistence utility for the patient service. This utility wraps {@link PatientPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Juan Fernández
 * @see PatientPersistence
 * @see PatientPersistenceImpl
 * @generated
 */
public class PatientUtil {
	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(Patient patient) {
		getPersistence().clearCache(patient);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Patient> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Patient> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Patient> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#remove(com.liferay.portal.model.BaseModel)
	 */
	public static Patient remove(Patient patient) throws SystemException {
		return getPersistence().remove(patient);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static Patient update(Patient patient, boolean merge)
		throws SystemException {
		return getPersistence().update(patient, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static Patient update(Patient patient, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(patient, merge, serviceContext);
	}

	/**
	* Caches the patient in the entity cache if it is enabled.
	*
	* @param patient the patient to cache
	*/
	public static void cacheResult(com.primus.model.Patient patient) {
		getPersistence().cacheResult(patient);
	}

	/**
	* Caches the patients in the entity cache if it is enabled.
	*
	* @param patients the patients to cache
	*/
	public static void cacheResult(
		java.util.List<com.primus.model.Patient> patients) {
		getPersistence().cacheResult(patients);
	}

	/**
	* Creates a new patient with the primary key. Does not add the patient to the database.
	*
	* @param patientId the primary key for the new patient
	* @return the new patient
	*/
	public static com.primus.model.Patient create(long patientId) {
		return getPersistence().create(patientId);
	}

	/**
	* Removes the patient with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param patientId the primary key of the patient to remove
	* @return the patient that was removed
	* @throws com.primus.NoSuchPatientException if a patient with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.primus.model.Patient remove(long patientId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.primus.NoSuchPatientException {
		return getPersistence().remove(patientId);
	}

	public static com.primus.model.Patient updateImpl(
		com.primus.model.Patient patient, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(patient, merge);
	}

	/**
	* Finds the patient with the primary key or throws a {@link com.primus.NoSuchPatientException} if it could not be found.
	*
	* @param patientId the primary key of the patient to find
	* @return the patient
	* @throws com.primus.NoSuchPatientException if a patient with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.primus.model.Patient findByPrimaryKey(long patientId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.primus.NoSuchPatientException {
		return getPersistence().findByPrimaryKey(patientId);
	}

	/**
	* Finds the patient with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param patientId the primary key of the patient to find
	* @return the patient, or <code>null</code> if a patient with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.primus.model.Patient fetchByPrimaryKey(long patientId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(patientId);
	}

	/**
	* Finds the patient where id = &#63; or throws a {@link com.primus.NoSuchPatientException} if it could not be found.
	*
	* @param id the id to search with
	* @return the matching patient
	* @throws com.primus.NoSuchPatientException if a matching patient could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.primus.model.Patient findByid(java.lang.String id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.primus.NoSuchPatientException {
		return getPersistence().findByid(id);
	}

	/**
	* Finds the patient where id = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param id the id to search with
	* @return the matching patient, or <code>null</code> if a matching patient could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.primus.model.Patient fetchByid(java.lang.String id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByid(id);
	}

	/**
	* Finds the patient where id = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param id the id to search with
	* @return the matching patient, or <code>null</code> if a matching patient could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.primus.model.Patient fetchByid(java.lang.String id,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByid(id, retrieveFromCache);
	}

	/**
	* Finds all the patients.
	*
	* @return the patients
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.primus.model.Patient> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

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
	public static java.util.List<com.primus.model.Patient> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<com.primus.model.Patient> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes the patient where id = &#63; from the database.
	*
	* @param id the id to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByid(java.lang.String id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.primus.NoSuchPatientException {
		getPersistence().removeByid(id);
	}

	/**
	* Removes all the patients from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Counts all the patients where id = &#63;.
	*
	* @param id the id to search with
	* @return the number of matching patients
	* @throws SystemException if a system exception occurred
	*/
	public static int countByid(java.lang.String id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByid(id);
	}

	/**
	* Counts all the patients.
	*
	* @return the number of patients
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static PatientPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (PatientPersistence)PortletBeanLocatorUtil.locate(com.primus.service.ClpSerializer.SERVLET_CONTEXT_NAME,
					PatientPersistence.class.getName());
		}

		return _persistence;
	}

	public void setPersistence(PatientPersistence persistence) {
		_persistence = persistence;
	}

	private static PatientPersistence _persistence;
}