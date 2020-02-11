/* 21. INPUT1= helloworld
   INPUT2= 2. delete the char,if rpted twice.
   if occurs more than twice,leave the first occurence and delete the 
duplicate
   O/P= helwrd;
*/

import java.util.*; 
  
class String21 { 
    public static String unique(String s) 
    { 
        String str = new String(); 
        int len = s.length(); 
        for (int i = 0; i < len; i++)  
        { 
            char c = s.charAt(i); 
             if (str.indexOf(c) < 0) 
            { 
                str += c; 
            } 
        } 
         return str; 
    } 
    public static void main(String[] args) 
    { 
        Scanner sc=new Scanner(System.in); 
        String s = sc.nextLine(); 
        System.out.println(unique(s)); 
    } 
} 
