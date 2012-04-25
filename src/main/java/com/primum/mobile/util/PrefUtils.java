package com.primum.mobile.util;

public class PrefUtils {

	public static boolean allPrefsSet(PrimumPrefs_ primumPrefs) {
		return allPrefsExist(primumPrefs) && noneBlank(primumPrefs);
	}

	public static boolean allPrefsExist(PrimumPrefs_ primumPrefs) {
		return primumPrefs.deviceId().exists()
				&& primumPrefs.devicePass().exists()
				&& primumPrefs.serviceUrl().exists()
				&& primumPrefs.serviceUser().exists()
				&& primumPrefs.servicepass().exists();
	}

	public static boolean noneBlank(PrimumPrefs_ primumPrefs) {
		return !primumPrefs.deviceId().get().equals("")
				&& !primumPrefs.devicePass().get().equals("")
				&& !primumPrefs.serviceUrl().get().equals("")
				&& !primumPrefs.serviceUser().get().equals("")
				&& !primumPrefs.servicepass().get().equals("");
	}

}
