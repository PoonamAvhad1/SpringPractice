package com.yash.bean;

public class Bean1 {

	private Bean2 bean2;

	public Bean1(){}
	
	public Bean1(Bean2 bean2) {
		super();
		this.bean2 = bean2;
	}

	public Bean2 getBean2() {
		return bean2;
	}

	public void setBean2(Bean2 bean2) {
		this.bean2 = bean2;
	}
	
	public void someMethod(){
		System.out.println("some method");
	}
	
	public void bean1Method(){
		bean2.bean2Method();
	}
	
}
