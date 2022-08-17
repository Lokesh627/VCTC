package generalisation;

public class Airtel implements TRAI{

	@Override
	public void call() {
		System.out.println("0.5Rs/min");
		
	}

	@Override
	public void msg() {
		System.out.println("150msg/day");
		
	}

	@Override
	public void data() {
		System.out.println("1.5GB/day");
		
	}
	
	public void NewMethodAirtel() {
		System.out.println("Airtel new method");
	}
	

}
