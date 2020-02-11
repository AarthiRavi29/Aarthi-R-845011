/* 19. Find the sum of the numbers in the given input string array
   Input{“2AA”,”12”,”ABC”,”c1a”)
   Output:6 (2+1+2+1)
   Note in the above array 12 must not considered as such
   i.e,it must be considered as 1,2    */

import java.util.Scanner;
public class String19 {
 
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s1 = sc.nextLine();
    getvalues(s1);
  }
  public static void getvalues(String s1) {
    int sum = 0;
    for (int i = 0; i < s1.length(); i++) {
      char a = s1.charAt(i);
      if (Character.isDigit(a)) {
        int b = Integer.parseInt(String.valueOf(a));
        sum = sum + b;
      }
    }
    if (sum == 0) {
      System.out.println(-1);
    } else
      System.out.println(sum);
  }