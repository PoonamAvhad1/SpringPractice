package com.yash.bean;

public class Bean2 {

	private Bean3 bean3;
	private Bean1 bean1;
	
	
	public Bean2() {
		
	}
	public Bean2(Bean3 bean3, Bean1 bean1) {
		super();
		this.bean3 = bean3;
		this.bean1 = bean1;
	}

	public Bean1 getBean1() {
		return bean1;
	}

/*	public void setBean1(Bean1 bean1) {
		this.bean1 = bean1;
	}
*/
	public Bean3 getBean3() {
		return bean3;
	}

	public void setBean3(Bean3 bean3) {
		this.bean3 = bean3;
	}
	
	public void bean2Method(){
		bean3.bean3Method();
	}
}
