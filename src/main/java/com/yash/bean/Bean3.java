package com.yash.bean;

public class Bean3 {

	private Bean4 bean4;

	public Bean4 getBean4() {
		return bean4;
	}

	public void setBean4(Bean4 bean4) {
		this.bean4 = bean4;
	}
	
	public void bean3Method(){
		bean4.bean4Method();
	}
}
