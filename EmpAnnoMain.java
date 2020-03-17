package com.dao;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.pojo.EmpPojo_Annotation;
import com.pojo.Emp_Pojo;

public class EmpAnnoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 SessionFactory sessionFactory = 
			        new Configuration().configure("cts_hibernate.cfg.xml").buildSessionFactory();
			      
			      Session session = sessionFactory.openSession();
			      //start a transaction
			      Transaction tx = session.beginTransaction();
			      EmpPojo_Annotation e1 = new EmpPojo_Annotation();
			      Scanner sc = new Scanner(System.in);
			      System.out.println("Eno: ");
			      int eno1 = sc.nextInt();
			      System.out.println("Name: ");
			      String name1 = sc.next();
			      System.out.println("Salary: ");
			      float salary1 = sc.nextFloat();
			      
			      e1.setEmp_num(eno1); 
			      e1.setEmp_name(name1);;
			      e1.setEmp_salary(salary1);
			      
			      //upto emp_pojo is transisten state
			      //persist == insert into tablename values
			      session.persist(e1);
			      System.out.println("********Inserted*******");
			      
			      //without commit not reflected in database
			      tx.commit();//save the querry
	}

}
