package com.example.splashscreenb;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

public class SplashScreenActivity extends FragmentActivity {
	public static Activity splashScreenActivity;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash_screen_b_activity);
		splashScreenActivity=this;
	}

}
