package com.primum.mobile.activity;

import android.app.Activity;
import android.os.Bundle;

import com.googlecode.androidannotations.annotations.Click;
import com.googlecode.androidannotations.annotations.EActivity;
import com.googlecode.androidannotations.annotations.sharedpreferences.Pref;
import com.primum.mobile.R;
import com.primum.mobile.util.PrefUtils;
import com.primum.mobile.util.PrimumPrefs_;

@EActivity
public class MainActivity extends Activity {
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        
        if(!PrefUtils.allPrefsSet(primumPrefs)){
        	finish();
        	ConfigActivity_.intent(this).start();
        }
        setContentView(R.layout.main);
    }
	
	@Click(R.id.imgConfig)
	void clickOnConfig(){
		ConfigActivity_.intent(this).start();
	}
	
	@Click(R.id.imgNewTest)
	void clickOnNewTest(){
		TestsActivity_.intent(this).start();
	}
	
	
	@Pref
	PrimumPrefs_ primumPrefs; 
	private static String TAG = "MainActivity";
}
