/* 8. Find no of characters in a given string which are not repeated.
input: "hello"
output: 3   */

import java.util.Scanner;
import java.util.*;
 class String8 {
    public static void main(String args[])
    {
 Scanner sc=new Scanner(System.in);
String s1=sc.next();
int f=0;
int n=s1.length();
for(int i=0;i<n;i++){
int c=0;
for(int j=0;j<n;j++){
if(s1.charAt(i)==s1.charAt(j)){
c++;
}
}
if(c==1){
f++;
}
}
System.out.print(f);
}
}