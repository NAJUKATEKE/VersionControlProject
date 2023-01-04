package javaProgPractice;

import java.util.Scanner;

public class EvenorOddNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter number");
Scanner scn=new Scanner(System.in);
int a=scn.nextInt();
if(a%2==0) {
	System.out.println("it is a even no.");
}
else {
	System.out.println("it is a odd no.");
}
	}

}
