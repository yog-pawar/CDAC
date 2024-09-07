package OOPJ.Assignment2;

public class langshort {
	
	public static void main(String args[]) {
		
		short s = Short.BYTES;
		System.out.println(s);
		
		short u = Short.MAX_VALUE;
		System.out.println(u);
		
		short v = Short.MIN_VALUE;
		System.out.println(v);
		
		short number = 505;
		String a= Short.toString(number);
		System.out.println(a);
		
		String strnumber = "400";
		short b = Short.parseShort(strnumber);
		System.out.println(b);
		
		//String str = "ab1cd25";
		//short c = Short.parseShort(str);
		//System.out.println(c);
		
		short num = 2500;
		Short d= Short.valueOf(num);
		System.out.println(d);
		
		String str1 = "1000";
		short e = Short.valueOf(str1);
		System.out.println(e);
		
		
	}

}
