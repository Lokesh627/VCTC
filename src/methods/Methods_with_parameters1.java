package methods;

public class Methods_with_parameters1 {

	public static void main(String[] args) 
	{
		Methods_with_parameters1 object=new Methods_with_parameters1();
		object.square();
		
		rectangle(5, 5);
		rectangle(9, 8);
	}
	
	public void square()
	{
		int l=10;
		int b=10;
		int area= l*b;
		System.out.println(area);
	}
	
	public static void rectangle(int a, int b)
	{
		int area=a*b;
		System.out.println(area);
	}

}
