package com.example.testaidl1;

import java.util.HashMap;

import com.yc.conn.ConnExternal;
import com.yc.external.Cmd;
import com.yc.external.JsonHelper;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ConnExternal.getInstance().bindService(this);
		new MusicInfo2();
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("title", "kdjfoi");
		map.put("file", "sdf1a21");
		ConnExternal.getInstance().postInfo(Cmd.POST_MUSIC_INFO, new JsonHelper().map2Json(map));
		
	}

	@Override
	protected void onDestroy() {
		ConnExternal.getInstance().unbindService();
		super.onDestroy();
	}

}
