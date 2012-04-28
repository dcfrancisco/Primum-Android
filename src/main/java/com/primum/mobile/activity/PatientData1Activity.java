package com.primum.mobile.activity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.googlecode.androidannotations.annotations.Background;
import com.googlecode.androidannotations.annotations.Click;
import com.googlecode.androidannotations.annotations.EActivity;
import com.googlecode.androidannotations.annotations.UiThread;
import com.primum.mobile.R;
import com.primum.mobile.model.Patient;

@EActivity
public class PatientData1Activity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Log.i(TAG, "onCreate");
		setContentView(R.layout.patient_data_1);
	}

	@Click(R.id.btnGetData)
	void clickOnGet() {
		askForPatientData("");
	}

	@Background
	void askForPatientData(String idNumber) {
		gotUserFromServer(new Patient());
	}
	
	@UiThread
	void gotUserFromServer(Patient patient){
		Toast.makeText(this, "hahaaaa!!", Toast.LENGTH_LONG).show();
	}

	private static String TAG = "PatientData1Activity";
}
