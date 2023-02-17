package javaProgPractice;

import java.util.Scanner;

public class HolloSquareStarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
System.out.println("Enter the stars in each side");
int side=scn.nextInt();
for(int i=0;i<=side-1;i++) {
	for(int j=0;j<=side-1;j++) {
		if(i==0 || i==side-1 || j==0 || j==side-1) {
			System.out.print("*");
		}
		else {
			System.out.print(" ");
		}
	}
	System.out.println();
}

	}

}
