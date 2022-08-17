package variable;

public class Variable_Study_1 {
	
	int a=20;		//Non-Static global variable//

	public static void main(String[] args) 
	{
		Variable_Study_1 object=new Variable_Study_1();
		object.display();
		object.display1();
		
		System.out.println("Value of a is "+object.a);
		
		Variable_Study_Non_Static object1=new Variable_Study_Non_Static();
		
		System.out.println("Value of l is "+object1.l);

	}
	
	public void display()
	{
		int b=30;
		System.out.println("Value of b is "+b);
		System.out.println("Value of a is "+a);
	}
	
	public void display1()
	{
		int c=40;
		int d=50;
		int sum=a+c+d;
		System.out.println("Value of sum is "+sum);
	}

}
