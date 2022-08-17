package thisandsuper;

public class Super extends SuperA {
	
	int a=500;
	

	public static void main(String[] args) 
	{
		Super s=new Super();
		s.display();
	}
	
	public void display()
	{
		int a=200;
		System.out.println("Local value of a is "+a);
		System.out.println("Global value of same class "+this.a);
		System.out.println("Global value of a super class is "+super.a);
	}

}
