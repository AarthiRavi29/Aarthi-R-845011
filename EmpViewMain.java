package com.dao;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.pojo.Emp_Pojo;


public class EmpViewMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 SessionFactory sessionFactory = 
			        new Configuration().configure("cts_hibernate.cfg.xml").buildSessionFactory();
			      
		 Session session = sessionFactory.openSession();
		 /*
		  * HQL-hibernate querry language
		  * HQL uses class name instead of table name,
		  * and property names instead of column name.
		  */
		 //String query1="select*from Emp_Pojo";//error
		 //String query1="select Empno1,Empname1,salary1 from Emp_Pojo";//valid
		 //notable name only pojo class name
		  String query1="from Emp_Pojo";//valid
		  Query query4=session.createQuery(query1);
		  List<Emp_Pojo>list4 = (List<Emp_Pojo>)query4.list();//resultset
		  for(Emp_Pojo e:list4){
			  System.out.println(e.getEmpname()+" "+e.getEmpno1()+" "+e.getSalary1());
		  }
		  String Sql_QUERy = "select max(e1.salary1)from Emp_Pojo e1";
		  query4 = session.createQuery(Sql_QUERy);
		  List l1 = query4.list();
		  System.out.println("MAX Salary:"+l1.get(0));
		  
		  Query query5=session.createQuery("from Emp_Pojo where Empname='Aarthi'");
		  List l2 = query5.list();
		  Emp_Pojo obj1 = (Emp_Pojo)l2.get(0);
		  System.out.println("Aarthi Salary:"+obj1.getSalary1());
		  
		  
		  //Paramaterized qureies
		  //positional parameter
		  //String q ="from Emp_Pojo where Empno1=?";
		  String q="from Emp_Pojo where Empno1=:a";
		  
		  query4 = session.createQuery(q);
		  System.out.println("Enter the Eno: ");
		  Scanner sc = new Scanner(System.in);
		  int eno11 = sc.nextInt();
		  query4.setInteger("a", eno11);
		  List l3 = query4.list();
		  Emp_Pojo obj21=(Emp_Pojo)l3.get(0);
		  System.out.println("Name & Salary: "+obj21.getEmpname()+" "+obj21.getEmpno1());
		  
		  session.close();//detached state
		  
		  
	}
	}


