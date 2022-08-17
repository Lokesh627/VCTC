package constructor;

public class Constructor_study_Without_parameters 
{
	String name;
	
	public Constructor_study_Without_parameters()
	{
		name="Velocity";
		
	}
	
	public void display()
	{
		System.out.println("I am a non static method");
		System.out.println("My class name is "+name);
	}
	
	public static void display1()
	{
		System.out.println("I am static method");
	
	}
	
	public static void main (String[]args)
	{
		display1();
		
		Constructor_study_Without_parameters object=new Constructor_study_Without_parameters();
		object.display();
		
	}
}
