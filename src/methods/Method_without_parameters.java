package methods;

public class Method_without_parameters {

	public static void main(String[] args) 
	{
		Method_without_parameters object=new Method_without_parameters();
		object.result();
		
		student_info();
		
		

	}
	
	public void result()
	{
		int maths=78;
		int physics=88;
		int chemistry=76;
		int result=(maths+physics+chemistry)/3;
		System.out.println("Result is "+result);
		
	}

	public static void student_info()
	{
		String name= "Lokesh";
		int rollno= 16;
		int age=29;
		float percentage=78.89f;
		int batch=8;
		char gender='M';
		
		System.out.println("Name is "+name);
		System.out.println("Roll number is "+rollno);
		System.out.println("Age is "+age);
		System.out.println("My percentage are "+percentage);
		System.out.println("My batch is "+batch);
		System.out.println("My gender is "+gender);
	}
}
