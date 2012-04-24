package com.primum.mobile.activity;

import android.app.Activity;
import android.os.Bundle;

import com.googlecode.androidannotations.annotations.Click;
import com.googlecode.androidannotations.annotations.EActivity;
import com.primum.mobile.R;

@EActivity
public class MainActivity extends Activity {
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.main);
    }
	
	@Click(R.id.imgConfig)
	void clickOnConfig(){
		ConfigActivity_.intent(this).start();
	}
	
	private static String TAG = "MainActivity";
}
