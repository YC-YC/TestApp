package com.example.testaidl1;

import com.yc.conn.ConnExternal;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ConnExternal.getInstance().init(this);
		new MusicInfo();
		
	}


}
