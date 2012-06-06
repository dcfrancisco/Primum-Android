package com.primum.mobile.activity;

import android.app.TabActivity;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TabHost;

import com.googlecode.androidannotations.annotations.EActivity;
import com.primum.mobile.R;

@EActivity
public class ConfigActivity extends TabActivity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.config);
		
		Resources res = getResources();
		tabHost = getTabHost();
	    TabHost.TabSpec spec;
	    
	    spec = tabHost.newTabSpec("device").setIndicator("Device",
                res.getDrawable(android.R.drawable.ic_menu_manage))
            .setContent(DeviceConfigActivity_.intent(this). get());
		tabHost.addTab(spec);
		
		
		spec = tabHost.newTabSpec("user").setIndicator("Patient",
                res.getDrawable(android.R.drawable.ic_menu_set_as))
            .setContent(PatientConfigActivity_.intent(this). get());
		tabHost.addTab(spec);
		
		tabHost.setCurrentTab(0);
		
	}
	
	

	TabHost tabHost;
	static String TAG = "ConfigActivity";
}
