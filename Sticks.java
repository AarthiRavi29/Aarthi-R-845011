/*  4. Sita wanted to celebrate the good news of her promotion.
She took her niece Mahirl along with her and went to Fun Mall to meet her 
close friend Gita.
Gita was busy with her customers and she asked her to wait for an hour.
Mahirl grew restless sitting idle. So Sita took her around the Mall. 
A competition for kids was going on in the 1st floor.
They were given 'n' fancy sticks in different colors of 2 cm length and they 
were asked to form the largest square possible.
Many kids were playing with the fancy sticks. Mahirl always likes colorful 
sticks and she also wanted to take part in the competition.
But the organisers told that the competition is open only for kids above 10 
years.
Mahirl started crying and they allowed her to participate in the contest.
They asked to Sita to give her instructions. But Sita should not touch any 
of the sticks.
Sita has good reasoning skills and she was wondering what could be the area 
of the largest square that can be formed using 'n' sticks.
Can you help Sita out and help Mahirl in winning the prize?

Sample Input:
9
Sample Output:
16             */


import java.util.Scanner;
class Sticks{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int oneside=n/4;
int m=oneside*2;
int square=m*m;
 System.out.println(square);
}
}