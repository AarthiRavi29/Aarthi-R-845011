/* 22. Write a program to rearrange-
Input1=”Hello World”;  output- “dello WorlH”.  */

import java.util.*; 
  
class String22 { 
    
    public static void main(String[] args) 
    { 
        Scanner sc=new Scanner(System.in); 
        String s = sc.nextLine(); 
        

int length=s.length();
  if(length<=1){
  System.out.println(s);
  }
   
  if(length>= 1){
  System.out.println(s.charAt(length - 1) + s.substring(1, length- 1)+s.charAt(0));
}
}
}