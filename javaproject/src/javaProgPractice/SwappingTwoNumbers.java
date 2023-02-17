package javaProgPractice;

public class SwappingTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Swapping two numbers between 3rd variable
/*		int a=10,b=20;
		a=a+b;    //30
		b=a-b;    //10
		a=a-b;     //20
		
		System.out.println("a= "+a);
		System.out.println("b= "+b);                    */
		
		
		int a=10,b=20;
		int temp;
		temp=a;                     //temp=10
		a=b;                       //a=20
		b=temp;                     //b=10
		System.out.println("a= "+a);   //a=20
		System.out.println("b="+b);    //b=10
	}

}
