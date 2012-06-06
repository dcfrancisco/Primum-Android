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
public class PatientConfigActivity extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.patient_config);
		populateLayout();
	}
	
	private void populateLayout() {
		txPatientId.setText(primumPrefs.patientId().get());
		txPatientPass.setText(primumPrefs.patientPass().get());
	}

	@Click(R.id.btnSave)
	void clickOnSave() {
		primumPrefs.edit()
			.patientId().put(txPatientId.getText().toString())
			.patientPass().put(txPatientPass.getText().toString()).apply();

		finish();
		
		Toast.makeText(this, R.string.patient_fixed, Toast.LENGTH_SHORT)
				.show();
		
		MainActivity_.intent(this).start();

	}
	
	@Click(R.id.btnCancel)
	void clickOnCancel(){
		finish();
		MainActivity_.intent(this).start();
	}
	
	@Click(R.id.btnClear)
	void clickOnClear(){
		txPatientId.setText("");
		txPatientPass.setText("");
	}
	

	@ViewById
	EditText txPatientId;
	@ViewById
	EditText txPatientPass;
	@Pref
	PrimumPrefs_ primumPrefs;
	private static String TAG = "PatientConfigActivity";
}
