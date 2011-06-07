package com.primus;

import java.util.ArrayList;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletRequest;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.primus.model.Patient;
import com.primus.model.impl.PatientImpl;
import com.primus.service.PatientLocalServiceUtil;

/**
 * Portlet implementation class PatientsPortlet
 */
public class PatientsPortlet extends MVCPortlet {
 
	public void addPatient(ActionRequest request, ActionResponse response)
		throws Exception {
		
		ThemeDisplay themeDisplay =
			(ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);
		long userId = themeDisplay.getUserId();
		long groupId = themeDisplay.getScopeGroupId();
	
		Patient patient = patientFromRequest(request);
	
		ArrayList<String> errors = new ArrayList<String>();
		
		PatientLocalServiceUtil.addPatient(patient);
	
		SessionMessages.add(request, "patient-added");
	
		sendRedirect(request, response);
	}
	
	public void deletePatient(ActionRequest request, ActionResponse response)
		throws Exception {

		long patientId = ParamUtil.getLong(request, "patientId");
	
		PatientLocalServiceUtil.deletePatient(patientId);

		SessionMessages.add(request, "patient-deleted");
	
		sendRedirect(request, response);
	}
	
	public void updatePatient(ActionRequest request, ActionResponse response)
		throws Exception {

		Patient patient = patientFromRequest(request);
	
		PatientLocalServiceUtil.updatePatient(patient);

		SessionMessages.add(request, "patient-updated");

		sendRedirect(request, response);
	}

	private Patient patientFromRequest(PortletRequest request) 
		throws SystemException {
		
		ThemeDisplay themeDisplay =
			(ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);

		PatientImpl patient = new PatientImpl();
		
		long patientId = ParamUtil.getLong(request, "patientId");
		
		if (patientId == 0) {
			patientId = CounterLocalServiceUtil.increment();
		}
		
		// Audit fields
		
		patient.setPatientId(patientId);
		patient.setCompanyId(themeDisplay.getCompanyId());
		patient.setGroupId(themeDisplay.getScopeGroupId());
		patient.setCreatorUserId(themeDisplay.getUserId());
		
		// Other fields
		
		patient.setId(ParamUtil.getString(request, "id"));		
		patient.setName(ParamUtil.getString(request, "name"));
		patient.setSurname1(ParamUtil.getString(request, "surname1"));
		patient.setSurname2(ParamUtil.getString(request, "surname2"));		

		return patient;
	}

}
