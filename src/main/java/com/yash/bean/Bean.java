package com.yash.bean;

public class Bean {

	private BeanInterface beanInterfaceInterface;

	public BeanInterface getBeanInterfaceInterface() {
		return beanInterfaceInterface;
	}

	public void setBeanInterfaceInterface(BeanInterface beanInterfaceInterface) {
		this.beanInterfaceInterface = beanInterfaceInterface;
	}
	
	public void y(){
		beanInterfaceInterface.x();
	}
	
}
