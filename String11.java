/*  11.write a program to validate the ip address in the form a.b.c.d
   where a,b,c,d must be between 0and 255
   if validated return 1 else return 2  */
import java.util.*;
public class String11 {
	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
String ipAddress=sc.nextLine();
		
	    boolean b=validateIpAddress(ipAddress);
	    if(b==true)
	    	System.out.println(1);
	    else
	    	System.out.println(2);
	}
	public static boolean validateIpAddress(String ipAddress) {
		boolean b1=false;
		StringTokenizer t=new StringTokenizer(ipAddress,".");
		int a=Integer.parseInt(t.nextToken());
		int b=Integer.parseInt(t.nextToken());
		int c=Integer.parseInt(t.nextToken());
		int d=Integer.parseInt(t.nextToken());
		if((a>=0 && a<=255)&&(b>=0 && b<=255)&&(c>=0 && c<=255)&&(d>=0 && d<=255))
			b1=true;
		return b1;
	}
}