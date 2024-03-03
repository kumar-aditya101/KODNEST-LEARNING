package com.learn.hibernate.HibernateProjextEx_1;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg = new Configuration();
    	cfg.configure();
    	SessionFactory factory = cfg.buildSessionFactory();
    	System.out.println(factory);
        System.out.println( "Hibernate is working" );
    }
}


//Mapping
//One To One Mapping
//One to many mapping or many to one mapping
//Many to many mapping

//CRUD operation