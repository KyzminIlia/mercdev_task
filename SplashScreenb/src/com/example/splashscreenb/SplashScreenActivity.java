package com.example.splashscreenb;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

public class SplashScreenActivity extends FragmentActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash_screen_b_activity);
		RetainedFragment retainedFragment =(RetainedFragment)getFragmentManager().findFragmentById(R.id.retainFragment);
		if (retainedFragment.needFinish()) {
			startActivity(new Intent(this, MainScreenActivity.class));
			finish();
		}
	}

}
