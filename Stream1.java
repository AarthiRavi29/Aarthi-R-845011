package com.cts;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
 * Java 8, the Stream API is used to
 * process  collections of objects
 * --Designed for lambdas
 * --Do not support indexed access
 * --can easily be outputted as arrays or lists
 */
class Product{
	String pname;
	float price;
	public Product(String pname, float price) {
		super();
		this.pname = pname;
		this.price = price;
	}
	
}
public class Stream1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      List<Product> pr1 = new ArrayList<Product>();
      pr1.add(new Product("HP",25000f));
      pr1.add(new Product("Dell",36000f));
      pr1.add(new Product("Lenevo",28000f));
      List<Float>pr2 = new ArrayList<Float>();
      for(Product product: pr1){
    	  //filtering data of list
    	  if(product.price<30000){
    		  pr2.add(product.price);
    		  //adding price to a pr2
    	  }
      }
      System.out.println("After Filter: "+pr2);//displaying data
      
      
      //Stream API
      List<Float>f1=pr1.stream()
    		  .filter(e->e.price<30000)//filtering data
    		  .map(e->e.price) //fetching price
    		  .collect(Collectors.toList());
      //count number of products based on the filter
      System.out.println("Stream Filter: "+f1);
      long count = pr1.stream()
    		  .filter(ps->ps.price<30000)
    		  .count();
      System.out.println("Stream Filter Count: "+count);
      
      pr1.stream()
      .filter(ps1->ps1.price<30000)
      .forEach(ps2->System.out.println("<THAN 30000 PName:"+ps2.pname));
      
    		  }

}
