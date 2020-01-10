package com.yash.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;

public class OuterBean implements BeanFactoryAware,BeanNameAware{

	public OuterBean(){
		
		System.out.println("Outer Bean constructor");
	}
	public static class  InnerBean{
		public InnerBean(){
			System.out.println("Inner Bean");
		}
	}
	
	private BeanFactory beanFactory;
	
	
	
	private AnnoyBean annoyBean;

	public AnnoyBean getAnnoyBean() {
		return annoyBean;
	}

	public void setAnnoyBean(AnnoyBean annoyBean) {
		this.annoyBean = annoyBean;
	}

	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		this.beanFactory=beanFactory;
		
	}
	
	public void x(){
		System.out.println("---x---");
	}

	public void setBeanName(String arg0) {
		System.out.println("Bean name:"+arg0);
		
	}
}
