package methods;

public class Method_Study_1 {

	public static void main(String[] args) 
	{
		method1();
		
		Method_Study_1 object=new Method_Study_1();
		object.method2();
		
		Method_study_2.method3();
		
		Method_study_2 object1=new Method_study_2();
		object1.method4();
		
		

	}
	
	public static void method1()
	{
		int a=10;
		int b=20;
		int c=15;
		int total=b-a+c;
		System.out.println(total);
	}
	
	public void method2()
	{
		int a=200;
		int b=100;
		int c=10;
		int total=(a-b)/c;
		System.out.println(total);
	}

}
