package control_statements;

public class Switch_study {

	public static void main(String[] args)
	{
		int years=3;
		
		switch(years)
		{
		case 1:
			System.out.println("Welcome to 1st year");
			break;
		case 2:
			System.out.println("Welcome to 2nd year");
			break;
		case 3:
			System.out.println("Welcome to 3rd year");
			break;
		case 4:
			System.out.println("Welcome to 4th year");
			break;
		
		default:
			System.out.println("Please enter the year value between 1-4");
			break;
		}
	
		

	}

}
