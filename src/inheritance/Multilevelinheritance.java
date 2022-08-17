package inheritance;

public class Multilevelinheritance {

	public static void main(String[] args) 
	{
		Sonclass_multilevel s= new Sonclass_multilevel();
		s.mobile();
		s.laptop();
		s.home1();
		s.money1();
		s.recipe();
		s.keys();
		System.out.println("============================================================");
		
		Motherclass_multilevel m= new Motherclass_multilevel();
		m.home1();
		m.money1();
		m.keys();
		m.recipe();
		System.out.println("============================================================");
		
		Grandmother_multilevel g= new Grandmother_multilevel();
		g.keys();
		g.recipe();
		

	}

}
