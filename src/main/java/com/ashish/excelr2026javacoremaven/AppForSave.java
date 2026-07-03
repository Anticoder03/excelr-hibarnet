package com.ashish.excelr2026javacoremaven;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.ashish.excelr2026javacoremaven.entity.Student;
public class AppForSave {

	


	    public static void main( String[] args )
	    {
	    	Configuration cfg=new Configuration();
	    	cfg.configure();
	    	SessionFactory factory=cfg.buildSessionFactory();


	    	Session session1=factory.openSession();
	    	
//	    	fetch the records.
//	    	get        load
//	    	get->
			/*
			 * Student stud1 = session1.get(Student.class, 1); 
			 * System.out.println("Hello");
			 * System.out.println(stud1);
			 * 
			 * 
			 * Student stud2 = session1.get(Student.class, 1);
			 * System.out.println(stud2==stud1);
			 */
	    	Student stud1 = session1.get(Student.class, 16);
	    	System.out.println(stud1);
	    	
	    	
	    	session1.close();
	    	factory.close();
	    	System.out.println("All resources closed.");
	    	
	    	
	    	
	    	

	    }
	

}