/*  8.    Create a method which accepts a string and inserts a character at a specified position.
Class Name                                 StringModifier
Method Name                             insertCharacter
Method Description                    Accepts a String and insert a character at a specified position.
Argument                                    String string , char c, int position
Return Type                                String : Resulting String after the insertion
Logic                                           Accepts a String and insert a character at a specified position.
*/

import java.util.*;
class StringModifier{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the name");
String s1=sc.next();

System.out.println(insertCharacter(s1));
}
static String insertCharacter(String s1){
StringBuffer s2=new StringBuffer();
Scanner sc=new Scanner(System.in);
System.out.println("Enter the char to insert and position");
char ch=sc.next().charAt(0);
int pos=sc.nextInt();
s2.append(s1);
s2.insert(pos,ch);
s1=s2.toString();
return s1;
}
}
