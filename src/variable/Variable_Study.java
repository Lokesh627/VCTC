package variable;

public class Variable_Study {
	
	
	static int a=40;			//Static global variable//
	

	public static void main(String[] args) 
	{
		Variable_Study object=new Variable_Study();
		object.display();
		
		System.out.println("Value of a is "+a);
		System.out.println("Value of p is "+Variable_Study_Static.p);
	

	}
	
	public void display()
	{
		int b=60;
		System.out.println("Value of b is "+b);
		System.out.println("Value of a is "+a);
	}

}
