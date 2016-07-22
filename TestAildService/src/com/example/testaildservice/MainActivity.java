package com.example.testaildservice;

import java.util.HashMap;

import com.yc.external.Cmd;
import com.yc.external.ConnManager;
import com.yc.external.JsonHelper;
import com.yc.external.PostFromMusic;
import com.yc.external.PostFromRadio;
import com.yc.external.R;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

	private static final String TAG = "MainActivity";

	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		new PostFromMusic();
		new PostFromRadio();
	}

	public void doClick(View view){
		switch (view.getId()) {
		case R.id.getmusicinfo:
			String info = ConnManager.getInstance().getInfo(Cmd.GET_MUSIC_INFO);
			Log.i(TAG, "服务端获得音乐信息为：" + info);
			break;
		case R.id.getradioinfo:
			String info2 = ConnManager.getInstance().getInfo(Cmd.GET_RADIO_INFO);
			Log.i(TAG, "服务端获得收音机信息为：" + info2);
			break;
		case R.id.test:
			HashMap<String, String> maps = new HashMap<String, String>();
			maps.put("CurPath", "/mnt/USB/test.mp3");
			maps.put("CurFreq",	"8750");
			String jsonStr = new JsonHelper().map2Json(maps);
			Log.i(TAG, "测试maps2Str = " + jsonStr);
			maps = new JsonHelper().json2Map(jsonStr);
			Log.i(TAG, "测试json2Map = " + maps.toString());
			break;
		default:
			break;
		}
	}

}
