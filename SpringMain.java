package com.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.DAO.Employee_JdbcTemplate1;

public class SpringMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//@SuppressWarnings("resource")
ApplicationContext beanFactory = new ClassPathXmlApplicationContext("SpringConfig.xml");
FirstBean myBean = (FirstBean)beanFactory.getBean("Bean1");
myBean.display();

AbstractApplicationContext context = new AnnotationConfigApplicationContext(AnnoBean1.class);//calling @Bean annotation from annobean1 java class
AnnoBean myBean1 = (AnnoBean)context.getBean("SpringAnnoBean");
myBean1.disp("Aarthi");


EmployeeBean myBean2 = (EmployeeBean)beanFactory.getBean("myemployee1");
myBean2.show();

Student_Course c1 = (Student_Course)beanFactory.getBean("course1");
System.out.println(c1.getCid());
System.out.println(c1.getCname());
System.out.println(c1.getSid());
System.out.println(c1.getName());



User_Properties myBean11 = (User_Properties)beanFactory.getBean("prop1");
System.out.println(myBean11.getUser()+" "+myBean11.getRole()+" "+myBean11.getEmail());

System.out.println("******Using REF Tag***********");
Bank myBean4 = (Bank)beanFactory.getBean("bank_aw");
System.out.println(myBean4.getBankname());
System.out.println(myBean4.getMgrname());
System.out.println(myBean4.getB1().getCity());
System.out.println(myBean4.getB1().getCountry());

System.out.println("******Using Autowiring Tag***********");
Bank myBean5 = (Bank)beanFactory.getBean("bank_aw1");
System.out.println(myBean5.getBankname());
System.out.println(myBean5.getMgrname());
System.out.println(myBean5.getB1().getCity());
System.out.println(myBean5.getB1().getCountry());

System.out.println("**********Autowire(constructor)**************");
EmployeeBean myBean3 = (EmployeeBean)beanFactory.getBean("myemployee2");
myBean3.show();

System.out.println("******Using Autowiring Tag by anotation***********");
Bank_AutoWire myBean31 = (Bank_AutoWire)beanFactory.getBean("anno1");
System.out.println(myBean31.getBankname());
System.out.println(myBean31.getMgrname());
System.out.println(myBean31.getB20().getCity());
System.out.println(myBean31.getB20().getCountry());
 
System.out.println("************Collection-Setter Injection");
Vendor_Collection q = (Vendor_Collection)beanFactory.getBean("obj1");
q.displayInfo();

System.out.println("*********COLLECTION-DEPENDENT OBJECT INJECTION**************");
Training_Collection q1 = (Training_Collection)beanFactory.getBean("tco1");
q1.display();

System.out.println("*********Map Collection-Setter Injection::**********");
Assesment_MapCollection q12=(Assesment_MapCollection)beanFactory.getBean("asmap1");
q12.display();

System.out.println("************Collection-Setter Injection");
Vendor_ColConstructor cons = (Vendor_ColConstructor)beanFactory.getBean("obj2");
cons.displayInfo();

System.out.println("************Collection-Set-Setter Injection");
Vendor_SetConstructor cons1 = (Vendor_SetConstructor)beanFactory.getBean("obj3");
cons1.displayInfo();

/*System.out.println("************Collection-Map-Constructor Injection");
Stud_CollectionRef map = (Stud_CollectionRef)beanFactory.getBean("stud1");
map.display();*/

Employee_JdbcTemplate1 s=(Employee_JdbcTemplate1)beanFactory.getBean("mydatabase");
System.out.println("SPRING + JDBC:::");
List<Employee_Jdbc> e1 = s.listemp();
System.out.println("ENO      NAME     SALARY");
for(Employee_Jdbc rec:e1){
	System.out.println(rec.getEmp_no()+" ");
	System.out.println(rec.getEmp_name()+" ");
	System.out.println(rec.getSalary());
}

//no xml and no separate spring configuration class file
SpringAnno_Component myBean6 = (SpringAnno_Component)beanFactory.getBean("SpringAnnotationNew");
System.out.println(myBean6.training+" "+myBean6.loc);
}

}
