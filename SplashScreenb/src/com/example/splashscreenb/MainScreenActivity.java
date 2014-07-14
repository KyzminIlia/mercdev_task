package com.example.splashscreenb;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainScreenActivity extends Activity {
	String[] listItem = new String[20];
	final public String LOG_TAG = this.getClass().getSimpleName();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.a_main);
		Log.d(LOG_TAG, "Main activity created");
		ListView mainScreenLV = (ListView) findViewById(R.id.main_screen_list_view);
		Log.d(LOG_TAG, "View was found");
		for (int i = 0; i < 20; i++)
			listItem[i] = "Item " + (i + 1);
		ArrayAdapter<String> listViewAdapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, listItem);
		mainScreenLV.setAdapter(listViewAdapter);

	}

	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
		Log.d(LOG_TAG, "Main activity stopped");
	}

	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		Log.d(LOG_TAG, "Main activity destroyed");
	}
}
