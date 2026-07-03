package com.ashish.excelr2026javacoremaven;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.ashish.excelr2026javacoremaven.entity.Student;
public class AppForGet {

	


	    public static void main( String[] args )
	    {
	    	Configuration cfg=new Configuration();
	    	cfg.configure();
	    	SessionFactory factory=cfg.buildSessionFactory();


	    	Session session1=factory.openSession();
	    	Transaction tx=session1.beginTransaction();
	    	
//	    	Student s1 = new Student();
//	    	s1.setPer(81.0);
//	    	s1.setSname("Raj");
//
//	    	Student s2 = new Student();
//	    	s2.setPer(76.5);
//	    	s2.setSname("Priya");
//
//	    	Student s3 = new Student();
//	    	s3.setPer(92.0);
//	    	s3.setSname("Amit");
	    	
//	    	session1.save(s1);
//	    	session1.save(s2);
//	    	session1.save(s3);
	    	
	    	System.out.println("Record Inserted.");
	    	tx.commit();
	    	session1.close();
	    	factory.close();
	    	System.out.println("All resources closed.");
	    	
	    	
	    	
	    	

	    }
	

}