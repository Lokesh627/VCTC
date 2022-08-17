package variable;

public class Variable_Study_2 {

	public static void main(String[] args) 
	{
		Variable_Study_Variables object=new Variable_Study_Variables();	 	
		object.empid=1;
		object.sal=10000;
		object.RM="Lokesh";
		
		Variable_Study_Variables object1=new Variable_Study_Variables();
		object1.empid=2;
		object1.sal=20000;
		object.RM="Poonam";
		
		Variable_Study_Variables object2=new Variable_Study_Variables();
		object2.empid=3;
		object2.sal=30000;
		object2.RM="Kiran";
		
		object.EMPINFO();
		object1.EMPINFO();
		object2.EMPINFO();

	}

}
