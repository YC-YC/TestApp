/**
 * 
 */
package com.yc.external;

import android.util.Log;

/**
 * @author YC
 * @time 2016-7-15 下午3:12:41
 * TODO:处理音乐Post过来的信息
 */
public class PostFromMusic implements IPostFromClient {

	private static final String TAG = "PostFromMusic";

	@Override
	public boolean postInfo(int cmd, String val) {
		switch (cmd) {
		case Cmd.POST_MUSIC_INFO:
			Log.i(TAG, "PostFromMusic处理音乐信息：" + val);
			return true;
		}
		return false;
	}
	
	public PostFromMusic(){
		ConnManager.getInstance().register(this);
	}
	
	@Override
	protected void finalize() throws Throwable {
		ConnManager.getInstance().unregister(this);
		super.finalize();
	}

}
