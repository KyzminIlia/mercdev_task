package com.example.splashscreenb;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;

public class SplashScreenActivity extends FragmentActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		RetainedFragment retainedFragment = new RetainedFragment();
		FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
		ft.add(android.R.id.content, retainedFragment);
		ft.commit();
		if (retainedFragment.needFinish()) {
			startActivity(new Intent(this, MainScreenActivity.class));
			finish();
		}
	}

}
