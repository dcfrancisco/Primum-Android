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

import com.liferay.portal.kernel.util.ClassLoaderProxy;
import com.liferay.portal.kernel.util.MethodHandler;
import com.liferay.portal.kernel.util.MethodKey;

/**
 * @author Juan Fernández
 */
public class PatientLocalServiceClp implements PatientLocalService {
	public PatientLocalServiceClp(ClassLoaderProxy classLoaderProxy) {
		_classLoaderProxy = classLoaderProxy;
	}

	public com.primus.model.Patient addPatient(com.primus.model.Patient patient)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_addPatientMethodKey0,
				patient);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (com.primus.model.Patient)ClpSerializer.translateOutput(returnObj);
	}

	public com.primus.model.Patient createPatient(long patientId) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_createPatientMethodKey1,
				patientId);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (com.primus.model.Patient)ClpSerializer.translateOutput(returnObj);
	}

	public void deletePatient(long patientId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			com.primus.NoSuchPatientException {
		MethodHandler methodHandler = new MethodHandler(_deletePatientMethodKey2,
				patientId);

		try {
			_classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof com.primus.NoSuchPatientException) {
				throw (com.primus.NoSuchPatientException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}
	}

	public void deletePatient(com.primus.model.Patient patient)
		throws com.liferay.portal.kernel.exception.SystemException {
		MethodHandler methodHandler = new MethodHandler(_deletePatientMethodKey3,
				patient);

		try {
			_classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}
	}

	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_dynamicQueryMethodKey4,
				dynamicQuery);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List)ClpSerializer.translateOutput(returnObj);
	}

	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_dynamicQueryMethodKey5,
				dynamicQuery, start, end);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List)ClpSerializer.translateOutput(returnObj);
	}

	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_dynamicQueryMethodKey6,
				dynamicQuery, start, end, orderByComparator);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List)ClpSerializer.translateOutput(returnObj);
	}

	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_dynamicQueryCountMethodKey7,
				dynamicQuery);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return ((Long)returnObj).longValue();
	}

	public com.primus.model.Patient getPatient(long patientId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getPatientMethodKey8,
				patientId);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (com.primus.model.Patient)ClpSerializer.translateOutput(returnObj);
	}

	public java.util.List<com.primus.model.Patient> getPatients(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getPatientsMethodKey9,
				start, end);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<com.primus.model.Patient>)ClpSerializer.translateOutput(returnObj);
	}

	public int getPatientsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getPatientsCountMethodKey10);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return ((Integer)returnObj).intValue();
	}

	public com.primus.model.Patient updatePatient(
		com.primus.model.Patient patient)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_updatePatientMethodKey11,
				patient);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (com.primus.model.Patient)ClpSerializer.translateOutput(returnObj);
	}

	public com.primus.model.Patient updatePatient(
		com.primus.model.Patient patient, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_updatePatientMethodKey12,
				patient, merge);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (com.primus.model.Patient)ClpSerializer.translateOutput(returnObj);
	}

	public java.util.List<com.primus.model.Patient> getPatientsByCompanyId(
		long companyId) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getPatientsByCompanyIdMethodKey13,
				companyId);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<com.primus.model.Patient>)ClpSerializer.translateOutput(returnObj);
	}

	public int getPatientsByCompanyIdCount(long companyId) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getPatientsByCompanyIdCountMethodKey14,
				companyId);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return ((Integer)returnObj).intValue();
	}

	public java.util.List<com.primus.model.Patient> getPatientsByCreatorUserId(
		long creatorUserId) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getPatientsByCreatorUserIdMethodKey15,
				creatorUserId);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<com.primus.model.Patient>)ClpSerializer.translateOutput(returnObj);
	}

	public int getPatientsByCreatorUserIdCount(long creatorUserId) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getPatientsByCreatorUserIdCountMethodKey16,
				creatorUserId);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return ((Integer)returnObj).intValue();
	}

	public java.util.List<com.primus.model.Patient> getPatientsByGroup(
		long groupId) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getPatientsByGroupMethodKey17,
				groupId);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<com.primus.model.Patient>)ClpSerializer.translateOutput(returnObj);
	}

	public int getPatientsByGroupCount(long groupId) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getPatientsByGroupCountMethodKey18,
				groupId);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return ((Integer)returnObj).intValue();
	}

	public ClassLoaderProxy getClassLoaderProxy() {
		return _classLoaderProxy;
	}

	private ClassLoaderProxy _classLoaderProxy;
	private MethodKey _addPatientMethodKey0 = new MethodKey(_classLoaderProxy.getClassName(),
			"addPatient", com.primus.model.Patient.class);
	private MethodKey _createPatientMethodKey1 = new MethodKey(_classLoaderProxy.getClassName(),
			"createPatient", long.class);
	private MethodKey _deletePatientMethodKey2 = new MethodKey(_classLoaderProxy.getClassName(),
			"deletePatient", long.class);
	private MethodKey _deletePatientMethodKey3 = new MethodKey(_classLoaderProxy.getClassName(),
			"deletePatient", com.primus.model.Patient.class);
	private MethodKey _dynamicQueryMethodKey4 = new MethodKey(_classLoaderProxy.getClassName(),
			"dynamicQuery", com.liferay.portal.kernel.dao.orm.DynamicQuery.class);
	private MethodKey _dynamicQueryMethodKey5 = new MethodKey(_classLoaderProxy.getClassName(),
			"dynamicQuery",
			com.liferay.portal.kernel.dao.orm.DynamicQuery.class, int.class,
			int.class);
	private MethodKey _dynamicQueryMethodKey6 = new MethodKey(_classLoaderProxy.getClassName(),
			"dynamicQuery",
			com.liferay.portal.kernel.dao.orm.DynamicQuery.class, int.class,
			int.class, com.liferay.portal.kernel.util.OrderByComparator.class);
	private MethodKey _dynamicQueryCountMethodKey7 = new MethodKey(_classLoaderProxy.getClassName(),
			"dynamicQueryCount",
			com.liferay.portal.kernel.dao.orm.DynamicQuery.class);
	private MethodKey _getPatientMethodKey8 = new MethodKey(_classLoaderProxy.getClassName(),
			"getPatient", long.class);
	private MethodKey _getPatientsMethodKey9 = new MethodKey(_classLoaderProxy.getClassName(),
			"getPatients", int.class, int.class);
	private MethodKey _getPatientsCountMethodKey10 = new MethodKey(_classLoaderProxy.getClassName(),
			"getPatientsCount");
	private MethodKey _updatePatientMethodKey11 = new MethodKey(_classLoaderProxy.getClassName(),
			"updatePatient", com.primus.model.Patient.class);
	private MethodKey _updatePatientMethodKey12 = new MethodKey(_classLoaderProxy.getClassName(),
			"updatePatient", com.primus.model.Patient.class, boolean.class);
	private MethodKey _getPatientsByCompanyIdMethodKey13 = new MethodKey(_classLoaderProxy.getClassName(),
			"getPatientsByCompanyId", long.class);
	private MethodKey _getPatientsByCompanyIdCountMethodKey14 = new MethodKey(_classLoaderProxy.getClassName(),
			"getPatientsByCompanyIdCount", long.class);
	private MethodKey _getPatientsByCreatorUserIdMethodKey15 = new MethodKey(_classLoaderProxy.getClassName(),
			"getPatientsByCreatorUserId", long.class);
	private MethodKey _getPatientsByCreatorUserIdCountMethodKey16 = new MethodKey(_classLoaderProxy.getClassName(),
			"getPatientsByCreatorUserIdCount", long.class);
	private MethodKey _getPatientsByGroupMethodKey17 = new MethodKey(_classLoaderProxy.getClassName(),
			"getPatientsByGroup", long.class);
	private MethodKey _getPatientsByGroupCountMethodKey18 = new MethodKey(_classLoaderProxy.getClassName(),
			"getPatientsByGroupCount", long.class);
}