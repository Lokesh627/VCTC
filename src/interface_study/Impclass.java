package interface_study;

public class Impclass implements Myinterface {

	public static void main(String[] args) {
		
		System.out.println(a);
		Impclass i=new Impclass();
		i.m1();
		i.m2();
		i.m3();

	}

	@Override
	public void m1() {
		System.out.println("Method m1 is completed in implementation class");
		
	}

	@Override
	public void m2() {
		System.out.println("Method m2 is completed in implementation class");
		
	}
	
	public void m3()
	{
		System.out.println("Method m3 is completed in implementation class");
	}

}
