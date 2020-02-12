/*  9.    Create a class containing method counts the occurrence of a character in a String
Cass Name                                  CharacterCounter
Method Name                             countCharacter
Method Description                    Accepts a String and a character and count the number of occurrence of the character in the entered String
Argument                                    String string, char ch
Return Type                                int count
Logic                                           Accept a String and Character
Count the number of occurrence of the character in the String and return the count value. */

import java.util.*;
class CharacterCounter{
static int countCharacter(String s1,char ch){
int count=0;
for(int i=0;i<s1.length();i++){
if(s1.charAt(i)==ch){
count++;
}
}
return count;	
}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String s1=sc.next();
char ch=sc.next().charAt(0);
System.out.println(countCharacter(s1,ch));
}
}