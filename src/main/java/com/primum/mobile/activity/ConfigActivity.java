package com.primum.mobile.activity;

import android.app.Activity;
import android.os.Bundle;

import com.googlecode.androidannotations.annotations.Click;
import com.googlecode.androidannotations.annotations.EActivity;
import com.primum.mobile.R;

@EActivity
public class ConfigActivity extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.config);
	}
	
	@Click(R.id.btnSave)
	void clickOnSave(){
		finish();
	}
	
	@Click(R.id.btnCancel)
	void clickOnCancel(){
		finish();
	}

	private static String TAG = "ConfigActivity";
}
