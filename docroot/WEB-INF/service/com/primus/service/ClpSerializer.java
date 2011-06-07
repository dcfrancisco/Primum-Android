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

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.model.BaseModel;

import com.primus.model.PatientClp;

import java.lang.reflect.Method;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Brian Wing Shun Chan
 */
public class ClpSerializer {
	public static final String SERVLET_CONTEXT_NAME = "Patients-portlet";

	public static void setClassLoader(ClassLoader classLoader) {
		_classLoader = classLoader;
	}

	public static Object translateInput(BaseModel<?> oldModel) {
		Class<?> oldModelClass = oldModel.getClass();

		String oldModelClassName = oldModelClass.getName();

		if (oldModelClassName.equals(PatientClp.class.getName())) {
			PatientClp oldCplModel = (PatientClp)oldModel;

			ClassLoader contextClassLoader = Thread.currentThread()
												   .getContextClassLoader();

			try {
				Thread.currentThread().setContextClassLoader(_classLoader);

				try {
					Class<?> newModelClass = Class.forName("com.primus.model.impl.PatientImpl",
							true, _classLoader);

					Object newModel = newModelClass.newInstance();

					Method method0 = newModelClass.getMethod("setPatientId",
							new Class[] { Long.TYPE });

					Long value0 = new Long(oldCplModel.getPatientId());

					method0.invoke(newModel, value0);

					Method method1 = newModelClass.getMethod("setCompanyId",
							new Class[] { Long.TYPE });

					Long value1 = new Long(oldCplModel.getCompanyId());

					method1.invoke(newModel, value1);

					Method method2 = newModelClass.getMethod("setGroupId",
							new Class[] { Long.TYPE });

					Long value2 = new Long(oldCplModel.getGroupId());

					method2.invoke(newModel, value2);

					Method method3 = newModelClass.getMethod("setCreatorUserId",
							new Class[] { Long.TYPE });

					Long value3 = new Long(oldCplModel.getCreatorUserId());

					method3.invoke(newModel, value3);

					Method method4 = newModelClass.getMethod("setCreateDate",
							new Class[] { Date.class });

					Date value4 = oldCplModel.getCreateDate();

					method4.invoke(newModel, value4);

					Method method5 = newModelClass.getMethod("setModifiedDate",
							new Class[] { Date.class });

					Date value5 = oldCplModel.getModifiedDate();

					method5.invoke(newModel, value5);

					Method method6 = newModelClass.getMethod("setName",
							new Class[] { String.class });

					String value6 = oldCplModel.getName();

					method6.invoke(newModel, value6);

					Method method7 = newModelClass.getMethod("setSurname1",
							new Class[] { String.class });

					String value7 = oldCplModel.getSurname1();

					method7.invoke(newModel, value7);

					Method method8 = newModelClass.getMethod("setSurname2",
							new Class[] { String.class });

					String value8 = oldCplModel.getSurname2();

					method8.invoke(newModel, value8);

					Method method9 = newModelClass.getMethod("setId",
							new Class[] { String.class });

					String value9 = oldCplModel.getId();

					method9.invoke(newModel, value9);

					Method method10 = newModelClass.getMethod("setBirthDate",
							new Class[] { Date.class });

					Date value10 = oldCplModel.getBirthDate();

					method10.invoke(newModel, value10);

					return newModel;
				}
				catch (Exception e) {
					_log.error(e, e);
				}
			}
			finally {
				Thread.currentThread().setContextClassLoader(contextClassLoader);
			}
		}

		return oldModel;
	}

	public static Object translateInput(List<Object> oldList) {
		List<Object> newList = new ArrayList<Object>(oldList.size());

		for (int i = 0; i < oldList.size(); i++) {
			Object curObj = oldList.get(i);

			newList.add(translateInput(curObj));
		}

		return newList;
	}

	public static Object translateInput(Object obj) {
		if (obj instanceof BaseModel<?>) {
			return translateInput((BaseModel<?>)obj);
		}
		else if (obj instanceof List<?>) {
			return translateInput((List<Object>)obj);
		}
		else {
			return obj;
		}
	}

	public static Object translateOutput(BaseModel<?> oldModel) {
		Class<?> oldModelClass = oldModel.getClass();

		String oldModelClassName = oldModelClass.getName();

		if (oldModelClassName.equals("com.primus.model.impl.PatientImpl")) {
			ClassLoader contextClassLoader = Thread.currentThread()
												   .getContextClassLoader();

			try {
				Thread.currentThread().setContextClassLoader(_classLoader);

				try {
					PatientClp newModel = new PatientClp();

					Method method0 = oldModelClass.getMethod("getPatientId");

					Long value0 = (Long)method0.invoke(oldModel, (Object[])null);

					newModel.setPatientId(value0);

					Method method1 = oldModelClass.getMethod("getCompanyId");

					Long value1 = (Long)method1.invoke(oldModel, (Object[])null);

					newModel.setCompanyId(value1);

					Method method2 = oldModelClass.getMethod("getGroupId");

					Long value2 = (Long)method2.invoke(oldModel, (Object[])null);

					newModel.setGroupId(value2);

					Method method3 = oldModelClass.getMethod("getCreatorUserId");

					Long value3 = (Long)method3.invoke(oldModel, (Object[])null);

					newModel.setCreatorUserId(value3);

					Method method4 = oldModelClass.getMethod("getCreateDate");

					Date value4 = (Date)method4.invoke(oldModel, (Object[])null);

					newModel.setCreateDate(value4);

					Method method5 = oldModelClass.getMethod("getModifiedDate");

					Date value5 = (Date)method5.invoke(oldModel, (Object[])null);

					newModel.setModifiedDate(value5);

					Method method6 = oldModelClass.getMethod("getName");

					String value6 = (String)method6.invoke(oldModel,
							(Object[])null);

					newModel.setName(value6);

					Method method7 = oldModelClass.getMethod("getSurname1");

					String value7 = (String)method7.invoke(oldModel,
							(Object[])null);

					newModel.setSurname1(value7);

					Method method8 = oldModelClass.getMethod("getSurname2");

					String value8 = (String)method8.invoke(oldModel,
							(Object[])null);

					newModel.setSurname2(value8);

					Method method9 = oldModelClass.getMethod("getId");

					String value9 = (String)method9.invoke(oldModel,
							(Object[])null);

					newModel.setId(value9);

					Method method10 = oldModelClass.getMethod("getBirthDate");

					Date value10 = (Date)method10.invoke(oldModel,
							(Object[])null);

					newModel.setBirthDate(value10);

					return newModel;
				}
				catch (Exception e) {
					_log.error(e, e);
				}
			}
			finally {
				Thread.currentThread().setContextClassLoader(contextClassLoader);
			}
		}

		return oldModel;
	}

	public static Object translateOutput(List<Object> oldList) {
		List<Object> newList = new ArrayList<Object>(oldList.size());

		for (int i = 0; i < oldList.size(); i++) {
			Object curObj = oldList.get(i);

			newList.add(translateOutput(curObj));
		}

		return newList;
	}

	public static Object translateOutput(Object obj) {
		if (obj instanceof BaseModel<?>) {
			return translateOutput((BaseModel<?>)obj);
		}
		else if (obj instanceof List<?>) {
			return translateOutput((List<Object>)obj);
		}
		else {
			return obj;
		}
	}

	private static Log _log = LogFactoryUtil.getLog(ClpSerializer.class);
	private static ClassLoader _classLoader;
}