package com.primum.mobile.activity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.googlecode.androidannotations.annotations.Click;
import com.googlecode.androidannotations.annotations.EActivity;
import com.primum.mobile.R;

@EActivity
public class StartActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
		Log.i(TAG, "onCreate");
        setContentView(R.layout.start);
    }
    
    @Click(R.id.btnStart)
    public void onClickStart(){
    	MainActivity_.intent(this).start();
    }
    
    private static String TAG = "StartActivity";
}

