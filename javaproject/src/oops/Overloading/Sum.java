package oops.Overloading;

public class Sum {
public int Sum(int x,int y ) {
	System.out.println("sum = "+(x+y));
	return(x+y);
} 
public int Sum(int x,int y,int z) {
	System.out.println("sum= "+(x+y+z));
	
	return(x+y+z);
}
public double Sum(double x,double y) {
	System.out.println(" sum= "+(x+y));
	return(x+y);
}
}
