package generalisation;

public class Testgeneralisation {

	public static void main(String[] args) {
		Airtel a=new Airtel();
		a.call();
		a.data();
		a.msg();
		a.NewMethodAirtel();
		System.out.println("===========Airtel============");
		
		Jio j=new Jio();
		j.call();
		j.data();
		j.msg();
		j.JioNewMethod();
		System.out.println("============JIO===============");
		
		VI v=new VI();
		v.call();
		v.data();
		v.msg();
		v.VInewmethod();
		System.out.println("=============VI================");
		

	}

}
