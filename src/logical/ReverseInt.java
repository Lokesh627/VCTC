package logical;

public class ReverseInt {

	public static void main(String[] args) 
	{
	
		int a=156237;
		int b=0;
		
		for(int i=a; i>0; i=i/10)
		{
			int c=i%10;
			b=(b*10)+c;
		}
		
		System.out.println(b);

	}

}
