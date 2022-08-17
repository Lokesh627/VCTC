package array_study;

public class Split_use {

	public static void main(String[] args) {
		
		String s="I:LOVE:India";
		String sp=":";
		String[] required=s.split(sp);
		
		System.out.println(required[0]);
		System.out.println(required[1]);
		System.out.println(required[2]);
		System.out.println(required[3]);
		
		//String mystring="Good Morning";
		//String s1=" ";
		//String[] output=mystring.split(s1);
		//System.out.println(output[0]);

	}

}
