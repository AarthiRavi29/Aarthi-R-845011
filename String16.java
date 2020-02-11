/* 16. input:
	Searchstring s1="GeniusRajkumarDev";
	String s2="Raj";
	String s3="Dev";
   output:
        Return 1 if s2 comes before s3 in searchstring else return 2 */

import java.util.Scanner;
public class String16 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s1 = sc.nextLine();
    String s2 = sc.nextLine();
    String s3 = sc.nextLine();
    getvalues(s1, s2, s3);
    if (s1.contains(s2) && s1.contains(s3)) {
      if (s1.indexOf(s2) < s1.indexOf(s3)) {
        System.out.println("1");
      } else
        System.out.println("2");
    }
  }
}