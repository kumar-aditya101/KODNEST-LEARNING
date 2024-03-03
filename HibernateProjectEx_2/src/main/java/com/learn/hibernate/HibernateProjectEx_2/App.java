package com.learn.hibernate.HibernateProjectEx_2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg = new Configuration();
    	cfg.configure();
    	SessionFactory factory = cfg.buildSessionFactory();
    	Session session = factory.openSession();
    	Transaction tr = session.beginTransaction();
    	Student st = new Student(1,"Shreya",98);
    	session.save(st);
    	tr.commit();
    	System.out.println( "Student object is created and saved" );
    }
}
