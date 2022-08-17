package constructor;

public class Constructor_study_with_parameters {
	
	
	int num1;
	int num2;
	int num3;
	
	public static void main(String[] args) 
	{
		Constructor_study_with_parameters a=new Constructor_study_with_parameters(15);
		a.addition();
		
		Constructor_study_with_parameters a1=new Constructor_study_with_parameters(15, 15);
		a1.addition();
		
		Constructor_study_with_parameters a2=new Constructor_study_with_parameters(10, 15, 20);
		a2.addition();
	}
	
	public Constructor_study_with_parameters(int a)
	{
		num1=a;
	}
	
	public Constructor_study_with_parameters(int a, int b)
	{
		num1=a;
		num2=b;
	}
	
	public Constructor_study_with_parameters(int a, int b, int c)
	{
		num1=a;
		num2=b;
		num3=c;
	}
	
	public void addition()
	{
		int sum=num1+num2+num3;
		System.out.println("The addition is "+sum);
	}
}
