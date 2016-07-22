/**
 * 
 */
package com.example.testaidl1;

import com.yc.conn.ConnExternal;
import com.yc.external.Cmd;
import com.yc.external.IGetFromClient;

/**
 * @author YC
 * @time 2016-7-15 下午6:23:04
 * TODO:
 */
public class MusicInfo implements IGetFromClient {

	@Override
	public String getInfo(int cmd) {
		switch (cmd) {
		case Cmd.GET_MUSIC_INFO:
			return "MusicInfo";

		default:
			break;
		}
		return null;
	}
	
	public MusicInfo() {
		ConnExternal.getInstance().register(this);
	}
	
	@Override
	protected void finalize() throws Throwable {
		ConnExternal.getInstance().unregister(this);
		super.finalize();
	}
	

}
