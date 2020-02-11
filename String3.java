/* 3.Write a program which creates a String “C:\IBM\DB2\PROGRAM\DB2COPY1.EXE”. 
It parses the string with the delimiter as ‘\’ and displays the String in the
 following format.
Drive: c:\
Folders: IBM || DB2 || PROGRAM 
File: DB2COPY1.EXE

Hint:  Use String Builder for concatenating the folder names with |.
*/


import java.util.*;
class String3{  
public static void main(String args[]){  
String s1="C:\\IBM\\DB2\\PROGRAM\\DB2COPY1.EXE";
 
System.out.println(s1);
System.out.println("Drive: " + s1.substring(0, 3));

String s2=s1.substring(3,18);


System.out.println("Folders: "+ s2.replace("\\","||"));
System.out.println("File: " + s1.substring(19, 30));
	

}
}