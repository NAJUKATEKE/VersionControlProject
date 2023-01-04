package javaProgPractice;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int count=0;

System.out.println("enter number");
Scanner scn=new Scanner(System.in);
int a=scn.nextInt();
for(int i=1; i<=a;i++) {
	if(a%i==0) {
		count++;
	}	
}
if(count==2) {
	System.out.println("prime number");
}
else {
	System.out.println("not a prime number");
}
	}

}
