package javaProgPractice;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//0,1,1,2,3,5,8,13......
int a=0,b=1,c,term;
System.out.println("Enter the number");
Scanner scn=new Scanner(System.in);
term=scn.nextInt();
for(int i=0;i<=term;i++) {
	System.out.print(a+" ");
	c=a+b;
	a=b;
	b=c;
}
	}

}
