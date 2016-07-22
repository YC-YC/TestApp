/**
 * 
 */
package com.yc.external;

import android.util.Log;

/**
 * @author YC
 * @time 2016-7-15 下午3:12:41
 * TODO:处理收音机Post过来的信息
 */
public class PostFromRadio implements IPostFromClient {

	private static final String TAG = "PostFromRadio";

	@Override
	public boolean postInfo(int cmd, String val) {
		switch (cmd) {
		case Cmd.POST_RADIO_INFO:
			Log.i(TAG, "ExternalRadio处理收音机信息：" + val);
			return true;
		}
		return false;
	}
	
	public PostFromRadio(){
		ConnManager.getInstance().register(this);
	}
	
	@Override
	protected void finalize() throws Throwable {
		ConnManager.getInstance().unregister(this);
		super.finalize();
	}

}
