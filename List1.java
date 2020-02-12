/*  1.Create a class with a method which can remove all the elements from a list
 other than the collection of elements specified.

Class Name :ListManager

Method Name: removeElements
 
Method Description : Remove all the elements from a list other than the 
collection of elements specified. 

Argument: List<String> list1, List<String> list2;

Return Type : List- ArrayList contains the resulting List after the
 removal process.

Logic : Accept two List objects list1 and list2 and remove all the elements
 from list 1 other than the elements contained in list2.
This should be done in single step process without using loop.  */

import java.util.Scanner;
import java.util.*;
 class List1 {
    public static void main(String args[])
    {
Scanner sc=new Scanner(System.in);
System.out.println("input1 size from user");
ArrayList<String> l1=new ArrayList<String>();
int n=sc.nextInt();
 while (n!=0)
      {
         String input = sc.next();
         l1.add(input);
         n--;
      }
System.out.println("input2 size from user");
ArrayList<String> l2=new ArrayList<String>();
int n1=sc.nextInt();
 while (n1!=0)
      {
         String input = sc.next();
         l2.add(input);
         n1--;
      }
removeElements(l1,l2);
System.out.println(l1);
}
public static ArrayList<String> removeElements(ArrayList<String> l1, ArrayList<String> l2){
l1.retainAll(l2);
return l1;
}
}