package com.primum.mobile.activity;

import android.app.Activity;
import android.app.ProgressDialog;
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
public class TestsActivity extends Activity {

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
    			dialog = ProgressDialog.show(this, "",
    					getString(R.string.performing_test_please_wait), true);
    			dialog.show();
    			performTest(selected);
    		}
    	}
    	else{
    		Toast.makeText(this, R.string.select_one_test,  Toast.LENGTH_SHORT).show();
    	}
    	
    	
	}
    
    
	@Background
	void performTest(long testId) {
		try {
			Thread.currentThread().sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		testFinished();
	}
    
    @UiThread
	void testFinished(){
		dialog.cancel();
		Toast.makeText(this, R.string.test_finished, Toast.LENGTH_LONG).show();
		finish();
		ResultActivity_.intent(this).start();
	}
    
    @Click(R.id.btnBack)
	void clickOnBack() {
    	finish();
	}
    
    @ViewById
    RadioGroup rgTests;
    @Pref
	PrimumPrefs_ primumPrefs;
    private ProgressDialog dialog;
    private static String TAG = "TestsActivity";
}

