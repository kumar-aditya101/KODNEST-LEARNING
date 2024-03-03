package com.learn.spring.SpringAutoWiringProject_7;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	//Instructing Spring framwork to start its activity
    	ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
    	Professor probj = (Professor)ctx.getBean("prof");
        System.out.println( probj );
        
        College colobj = (College)ctx.getBean("coll");
        System.out.println(colobj);
    }
}
