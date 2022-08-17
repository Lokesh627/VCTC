package accessspecifiers_study;

public class Private_class 
{
	int a=20;
	private int b=50;
	public int c=60;
	protected static int d=80;
	
	
	public  static void main(String[] args)
	{
		Private_class u= new Private_class();
		u.add();	//Calling private method allowed within class//
		u.sub();	//Calling public method allowed within project//
		u.mul();	//Calling default method allowed within package//
		display();	//Calling protected method allowed in other package using inheritance//
		
		
	}
	
	private void add()
	{
		int a,b=10,c=20;
		a=b+c;
		System.out.println("Value of a is "+a);
	}
	
	public void sub()
	{
		int a,b=20,c=10;
		a=b-c;
		System.out.println("Value of a is "+a);
		
	}
	void mul()
	{
		int a,b=20,c=10;
		a=b*c;
		System.out.println("Value of a is "+a);
	}
	protected static void display()
	{
		System.out.println("Hi I am protected method");
	}

}
