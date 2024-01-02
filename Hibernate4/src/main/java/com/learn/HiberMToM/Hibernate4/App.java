package com.learn.HiberMToM.Hibernate4;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	
    	Technology t1=new Technology();
    	Technology t2=new Technology();
    	Technology t3=new Technology();
    	Technology t4=new Technology();
    	
    	Software_Eng se1=new Software_Eng();
    	Software_Eng se2=new Software_Eng();
    	Software_Eng se3=new Software_Eng();
    	
    	List<Technology> techlist1=new ArrayList<Technology>();
    	techlist1.add(t1);
    	techlist1.add(t2);
    	
    	List<Technology> techlist2=new ArrayList<Technology>();
    	techlist1.add(t1);
    	techlist1.add(t2);
    	techlist1.add(t3);
    	techlist1.add(t4);
    	
    	List<Technology>techlist3=new ArrayList<Technology>();
    	techlist3.add(t1);    
    	techlist3.add(t3);  
    	
    	List<Software_Eng>selist1=new ArrayList<Software_Eng>();
    	selist1.add(se1);
    	selist1.add(se2);
    	selist1.add(se3);
    	

    	List<Software_Eng>selist2=new ArrayList<Software_Eng>();
    	selist1.add(se1);
    	selist1.add(se2);
    	
    	List<Software_Eng>selist3=new ArrayList<Software_Eng>();
    	
    	selist1.add(se2);
    	
List<Software_Eng>selist4=new ArrayList<Software_Eng>();
    	
    	selist1.add(se2);
    	selist1.add(se3);
    	
    	t1.setT_id(123);
    	t1.setT_name("java");
    	t1.setSe(selist1);
    	
    	t2.setT_id(124);
    	t2.setT_name("html");
    	t1.setSe(selist2);
    	
    	t3.setT_id(125);
    	t3.setT_name("css");
    	t3.setSe(selist3);
    	
    	t4.setT_id(126);
    	t4.setT_name("SQL");
    	t4.setSe(selist4);
    	
    	se1.setId(1);
    	se1.setName("sourav");
    	se1.setAge(23);
    	se1.setT_id(techlist1);
    	
    	se2.setId(2);
    	se2.setName("sachin");
    	se2.setAge(25);
    	se2.setT_id(techlist2);
    	
    	se3.setId(3);
    	se3.setName("sumit");
    	se3.setAge(27);
    	se3.setT_id(techlist3);	
    	Configuration cfg=new Configuration();
    	cfg.configure();
    	SessionFactory factory=cfg.buildSessionFactory();
    	Session session=factory.openSession();
    	Transaction tr=session.beginTransaction();
    	tr.commit();
    	
       
    }
}
