/* 7. Check whether a given string is palindrome also check whether it has
 atleast 2 different vowels
input: "madam"
output: false(no 2 diff vowels)
input: "reviver"
output: true(diff vowels)
input: "racecar"
output: true(diff vowels)  */


import java.util.Scanner;
import java.util.*;
 class String7 {
    public static void main(String args[])
    {
Scanner sc=new Scanner(System.in);
String s1 = new String(sc.next());
int count=0;
String s2=""; 
String a[]=s1.split("");
System.out.println(a);
for(int i=a.length;i<0;i--){
s2=s2+a[i];
}
System.out.println(s2);
for(int i=0;i<a.length;i++)
if(a[i]=="a" || a[i]=="e" || a[i]=="i" || a[i]=="o" || a[i]=="u"){
count++;
}
if(s1==s2){
if(count>=2){
System.out.println("true(diff vowels)");
 }
else{
System.out.println("false(no 2 diff vowels)");
}
}
else{
System.out.println("false");
}
}
}