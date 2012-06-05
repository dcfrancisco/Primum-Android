package com.primum.mobile.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.googlecode.androidannotations.annotations.Click;
import com.googlecode.androidannotations.annotations.EActivity;
import com.primum.mobile.R;

@EActivity
public class ResultActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
		Log.i(TAG, "onCreate");
        setContentView(R.layout.result);
    }
    
    @Click(R.id.btnSave)
   	void clickOnSave() {
    	//TODO:Save test locally
    	Toast.makeText(this, R.string.test_correctly_saved, Toast.LENGTH_LONG).show();
   	}
    
    @Click(R.id.btnSubmit)
   	void clickOnSubmit() {
    	//TODO:Save test locally and send to server
    	Toast.makeText(this, R.string.test_submited_correctly, Toast.LENGTH_LONG).show();
   	}
    
    @Click(R.id.btnHome)
   	void clickOnHome() {
    	finish();
   		MainActivity_.intent(this).flags(Intent.FLAG_ACTIVITY_CLEAR_TOP).start();
   		
   	}
    
    
    private static String TAG = "ResultActivity";
}

