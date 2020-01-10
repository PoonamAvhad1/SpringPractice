package com.yash.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yash.bean.BaenA;
import com.yash.bean.Bean;
import com.yash.bean.Bean1;
import com.yash.bean.Bean4;
import com.yash.bean.BeanB;
import com.yash.bean.ChildCollection;
import com.yash.bean.OuterBean;
import com.yash.bean.ParentCollection;
import com.yash.bean.SubAbstractBean;

public class IOCContainer {
	
	public static void main(String[] args) {
		ApplicationContext ioc=new ClassPathXmlApplicationContext("applicationContext.xml");
		Bean bean=(Bean)ioc.getBean("bean");
		bean.y();
				
		Bean1 bean1=(Bean1)ioc.getBean("bean1");
		bean1.bean1Method();
	
//		SubAbstractBean subAbstractBean=(SubAbstractBean)ioc.getBean("subabstractbean");
//		System.out.println(subAbstractBean.x());
		
		ParentCollection parentCollection=(ParentCollection)ioc.getBean("parentcollection");
		System.out.println(parentCollection);
		
		ChildCollection childCollection=(ChildCollection)ioc.getBean("childcollection");
		System.out.println(childCollection);
		
		
		BaenA beanA=(BaenA)ioc.getBean("beana");
		BeanB  beanB=(BeanB)ioc.getBean("beanb");
		
		
		OuterBean outerBean=(OuterBean)ioc.getBean("outerBean");
		
	}
	
	
	
	

}
