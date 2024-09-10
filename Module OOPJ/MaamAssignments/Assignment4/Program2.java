package Assignment4;

public class Program2 {

	public static void main(String[] args) {
		
		int a=10;
		double z= 1111.256;
		
		double d= a;
		System.out.println(+d);
		
		float f = a;
		System.out.println(+f);
		
		/*boolean b = (boolean) a;   ////not allowed
		System.out.println(b);*/
		
		//String g = (String) a;      ///not allowed
		//System.out.println(g);
		
		String s= Double.toString(z); ///not widening but method of conversion
		System.out.println(s);
		
		
	}

}
