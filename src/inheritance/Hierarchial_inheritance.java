package inheritance;

public class Hierarchial_inheritance {

	public static void main(String[] args) 
	{
		Son_hierarchial s= new Son_hierarchial();
		s.laptop();
		s.mobile();
		s.money();
		s.home();
		System.out.println("=====================================");
		
		Daughter_hierarchial d=new Daughter_hierarchial();
		d.emotions();
		d.jewels();
		d.home();
		d.money();
		System.out.println("=====================================");
		
		Mother_hierarchial m=new Mother_hierarchial();
		m.home();
		m.money();
		
		
	}

}
