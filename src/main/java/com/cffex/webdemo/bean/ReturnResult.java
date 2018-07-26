package com.cffex.webdemo.bean;

import java.io.Serializable;

public class ReturnResult implements Serializable{
	
	private int statu;
	
	private String msg;
	
	private Object data;

	public int getStatu() {
		return statu;
	}

	public void setStatu(int statu) {
		this.statu = statu;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "ReturnResult [statu=" + statu + ", msg=" + msg + ", data=" + data + "]";
	}
	
	
}
