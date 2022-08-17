package methods;

public class Method_with_parameters {

	public static void main(String[] args) 
	{
		Method_with_parameters object=new Method_with_parameters();
		object.students_info("Lokesh", 16, 29, 89.9f, 8, 'M');
		object.students_info("Poonam", 20, 27, 87.90f, 8, 'F');

	}
	
	public void students_info(String name, int rollno, int age, float percentage, int batch, char gender)
	{
		System.out.println("Name is "+name);
		System.out.println("Roll number is "+rollno);
		System.out.println("Age is "+age);
		System.out.println("My percentage are "+percentage);
		System.out.println("My batch is "+batch);
		System.out.println("My gender is "+gender);
		
	}
	


}
