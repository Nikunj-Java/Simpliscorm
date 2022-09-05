package com.simplilearn.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	
    	//BeanFactory factory=new XmlBeanFactory(resources);
    	ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
    	
    	HelloWorld h= (HelloWorld)context.getBean("obj");
    	h.print();
       
    	//default event handling
    	
    	ConfigurableApplicationContext context1= new ClassPathXmlApplicationContext("main-servlet.xml");
    	context1.start();
    	context1.stop();
    }
}
