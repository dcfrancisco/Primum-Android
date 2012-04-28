package com.primum.mobile.activity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.googlecode.androidannotations.annotations.Click;
import com.googlecode.androidannotations.annotations.EActivity;
import com.primum.mobile.R;

@EActivity
public class PatientData2Activity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
		Log.i(TAG, "onCreate");
        setContentView(R.layout.patient_data_2);
    }
    
    
    private static String TAG = "PatientData2Activity";
}

