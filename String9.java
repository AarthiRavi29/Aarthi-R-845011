/* 9. Get a input string. Find if it is a negative number, if true return the
 absolute value, in other cases return -1.
input: "-123"
output: 123
input: "@123"
output: -1  */
import java.util.Scanner;
import java.util.*;
 class String9 {
    public static void main(String args[])
    {
 Scanner sc=new Scanner(System.in);
String s1=sc.next();
if(s1.charAt(0)== '-'){
for(int i=1;i<s1.length();i++){
System.out.print(s1.charAt(i));
}
}
else{
System.out.print(-1);
}
}
}