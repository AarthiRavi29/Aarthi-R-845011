/*  10.  Create a class containing method which can accepts two string and a character and insert the second string in the position of the character if present in first string
Cass Name                                  StringManager
Method Name                             insertString
Method Description                    Accepts two Strings and a character and  insert the second string in the position of the character if present in first string

Argument                                    String string1, String string2, char ch
Return Type                                String
Logic                                           Accepts two Strings and a character and  insert the second string in the position of the character if present in first string. */

import java.util.*;
class StringManager{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String s1=sc.nextLine();
String s2=sc.nextLine();
char ch=sc.next().charAt(0);
System.out.println(insertString(s1,s2,ch));
}
static String insertString(String s1, String s2, char ch){
int index=s1.indexOf(ch);
StringBuilder sb1 = new StringBuilder();
sb1.append(s1);
sb1.insert(index,s2);
s1=sb1.toString();
//System.out.println(s1);
return s1;
}
}