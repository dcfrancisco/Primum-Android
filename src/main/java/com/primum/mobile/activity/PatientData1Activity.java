package com.primum.mobile.activity;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.Toast;

import com.googlecode.androidannotations.annotations.Background;
import com.googlecode.androidannotations.annotations.Click;
import com.googlecode.androidannotations.annotations.EActivity;
import com.googlecode.androidannotations.annotations.UiThread;
import com.googlecode.androidannotations.annotations.ViewById;
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

		String patientId = txPatientId.getText().toString();
		if(patientId.equals("")){
			Toast.makeText(this, R.string.please_enter_a_valid_patient_id, Toast.LENGTH_LONG).show();
			return;
		}
		
		dialog = ProgressDialog.show(this, "", 
                getString(R.string.loading_please_wait), true);
		dialog.show();
		
		askForPatientData(txPatientId.getText().toString());
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
		gotUserFromServer(null);
	}
	
	@UiThread
	void gotUserFromServer(Patient patient){
		dialog.cancel();
		if(patient==null){
			Toast.makeText(this, R.string.user_not_found_please_enter_data_manually, Toast.LENGTH_LONG).show();
			txName.setFocusable(true);
			txSurname1.setFocusable(true);
			txSurname2.setFocusable(true);
			txName.setText("ccc");
		}
		else{
			populateFileds(patient);
		}
		
	}
	
	private void populateFileds(Patient patient) {
		// TODO Populate fields
	}

	private boolean validateForm() {
		//TODO:Implement this method
		return true;
		
	}

	@ViewById
	EditText txPatientId;
	@ViewById
	EditText txName;
	@ViewById
	EditText txSurname1;
	@ViewById
	EditText txSurname2;
	private ProgressDialog dialog;
	private static String TAG = "PatientData1Activity";
}
