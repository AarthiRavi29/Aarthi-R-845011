import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class FullName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
String name=sc.nextLine();
String a[]=name.split(" ");
if(a.length==3){
StringTokenizer s =new StringTokenizer(name," ");
String first=s.nextToken();
String second=s.nextToken();
String third=s.nextToken();
/*String second="";
System.out.println("modifie: "+first);
while(s.hasMoreElements()){
	 second=s.nextToken();
}
System.out.println("modified: "+second);*/
System.out.print(third);
System.out.print(" "+second.charAt(0));
System.out.print("."+first.charAt(0));
//String s1=name.replace("hg","String");
//System.out.println(s1);
sc.close();
}
else{
	StringTokenizer s =new StringTokenizer(name," ");
	String first=s.nextToken();
	String second=s.nextToken();
	System.out.print(second);
	System.out.print(" "+first.charAt(0));
	
}

	}

}
