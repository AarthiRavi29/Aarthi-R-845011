
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Maptest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc= new Scanner(System.in);
  HashMap<String,String> h1=new HashMap<String,String>();
  System.out.println("enter the number of input");
  int n=sc.nextInt();
  System.out.println("enter the name and phone number");
  for(int i=0;i<n;i++){
	  String s1=sc.next();
	  String s2=sc.next();
	  if(s2.length()<10 || s2.length()>10){
		  System.out.println( s1 +" Is a Invalid PhoneNumber");
		  i--;
  }
	  h1.put(s1, s2);
 
  }
  System.out.println("enter the number of querry");
  int m=sc.nextInt();
  String a[]=new String[m];
  for(int i=0;i<m;i++){
	  a[i]=sc.next();
  }
  for(int i=0;i<m;i++){
	String s3=a[i];
if(h1.containsKey(s3)){
   for(Map.Entry<String, String> entry:h1.entrySet()){
	  if(s3.equalsIgnoreCase(entry.getKey())){
		  System.out.println(s3 +" "+ entry.getValue());
	  }
  }}
else{
	System.out.println(s3+" No data found");
}
	}
  sc.close();
	}
  
  }

