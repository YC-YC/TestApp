package com.example.testaidlclient;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import com.yc.conn.ConnExternal;
import com.yc.external.Cmd;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ConnExternal.getInstance().bindService(this);
		new RadioInfo2();
	}

	

	public void doClick(View view){
		switch (view.getId()) {
		case R.id.postmusicinfo:
			ConnExternal.getInstance().postInfo(Cmd.POST_MUSIC_INFO, "test postMusicInfo");
			break;
		case R.id.postradioinfo:
			ConnExternal.getInstance().postInfo(Cmd.POST_RADIO_INFO, "test postRadioInfo");
			break;
		default:
			break;
		}
	}
	
	@Override
	protected void onDestroy() {
		ConnExternal.getInstance().unbindService();
		super.onDestroy();
	}
	
}
