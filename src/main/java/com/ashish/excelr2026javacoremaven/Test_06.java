package com.ashish.excelr2026javacoremaven;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.ashish.excelr2026javacoremaven.entity.Employee;

public class Test_06 {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();

		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

//        Employee emp = new Employee(101, "Ashish", 55000, "IT", "Male",
//                java.time.LocalDate.of(2003, 8, 15));
//
//        session.persist(emp);
//
//        tx.commit();
//
//        session.close();
//        factory.close();
//
//        System.out.println("Employee Inserted Successfully.");

//        2.: 
//        for(int i=1;i<=5;i++){
//
//            Employee emp = new Employee(
//                    1000+i,
//                    "Emp"+i,
//                    30000+i*1000,
//                    "IT",
//                    "Male",
//                    java.time.LocalDate.of(2000,1,i));
//
//            session.persist(emp);
//        }
//
//        tx.commit();
//
//        session.close();
//        factory.close();

//        3.:
//        Employee emp = session.get(Employee.class,101);
//
//        emp.setEname("Rahul");
//        emp.setDept("HR");
//        emp.setSalary(80000);
//
//        session.merge(emp);
//
//        tx.commit();
//
//        session.close();
//        factory.close();
//
//        System.out.println("Employee Updated");

//        4.: 
//		Employee emp = session.get(Employee.class,101);
//
//		session.remove(emp);
//
//		tx.commit();
//
//		session.close();
//		factory.close();
//
//		System.out.println("Employee Deleted");

//		5.: 

//		Employee emp = session.get(Employee.class, 1002);
//
//		System.out.println(emp);
//
//		session.close();
//		factory.close();

//		6.: 
//		String dept = "IT";
//
//		List<Employee> list = session.createQuery(
//		        "from Employee where dept=:d",
//		        Employee.class)
//		        .setParameter("d", dept)
//		        .list();
//
//		list.forEach(System.out::println);
//
//		session.close();
//		factory.close();

//		7.: 
//			String gender = "Male";
//
//		List<Employee> list = session.createQuery(
//		        "from Employee where gender=:g",
//		        Employee.class)
//		        .setParameter("g", gender)
//		        .list();
//
//		list.forEach(System.out::println);
//
//		session.close();
//		factory.close();

//		8.:

//		int year = 1999;
//
//		List<Employee> list = session.createQuery("from Employee where year(dob)>:y", Employee.class).setParameter("y", year)
//				.list();
//
//		list.forEach(System.out::println);
//
//		session.close();
//		factory.close();
		
//		List<Employee> list = session.createQuery(
//		        "from Employee where salary=(select max(salary) from Employee)",
//		        Employee.class)
//		        .list();
//
//		list.forEach(System.out::println);
//
//		session.close();
//		factory.close();
		
		List<Employee> list = session.createQuery(
		        "from Employee where dob=(select min(dob) from Employee)",
		        Employee.class)
		        .list();

		list.forEach(System.out::println);

		session.close();
		factory.close();
	}
}
