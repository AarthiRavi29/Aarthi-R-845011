package com.dao;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.pojo.Emp_Pojo;

public class Emp_DAOMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      SessionFactory sessionFactory = 
        new Configuration().configure("cts_hibernate.cfg.xml").buildSessionFactory();
      
      Session session = sessionFactory.openSession();
      //start a transaction
      Transaction tx = session.beginTransaction();
      Emp_Pojo e1 = new Emp_Pojo();
      Scanner sc = new Scanner(System.in);
      System.out.println("Eno: ");
      int eno1 = sc.nextInt();
      System.out.println("Name: ");
      String name1 = sc.next();
      System.out.println("Salary: ");
      float salary1 = sc.nextFloat();
      
      e1.setEmpno1(eno1);
      e1.setEmpname(name1);
      e1.setSalary1(salary1);
      
      //upto emp_pojo is transisten state
      //persist == insert into tablename values
      session.persist(e1);
      System.out.println("********Inserted*******");
      
      //without commit not reflected in database
      tx.commit();//save the querry
	}

}
