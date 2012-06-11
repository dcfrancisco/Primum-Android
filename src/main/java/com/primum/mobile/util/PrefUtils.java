package com.primum.mobile.util;

public class PrefUtils {

	public static boolean allPrefsSet(PrimumPrefs_ primumPrefs) {
		return allPrefsExist(primumPrefs) && noneBlank(primumPrefs);
	}

	public static boolean allPrefsExist(PrimumPrefs_ primumPrefs) {
		return primumPrefs.serviceUrl().exists()
				&& primumPrefs.serviceUser().exists()
				&& primumPrefs.servicepass().exists();
	}

	public static boolean noneBlank(PrimumPrefs_ primumPrefs) {
		return !primumPrefs.serviceUrl().get().equals("")
				&& !primumPrefs.serviceUser().get().equals("")
				&& !primumPrefs.servicepass().get().equals("");
	}
	
	public static boolean isUserSelected(PrimumPrefs_ primumPrefs) {
		return !primumPrefs.patientId().get().equals("")
				&& !primumPrefs.patientPass().get().equals("");
	}

}
