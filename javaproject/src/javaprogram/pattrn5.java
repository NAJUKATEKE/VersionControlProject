package javaprogram;

public class pattrn5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*print 1
		23
		456
		78910*/
		int count=1;
		for(int i=0;i<4;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(count);
				count++;
			}System.out.println();
		}
	}

}
