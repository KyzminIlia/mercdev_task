package com.example.splashscreenb;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class RetainedFragment extends Fragment {
	final public String LOG_TAG = this.getClass().getSimpleName();
	boolean splashIsDestroy = false;
	boolean nullActivity = false;


	public boolean needFinish() {
		return nullActivity;
	}

	@Override
	public void onDestroy() {
		super.onDestroy();
		splashIsDestroy = true;
		Log.d(LOG_TAG, "splash destroyed");
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Log.d(LOG_TAG, "Created fragment");
		Handler h = new Handler() {
			public void handleMessage(android.os.Message msg) {
				if (!splashIsDestroy)
					if (getActivity() == null)
						nullActivity = true;
					else {
						startActivity(new Intent(getActivity(),
								MainScreenActivity.class));
						Log.d(LOG_TAG, "Main started");
						getActivity().finish();
					}

			};
		};
		h.sendEmptyMessageDelayed(0, 2000);
		Log.d(LOG_TAG, "Handler  started");

	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		Log.d(LOG_TAG, "Activity created");

	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		super.onCreateView(inflater, container, savedInstanceState);
		View v = inflater.inflate(R.layout.f_splash, null);
		setRetainInstance(true);
		Log.d(LOG_TAG, "View created");
		return v;
	}

}
