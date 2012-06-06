package com.primum.mobile.util;

import com.googlecode.androidannotations.annotations.sharedpreferences.SharedPref;
import com.googlecode.androidannotations.annotations.sharedpreferences.SharedPref.Scope;

@SharedPref(value=Scope.UNIQUE)
public interface PrimumPrefs {
	String serviceUrl();
	String serviceUser();
	String servicepass();
	
	String patientId();
	String patientPass();
}
