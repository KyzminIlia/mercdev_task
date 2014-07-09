package com.example.splashscreenb;

import java.util.Timer;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.app.Fragment;

public class RetainedFragment extends Fragment{
	Timer timer;
@Override
public View onCreateView(LayoutInflater inflater, ViewGroup container,
		Bundle savedInstanceState) {
	View myFragmentView =  inflater.inflate(R.layout.retained_fragment,container,false);
	return myFragmentView;
}
	public void setTimer(Timer timer){
		this.timer=timer;
	}
	public Timer getTimer(){
		return timer;
	}
}
