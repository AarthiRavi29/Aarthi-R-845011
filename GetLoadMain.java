package com.dao;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.pojo.Emp_Pojo;
/*
 GET:
 No records means NULL, If no row is available in the session cache 
 LOAD:
 No records means ObjectNotFoundException
 */

public class GetLoadMain
{

	public static void main(String[] args) 
	{
		SessionFactory sessionFactory = new Configuration().configure("cts_hibernate.cfg.xml").buildSessionFactory();
		Session session =sessionFactory.openSession();
	
		//start a transaction
		Transaction tx = session.beginTransaction();

		//EmployeePojo e1=new EmployeePojo();
		Scanner scan = new Scanner(System.in);
		System.out.println("Eno: ");
		int eno1=scan.nextInt();
		//CTS_EMPDEMO MYSQL TABLE
		//Emp_Pojo obj1 = (Emp_Pojo) session.load(Emp_Pojo.class,eno1);//No records means ObjectNotFoundException
		Emp_Pojo obj1 = (Emp_Pojo) session.get(Emp_Pojo.class,eno1);//No records means NULL
		
		System.out.println("Persistent Object: "+obj1);
		System.out.println("Current Salary: "+obj1.getSalary1());
		System.out.println("Appraisal Amt: ");
		float salary1=scan.nextFloat();
		obj1.setSalary1(obj1.getSalary1()+salary1);
		tx.commit();

		 Transaction tx11 = session.beginTransaction();
		 System.out.println("Enter ENO to delete: ");
		 int eno3=scan.nextInt();
		 Emp_Pojo u = (Emp_Pojo) session.load(Emp_Pojo.class,eno3);
		 session.delete(u);//HIBERNATE CRUD
		 tx11.commit();
		 System.out.println("\n\n Record Deleted "+u.getEmpno1());

	}


	}



