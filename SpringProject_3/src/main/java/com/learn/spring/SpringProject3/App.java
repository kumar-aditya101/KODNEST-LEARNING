package com.learn.spring.SpringProject3;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
    	Employee empobj = (Employee)ctx.getBean("emp");
        System.out.println(empobj);
    }
}
