package methods;

public class Method_Study {

	public static void main(String[] args) 
	{
		sub();
		Method_Study object=new Method_Study();
		object.add();
		

	}
	
	
	public void add()
	{
		int a=10;
		int b=20;
		int c=30;
		int add=a+b+c;
		
		System.out.println(+add);
	}

	public static void sub()
	{
		int a=100;
		int b=20;
		int c=10;
		int d=5;
		int sub=a-b-c-d;
		System.out.println(+sub);
	}
}
