package com.example.splashscreenb;

import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.app.Activity;

public class SplashScreenActivity extends FragmentActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.a_splash);		
		RetainedFragment retainedFragment = (RetainedFragment) getSupportFragmentManager()
				.findFragmentById(R.id.retainFragment);
		if (retainedFragment.needFinish()) {
			startActivity(new Intent(this, MainScreenActivity.class));
			finish();
		}
	}

}
