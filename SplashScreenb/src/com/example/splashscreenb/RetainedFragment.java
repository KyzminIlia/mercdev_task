package com.example.splashscreenb;

import java.util.Timer;
import java.util.TimerTask;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class RetainedFragment extends Fragment {
	final String LOG_TAG = "MyLog";
	boolean splashIsDestroy = false;
	Intent intent;
	Timer timer;

	@Override
	public void onDestroy() {
		super.onDestroy();
		splashIsDestroy = true;
		Log.d(LOG_TAG, "splash destroyed");
	}

	class turnTask extends TimerTask {
		@Override
		public void run() {
			if (!splashIsDestroy) {
				startActivity(intent);
				Log.d(LOG_TAG, "Main started");
				getActivity().finish();
				Log.d(LOG_TAG, "Splash finish");
				timer.cancel();
				Log.d(LOG_TAG, "timer cancelled");
			}
		}

	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		timer = new Timer();
		timer.schedule(new turnTask(), 2000);
		Log.d(LOG_TAG, "Timer started");

	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		Log.d(LOG_TAG, "Activity created");
		intent = new Intent(getActivity(), Main_screen_activity.class);

	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		super.onCreateView(inflater, container, savedInstanceState);
		View v = inflater.inflate(R.layout.splash_screen_retain_fragment, null);
		setRetainInstance(true);
		Log.d(LOG_TAG, "View created");
		return v;
	}

}
