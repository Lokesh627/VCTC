package inheritance;

public class Singlelevelinheritance {

	public static void main(String[] args) 
	{
		Motherclass_Single_level m= new	Motherclass_Single_level();
		m.home();
		m.money();
		
		System.out.println("=====================================================================");
		
		Sonclass_Single_level s= new Sonclass_Single_level();
		
		s.laptop();
		s.mobile();
		s.money();
		s.home();
	}

}
