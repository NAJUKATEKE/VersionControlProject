package javaprogram;

public class Pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* print		
		  1
		 12
	     123
		1234
		12345   */
		
for(int i=0;i<=5;i++) {
	for(int j=5;j>=i;j--) {
		System.out.print(" ");
	}
	for(int k=0;k<=i;k++) {
		System.out.print(i);
System.out.println();	
}
}
	}

}
