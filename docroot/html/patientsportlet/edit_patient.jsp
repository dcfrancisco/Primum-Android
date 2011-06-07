<%
/**
 * Copyright (c) 2000-2010 Liferay, Inc. All rights reserved.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
%>

<%@ include file="/html/patientsportlet/init.jsp" %>

<%
Patient patient = null;

long patientId = ParamUtil.getLong(request, "patientId");

if (patientId > 0) {
	patient = PatientLocalServiceUtil.getPatient(patientId);
}

String redirect = ParamUtil.getString(request, "redirect");
%>

<liferay-ui:header
	backURL="<%= redirect %>"
	title='<%= (patient != null) ? patient.getName() : "new-patient" %>'
/>

<liferay-ui:success key="patient-added" message="patient-added" />

<aui:model-context bean="<%= patient %>" model="<%= Patient.class %>" />

<portlet:actionURL name='<%= patient == null ? "addPatient" : "updatePatient" %>' var="editPatientURL" />

<aui:form action="<%= editPatientURL %>" method="POST" name="fm">
	<aui:fieldset>
		<aui:input type="hidden" name="redirect" value="<%= redirect %>" />

		<aui:input type="hidden" name="patientId" value='<%= patient == null ? "" : patient.getPatientId() %>'/>

		<liferay-ui:error key="patientid-required" message="patientid-required" />
		<aui:input name="id" />
		
		<liferay-ui:error key="patientname-required" message="patientname-required" />
		<aui:input name="name" />
		
		<liferay-ui:error key="patientsurname1-required" message="patientsurname1-required" />
		<aui:input name="surname1" />
		
		<liferay-ui:error key="patientsurname2-required" message="patientsurname2-required" />
		<aui:input name="surname2" />
	</aui:fieldset>

	<aui:button-row>
		<aui:button type="submit" />

		<aui:button type="cancel"  onClick="<%= redirect %>" />
	</aui:button-row>
</aui:form>