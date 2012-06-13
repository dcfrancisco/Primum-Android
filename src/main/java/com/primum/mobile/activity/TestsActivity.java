package com.primum.mobile.activity;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.googlecode.androidannotations.annotations.Background;
import com.googlecode.androidannotations.annotations.Click;
import com.googlecode.androidannotations.annotations.EActivity;
import com.googlecode.androidannotations.annotations.UiThread;
import com.googlecode.androidannotations.annotations.ViewById;
import com.googlecode.androidannotations.annotations.sharedpreferences.Pref;
import com.primum.mobile.R;
import com.primum.mobile.util.PrefUtils;
import com.primum.mobile.util.PrimumPrefs_;

@EActivity
public class TestsActivity extends Activity implements DialogInterface.OnClickListener{

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
		Log.i(TAG, "onCreate");
        setContentView(R.layout.tests);
    }
    
    @Click(R.id.btnStart)
	void clickOnStart() {
    	int selected = rgTests.getCheckedRadioButtonId();
    	if(selected!=-1){
    		if(!PrefUtils.isUserSelected(primumPrefs)){
    			PatientData1Activity_.intent(this).start();
    		}
    		else{
    			displayConfirmDialog();
    		}
    	}
    	else{
    		Toast.makeText(this, R.string.select_one_test,  Toast.LENGTH_SHORT).show();
    	}
	}
    
    @Click(R.id.btnBack)
	void clickOnBack() {
    	finish();
	}
    
    @Override
	public void onClick(DialogInterface dialog, int which) {
    	switch (which) {
		case AlertDialog.BUTTON1:
			ResultActivity_.intent(this).start();	
			break;

		case AlertDialog.BUTTON2:
			//NOP
			break;
		}
	}
    
	private void displayConfirmDialog() {
		new AlertDialog.Builder(this)
				.setTitle("Confirm user")
				.setMessage("Perform test with patient " + primumPrefs.patientId().get() + "?")
				.setIcon(android.R.drawable.ic_dialog_info)
				.setPositiveButton(android.R.string.yes,this)
				.setNegativeButton(android.R.string.no, this)
				.show();
	}
    
    @ViewById
    RadioGroup rgTests;
    @Pref
	PrimumPrefs_ primumPrefs;
    private static String TAG = "TestsActivity";
	
}

