package logical;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
//		Scanner sc= new Scanner(System.in);
//		System.out.println("Please enter String");
		
//		String orignal = sc.next();
		String orignal= "shubham";
		String reverse="";
		
		for(int i=orignal.length()-1;i>=0;i--)
		{
		reverse=reverse+orignal.charAt(i);
		}
		
		System.out.println("Given string is "+orignal);
		System.out.println("Reverse of string is "+reverse);
		
		if(orignal.equals(reverse))
		{
		System.out.println("String is in palindrome");
		}
		else {
		System.out.println("String is not palindrome");
		}
		

	}

}
