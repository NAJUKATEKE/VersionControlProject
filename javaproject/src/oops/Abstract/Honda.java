package oops.Abstract;

public class Honda extends Car{
	
	// TODO Auto-generated constructor stub
	
//hiding impletention details

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("stop driving");
		System.out.println("mechanism to stop  the car using break ");
	}
}
