package com.training.employee;

public class Area {
	private int l;
	private int w;
	public Area() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Area(int l, int w) {
		super();
		this.l = l;
		this.w = w;
	}
	public int getL() {
		return l;
	}
	public void setL(int l) {
		this.l = l;
	}
	public int getW() {
		return w;
	}
	public void setW(int w) {
		this.w = w;
	}
	public int res1(int l,int w) {
		int res=l*w;
		return res;
	}

}
