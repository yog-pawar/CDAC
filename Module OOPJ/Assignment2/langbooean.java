package OOPJ.Assignment2;


//////////////1. Working with java.lang.Boolean/////

public class langbooean {
	
	public static void main(String args[]) {
		
		boolean status = true;
		String s = Boolean.toString(status);
		System.out.println(s);
		
		/*String strStatus = "true";
		boolean a = Boolean.parseBoolean(strStatus);
		System.out.println(a);*/
		
		String str = "1";    ///it wont work for 1 and 0 bcoz it gives boolean values.
		boolean b = Boolean.parseBoolean(str);
		System.out.println(b);
		
		String strStatus = "true";
		boolean a = Boolean.valueOf(strStatus);
		System.out.println(a);
}
}
