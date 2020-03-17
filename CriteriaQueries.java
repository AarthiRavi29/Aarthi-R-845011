package com.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.pojo.Emp_Pojo;

public class CriteriaQueries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      
	      Session s =  new Configuration().configure("cts_hibernate.cfg.xml").buildSessionFactory().openSession();
	      //start a transaction
	      Transaction tx = s.beginTransaction();
	      Criteria cr = s.createCriteria(Emp_Pojo.class);
	      
	      //Add restriction.
	      //cr.add(Restriction.gt("salary1",50000.00F));
	      cr.add(Restrictions.between("salary1",25000.00f,48000.00f));
	      List employees = cr.list();
	      List<Emp_Pojo> list4  = (List<Emp_Pojo>)cr.list();
	      for(Emp_Pojo e:list4){
	    	  System.out.println("First Criteria: "+e.getEmpno1()+" "+e.getEmpname()+" "+e.getSalary1());
	      }
	      
	      //ProjectionS-average, maximum, or minimum
	      //To get total Salary
	      Criteria cr11=s.createCriteria(Emp_Pojo.class);
	  	cr11.setProjection(Projections.sum("salary1"));
	  	List totalSalary=cr11.list();
	  	System.out.println("total salary"+totalSalary.get(0));
	     
	      

}
}
