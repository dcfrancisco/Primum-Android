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

import com.liferay.portal.NoSuchModelException;
import com.liferay.portal.kernel.annotation.BeanReference;
import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.BatchSessionUtil;
import com.liferay.portal.service.persistence.ResourcePersistence;
import com.liferay.portal.service.persistence.UserPersistence;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.primus.NoSuchPatientException;

import com.primus.model.Patient;
import com.primus.model.impl.PatientImpl;
import com.primus.model.impl.PatientModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the patient service.
 *
 * <p>
 * Never modify or reference this class directly. Always use {@link PatientUtil} to access the patient persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Juan Fernández
 * @see PatientPersistence
 * @see PatientUtil
 * @generated
 */
public class PatientPersistenceImpl extends BasePersistenceImpl<Patient>
	implements PatientPersistence {
	public static final String FINDER_CLASS_NAME_ENTITY = PatientImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST = FINDER_CLASS_NAME_ENTITY +
		".List";
	public static final FinderPath FINDER_PATH_FETCH_BY_ID = new FinderPath(PatientModelImpl.ENTITY_CACHE_ENABLED,
			PatientModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_ENTITY,
			"fetchByid", new String[] { String.class.getName() });
	public static final FinderPath FINDER_PATH_COUNT_BY_ID = new FinderPath(PatientModelImpl.ENTITY_CACHE_ENABLED,
			PatientModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByid", new String[] { String.class.getName() });
	public static final FinderPath FINDER_PATH_FIND_ALL = new FinderPath(PatientModelImpl.ENTITY_CACHE_ENABLED,
			PatientModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(PatientModelImpl.ENTITY_CACHE_ENABLED,
			PatientModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countAll", new String[0]);

	/**
	 * Caches the patient in the entity cache if it is enabled.
	 *
	 * @param patient the patient to cache
	 */
	public void cacheResult(Patient patient) {
		EntityCacheUtil.putResult(PatientModelImpl.ENTITY_CACHE_ENABLED,
			PatientImpl.class, patient.getPrimaryKey(), patient);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_ID,
			new Object[] { patient.getId() }, patient);
	}

	/**
	 * Caches the patients in the entity cache if it is enabled.
	 *
	 * @param patients the patients to cache
	 */
	public void cacheResult(List<Patient> patients) {
		for (Patient patient : patients) {
			if (EntityCacheUtil.getResult(
						PatientModelImpl.ENTITY_CACHE_ENABLED,
						PatientImpl.class, patient.getPrimaryKey(), this) == null) {
				cacheResult(patient);
			}
		}
	}

	/**
	 * Clears the cache for all patients.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache() {
		CacheRegistryUtil.clear(PatientImpl.class.getName());
		EntityCacheUtil.clearCache(PatientImpl.class.getName());
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);
	}

	/**
	 * Clears the cache for the patient.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache(Patient patient) {
		EntityCacheUtil.removeResult(PatientModelImpl.ENTITY_CACHE_ENABLED,
			PatientImpl.class, patient.getPrimaryKey());

		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_ID,
			new Object[] { patient.getId() });
	}

	/**
	 * Creates a new patient with the primary key. Does not add the patient to the database.
	 *
	 * @param patientId the primary key for the new patient
	 * @return the new patient
	 */
	public Patient create(long patientId) {
		Patient patient = new PatientImpl();

		patient.setNew(true);
		patient.setPrimaryKey(patientId);

		return patient;
	}

	/**
	 * Removes the patient with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the patient to remove
	 * @return the patient that was removed
	 * @throws com.liferay.portal.NoSuchModelException if a patient with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Patient remove(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return remove(((Long)primaryKey).longValue());
	}

	/**
	 * Removes the patient with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param patientId the primary key of the patient to remove
	 * @return the patient that was removed
	 * @throws com.primus.NoSuchPatientException if a patient with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Patient remove(long patientId)
		throws NoSuchPatientException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Patient patient = (Patient)session.get(PatientImpl.class,
					new Long(patientId));

			if (patient == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + patientId);
				}

				throw new NoSuchPatientException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					patientId);
			}

			return remove(patient);
		}
		catch (NoSuchPatientException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Patient removeImpl(Patient patient) throws SystemException {
		patient = toUnwrappedModel(patient);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, patient);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		PatientModelImpl patientModelImpl = (PatientModelImpl)patient;

		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_ID,
			new Object[] { patientModelImpl.getId() });

		EntityCacheUtil.removeResult(PatientModelImpl.ENTITY_CACHE_ENABLED,
			PatientImpl.class, patient.getPrimaryKey());

		return patient;
	}

	public Patient updateImpl(com.primus.model.Patient patient, boolean merge)
		throws SystemException {
		patient = toUnwrappedModel(patient);

		boolean isNew = patient.isNew();

		PatientModelImpl patientModelImpl = (PatientModelImpl)patient;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, patient, merge);

			patient.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		EntityCacheUtil.putResult(PatientModelImpl.ENTITY_CACHE_ENABLED,
			PatientImpl.class, patient.getPrimaryKey(), patient);

		if (!isNew &&
				(!Validator.equals(patient.getId(),
					patientModelImpl.getOriginalId()))) {
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_ID,
				new Object[] { patientModelImpl.getOriginalId() });
		}

		if (isNew ||
				(!Validator.equals(patient.getId(),
					patientModelImpl.getOriginalId()))) {
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_ID,
				new Object[] { patient.getId() }, patient);
		}

		return patient;
	}

	protected Patient toUnwrappedModel(Patient patient) {
		if (patient instanceof PatientImpl) {
			return patient;
		}

		PatientImpl patientImpl = new PatientImpl();

		patientImpl.setNew(patient.isNew());
		patientImpl.setPrimaryKey(patient.getPrimaryKey());

		patientImpl.setPatientId(patient.getPatientId());
		patientImpl.setCompanyId(patient.getCompanyId());
		patientImpl.setGroupId(patient.getGroupId());
		patientImpl.setCreatorUserId(patient.getCreatorUserId());
		patientImpl.setCreateDate(patient.getCreateDate());
		patientImpl.setModifiedDate(patient.getModifiedDate());
		patientImpl.setName(patient.getName());
		patientImpl.setSurname1(patient.getSurname1());
		patientImpl.setSurname2(patient.getSurname2());
		patientImpl.setId(patient.getId());
		patientImpl.setBirthDate(patient.getBirthDate());

		return patientImpl;
	}

	/**
	 * Finds the patient with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the patient to find
	 * @return the patient
	 * @throws com.liferay.portal.NoSuchModelException if a patient with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Patient findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Finds the patient with the primary key or throws a {@link com.primus.NoSuchPatientException} if it could not be found.
	 *
	 * @param patientId the primary key of the patient to find
	 * @return the patient
	 * @throws com.primus.NoSuchPatientException if a patient with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Patient findByPrimaryKey(long patientId)
		throws NoSuchPatientException, SystemException {
		Patient patient = fetchByPrimaryKey(patientId);

		if (patient == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + patientId);
			}

			throw new NoSuchPatientException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				patientId);
		}

		return patient;
	}

	/**
	 * Finds the patient with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the patient to find
	 * @return the patient, or <code>null</code> if a patient with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Patient fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Finds the patient with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param patientId the primary key of the patient to find
	 * @return the patient, or <code>null</code> if a patient with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Patient fetchByPrimaryKey(long patientId) throws SystemException {
		Patient patient = (Patient)EntityCacheUtil.getResult(PatientModelImpl.ENTITY_CACHE_ENABLED,
				PatientImpl.class, patientId, this);

		if (patient == null) {
			Session session = null;

			try {
				session = openSession();

				patient = (Patient)session.get(PatientImpl.class,
						new Long(patientId));
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (patient != null) {
					cacheResult(patient);
				}

				closeSession(session);
			}
		}

		return patient;
	}

	/**
	 * Finds the patient where id = &#63; or throws a {@link com.primus.NoSuchPatientException} if it could not be found.
	 *
	 * @param id the id to search with
	 * @return the matching patient
	 * @throws com.primus.NoSuchPatientException if a matching patient could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Patient findByid(String id)
		throws NoSuchPatientException, SystemException {
		Patient patient = fetchByid(id);

		if (patient == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("id=");
			msg.append(id);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchPatientException(msg.toString());
		}

		return patient;
	}

	/**
	 * Finds the patient where id = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param id the id to search with
	 * @return the matching patient, or <code>null</code> if a matching patient could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Patient fetchByid(String id) throws SystemException {
		return fetchByid(id, true);
	}

	/**
	 * Finds the patient where id = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param id the id to search with
	 * @return the matching patient, or <code>null</code> if a matching patient could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Patient fetchByid(String id, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { id };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_ID,
					finderArgs, this);
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_PATIENT_WHERE);

			if (id == null) {
				query.append(_FINDER_COLUMN_ID_ID_1);
			}
			else {
				if (id.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_ID_ID_3);
				}
				else {
					query.append(_FINDER_COLUMN_ID_ID_2);
				}
			}

			query.append(PatientModelImpl.ORDER_BY_JPQL);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (id != null) {
					qPos.add(id);
				}

				List<Patient> list = q.list();

				result = list;

				Patient patient = null;

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_ID,
						finderArgs, list);
				}
				else {
					patient = list.get(0);

					cacheResult(patient);

					if ((patient.getId() == null) ||
							!patient.getId().equals(id)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_ID,
							finderArgs, patient);
					}
				}

				return patient;
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (result == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_ID,
						finderArgs);
				}

				closeSession(session);
			}
		}
		else {
			if (result instanceof List<?>) {
				return null;
			}
			else {
				return (Patient)result;
			}
		}
	}

	/**
	 * Finds all the patients.
	 *
	 * @return the patients
	 * @throws SystemException if a system exception occurred
	 */
	public List<Patient> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	public List<Patient> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
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
	public List<Patient> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<Patient> list = (List<Patient>)FinderCacheUtil.getResult(FINDER_PATH_FIND_ALL,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_PATIENT);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_PATIENT.concat(PatientModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<Patient>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<Patient>)QueryUtil.list(q, getDialect(),
							start, end);
				}
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_ALL,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_ALL, finderArgs,
						list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes the patient where id = &#63; from the database.
	 *
	 * @param id the id to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByid(String id)
		throws NoSuchPatientException, SystemException {
		Patient patient = findByid(id);

		remove(patient);
	}

	/**
	 * Removes all the patients from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (Patient patient : findAll()) {
			remove(patient);
		}
	}

	/**
	 * Counts all the patients where id = &#63;.
	 *
	 * @param id the id to search with
	 * @return the number of matching patients
	 * @throws SystemException if a system exception occurred
	 */
	public int countByid(String id) throws SystemException {
		Object[] finderArgs = new Object[] { id };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_ID,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_PATIENT_WHERE);

			if (id == null) {
				query.append(_FINDER_COLUMN_ID_ID_1);
			}
			else {
				if (id.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_ID_ID_3);
				}
				else {
					query.append(_FINDER_COLUMN_ID_ID_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (id != null) {
					qPos.add(id);
				}

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_ID, finderArgs,
					count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the patients.
	 *
	 * @return the number of patients
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Object[] finderArgs = new Object[0];

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				finderArgs, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_PATIENT);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL, finderArgs,
					count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Initializes the patient persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.primus.model.Patient")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Patient>> listenersList = new ArrayList<ModelListener<Patient>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Patient>)InstanceFactory.newInstance(
							listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(PatientImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST);
	}

	@BeanReference(type = PatientPersistence.class)
	protected PatientPersistence patientPersistence;
	@BeanReference(type = ResourcePersistence.class)
	protected ResourcePersistence resourcePersistence;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private static final String _SQL_SELECT_PATIENT = "SELECT patient FROM Patient patient";
	private static final String _SQL_SELECT_PATIENT_WHERE = "SELECT patient FROM Patient patient WHERE ";
	private static final String _SQL_COUNT_PATIENT = "SELECT COUNT(patient) FROM Patient patient";
	private static final String _SQL_COUNT_PATIENT_WHERE = "SELECT COUNT(patient) FROM Patient patient WHERE ";
	private static final String _FINDER_COLUMN_ID_ID_1 = "patient.id IS NULL";
	private static final String _FINDER_COLUMN_ID_ID_2 = "patient.id = ?";
	private static final String _FINDER_COLUMN_ID_ID_3 = "(patient.id IS NULL OR patient.id = ?)";
	private static final String _ORDER_BY_ENTITY_ALIAS = "patient.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Patient exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Patient exists with the key {";
	private static Log _log = LogFactoryUtil.getLog(PatientPersistenceImpl.class);
}