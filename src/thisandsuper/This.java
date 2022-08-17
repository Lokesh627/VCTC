package thisandsuper;

public class This {
	
	int a=10;
	int b=20;
	static int z=30;
	

	public static void main(String[] args)
	{
		This t=new This();
		t.display();
		

	}


	private void display()
	{
		int a=40;
		int b=50;
		int y=60;
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(b);
		System.out.println(this.b);
		System.out.println(y);
		System.out.println(This.z);
		
		
	}

}
