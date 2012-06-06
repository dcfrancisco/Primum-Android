package com.primum.mobile.activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

import com.googlecode.androidannotations.annotations.Click;
import com.googlecode.androidannotations.annotations.EActivity;
import com.googlecode.androidannotations.annotations.ViewById;
import com.googlecode.androidannotations.annotations.sharedpreferences.Pref;
import com.primum.mobile.R;
import com.primum.mobile.util.PrefUtils;
import com.primum.mobile.util.PrimumPrefs_;

@EActivity
public class DeviceConfigActivity extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.device_config);
		populateLayout();
	}

	@Click(R.id.btnSave)
	void clickOnSave(){
		primumPrefs.edit()
			.serviceUrl().put(txServiceUrl.getText().toString())
			.serviceUser().put(txServiceUser.getText().toString())
			.servicepass().put(txServicePass.getText().toString())
			.apply();
			
		if(!PrefUtils.allPrefsSet(primumPrefs)){
			Toast.makeText(this, R.string.not_all_preferences_set, Toast.LENGTH_SHORT).show();
		}
		else{
			finish();
			Toast.makeText(this, R.string.preferences_saved, Toast.LENGTH_SHORT).show();
			MainActivity_.intent(this).start();
		}
	}
	
	@Click(R.id.btnCancel)
	void clickOnCancel(){
		if(!PrefUtils.allPrefsSet(primumPrefs)){
			Toast.makeText(this, "R.string.not_all_preferences_set", Toast.LENGTH_SHORT).show();
		}
		else{
			finish();
			MainActivity_.intent(this).start();
		}
	}
	
	private void populateLayout() {

		txServiceUrl.setText(primumPrefs.serviceUrl().get());
		txServiceUser.setText(primumPrefs.serviceUser().get());
		txServicePass.setText(primumPrefs.servicepass().get());
	}

	@ViewById
	EditText txServiceUrl;
	@ViewById
	EditText txServiceUser;
	@ViewById
	EditText txServicePass;

	@Pref
	PrimumPrefs_ primumPrefs; 
	private static String TAG = "ConfigActivity";
}
