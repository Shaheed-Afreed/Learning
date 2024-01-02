package com.learn.Hibernateproj1.Hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg=new Configuration();
    	cfg.configure();
    	SessionFactory factory=cfg.buildSessionFactory();
    	System.out.println(factory);
        System.out.println( "Hibernate is established" );
    }
}
