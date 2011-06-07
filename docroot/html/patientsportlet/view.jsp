<%--
/**
* Copyright (c) 2000-2010 Liferay, Inc. All rights reserved.
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
--%>

<%@ include file="/html/patientsportlet/init.jsp" %>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<portlet:defineObjects />

<liferay-ui:success key="patient-added" message="patient-added-successfully" />
<liferay-ui:success key="patient-updated" message="patient-updated-successfully" />
<liferay-ui:success key="patient-deleted" message="patient-deleted-successfully" />

<liferay-ui:error key="patient-has-books" message="patient-has-books" />

<%
String redirect = PortalUtil.getCurrentURL(renderRequest);	
%>

<aui:button-row>	
	<portlet:renderURL var="addPatientURL">
		<portlet:param name="jspPage" value="/html/patientsportlet/edit_patient.jsp" />
		<portlet:param name="redirect" value="<%= redirect %>" />
	</portlet:renderURL>

	<aui:button value="add-patient" onClick="<%= addPatientURL.toString() %>"/>	
</aui:button-row>

<liferay-ui:search-container delta='<%= GetterUtil.getInteger(prefs.getValue("rowsPerPage", "10")) %>' emptyResultsMessage="patient-empty-results-message">
	<liferay-ui:search-container-results		
		results="<%= PatientLocalServiceUtil.getPatients(searchContainer.getStart(), searchContainer.getEnd()) %>"
		total="<%= PatientLocalServiceUtil.getPatientsCount() %>"
	/>

	<liferay-ui:search-container-row
		className="com.primus.model.Patient"
		keyProperty="patientId"
		modelVar="patient"
		escapedModel="true"
	>
		<liferay-ui:search-container-column-text
			name="name"
			value="<%= patient.getName() %>"
		/>
		
		<liferay-ui:search-container-column-text
			name="surnames"
			value='<%= patient.getSurname1() + " " + patient.getSurname2() %>'
		/>

		<liferay-ui:search-container-column-jsp
			align="right"
			path="/html/patientsportlet/patient_actions.jsp"
		/>
	</liferay-ui:search-container-row>

	<liferay-ui:search-iterator />
</liferay-ui:search-container>