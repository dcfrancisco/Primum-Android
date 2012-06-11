package com.primum.mobile.activity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.googlecode.androidannotations.annotations.Click;
import com.googlecode.androidannotations.annotations.EActivity;
import com.googlecode.androidannotations.annotations.ViewById;
import com.primum.mobile.R;

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
    		PatientData1Activity_.intent(this).start();
    	}
    	else{
    		Toast.makeText(this, R.string.select_one_test,  Toast.LENGTH_SHORT).show();
    	}
    	
    	
	}
    
    @Click(R.id.btnBack)
	void clickOnBack() {
    	finish();
	}
    
    @ViewById
    RadioGroup rgTests;
     
    private static String TAG = "TestsActivity";
}

