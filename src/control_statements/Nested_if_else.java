package control_statements;

public class Nested_if_else {

	public static void main(String[] args) 
	{
		String UN="Velocity";
		String PWD="123";
		
		if (UN=="Velocity")
		{
			System.out.println("Correct Username please enter password");
		
		
		if (PWD=="123")
		{
			System.out.println("Login Successfull");
		}
		else 
		{
			System.out.println("Wrong Password, please check password");
		}
		}
		
		else
		{
			System.out.println("Incorrect Username, unable to login");
		}
				
	}
	

}
