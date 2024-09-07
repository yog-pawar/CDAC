package OOPJ.Assignment2;

public class PrimtoStrin {
	
	static boolean o = false;
	static char c = 'A';
	static byte b = 15;
	static short s =150;
	static int i = 1500;
	static long l = 15500000;
	static float f = 10.5f;
	static double d = 25.635;
	static String st = "yogesh";
	
	public static void main(String args[]) {
		
		String boo = Boolean.toString(o);
		System.out.println(boo);
		String a1 = String.valueOf(o);
		System.out.println(a1);
		
		String by = Byte.toString(b);
		System.out.println(by);
		String b1 = String.valueOf(b);
		System.out.println(b1);
		
		String sh = Short.toString(s);
		System.out.println(sh);
		String c1 = String.valueOf(s);
		System.out.println(c1);
		
		String in = Integer.toString(i);
		System.out.println(in);
		String d1 = String.valueOf(i);
		System.out.println(d1);
		
		String lon = Long.toString(l);
		System.out.println(lon);
		String e1 = String.valueOf(l);
		System.out.println(e1);
		
		String flt = Float.toString(f);
		System.out.println(flt);
		String f1 = String.valueOf(f);
		System.out.println(f1);
		
		String dbl = Double.toString(d);
		System.out.println(dbl);
		String g1 = String.valueOf(d);
		System.out.println(g1);
			
	}
}
