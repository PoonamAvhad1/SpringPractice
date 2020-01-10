package com.yash.bean;

public class BeanB {

	public BeanB() {
	System.out.println("---Bean B---");
	}
	
	
	public void X(){
		System.out.println("uses objects initialized in static block of BeanA");
		
	}
}
