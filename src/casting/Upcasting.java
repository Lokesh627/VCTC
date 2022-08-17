package casting;

public class Upcasting {

	public static void main(String[] args) {
		Son s=new Son();
		s.bike();
		s.car();
		s.degree();
		
		Father f=new Father();
		f.bike();
		f.car();
	}

}
