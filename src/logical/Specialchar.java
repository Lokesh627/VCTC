package logical;

public class Specialchar {

	public static void main(String[] args) 
	{
		String a= "1!2@3abc#4567*&";
		System.out.println(a.replaceAll("[^0-9]", ""));
				

	}

}
