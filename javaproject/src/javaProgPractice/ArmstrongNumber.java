package javaProgPractice;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//153=1^3+5^3+
	System.out.println("find armstrong number");
int c, n,rem,arm=0;
System.out.println("Enter number");
	Scanner scn=new Scanner(System.in);
	n=scn.nextInt();
	c=n;
	while(n>0) {
		rem=n%10;
	arm=(rem*rem*rem)+arm;
	n=n/10;
	}
	if(c==arm) {
		System.out.println("Armstrong number");
	}
	
	else {
		System.out.println("Not armstrong number");
	}
	
	
	}
	
}