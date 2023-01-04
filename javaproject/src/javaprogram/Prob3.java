package javaprogram;

import java.util.Arrays;

public class Prob3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a java program to find second largest number in an array of numbers.
		int[] a = {45, 51, 28, 75, 49, 42};
		
		int max=0;
		//int secmax=0;
		for(int i=0;i<6;i++) {

				if (a[i]>max) {
					
					secmax=max;
					max=a[i];
					
				}
				else if(a[i]>secmax){
				
		secmax=a[i];
		}
				}
	System.out.println("second max number= "+secmax);
		System.out.println("maximum number=" +max);
		}
}




// using sorting method to find 2nd largest number
		/*	int[] a = {45, 51, 28, 75, 49, 42};
			//Arrays.sort(a);
			//for(int i=0;i<6;i++) {
System.out.println(a[i]);
}
		
		
		System.out.println("2nd largest number");
		System.out.println(a[a.length-2]);
	}}    */