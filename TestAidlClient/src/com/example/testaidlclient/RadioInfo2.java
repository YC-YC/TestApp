/**
 * 
 */
package com.example.testaidlclient;

import com.yc.external.BaseGetInfo;
import com.yc.external.Cmd;

/**
 * @author YC
 * @time 2016-7-15 下午6:23:04
 * TODO:
 */
public class RadioInfo2 extends BaseGetInfo {

	@Override
	public String getInfo(int cmd) {
		switch (cmd) {
		case Cmd.GET_RADIO_INFO:
			return "RadioInfo";
		default:
			break;
		}
		return null;
	}

	@Override
	public String getClientInfo(int cmd) {
		switch (cmd) {
		case Cmd.GET_RADIO_INFO:
			return "RadioInfo";
		default:
			break;
		}
		return null;
	}
	

}
