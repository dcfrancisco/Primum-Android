package com.primum.mobile.activity;

import android.app.Activity;
import android.app.ProgressDialog;
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
		dialog = ProgressDialog.show(this, "", 
                "Loading. Please wait...", true);
		dialog.show();
		askForPatientData("");
	}
	
	@Click(R.id.btnNext)
	void clickOnNext() {
		if(validateForm()){
			PatientData2Activity_.intent(this).start();
		}
	}
	
	@Click(R.id.btnCancel)
	void clickOnCancel() {
		MainActivity_.intent(this).start();
	}

	@Background
	void askForPatientData(String idNumber) {
		
		try {
			Thread.currentThread().sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		gotUserFromServer(new Patient());
	}
	
	@UiThread
	void gotUserFromServer(Patient patient){
		dialog.cancel();
		Toast.makeText(this, "hahaaaa!!", Toast.LENGTH_LONG).show();
	}
	
	private boolean validateForm() {
		//TODO:Implement this method
		return true;
		
	}

	private ProgressDialog dialog;
	private static String TAG = "PatientData1Activity";
}
