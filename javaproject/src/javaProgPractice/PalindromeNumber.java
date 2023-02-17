package javaProgPractice;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,r,c,s=0;
		System.out.println("Enter Number");
		Scanner scn=new Scanner(System.in);
	n=	scn.nextInt();
c=n;                         
	while(n>0) {
	r=n%10;     
	s=(s*10)+r; 
	n=n/10;
			
	}
	if(c==s) {
		System.out.println("palindrome number");
	}
	else {
		System.out.println("not palindrome number");
	}
}

	

}
