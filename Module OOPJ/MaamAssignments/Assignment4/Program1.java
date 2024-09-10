package Assignment4;

public class Program1 {

	public static void main(String[] args) {
		//// widening
		int a = 10;
		double d = a;
		System.out.println(+d);
		
		////narrowing
		double c = 153.56;
		int b = (int) c;
		System.out.println(+b);
		
		///arithmetic operations
		int i =10;
		float f= 2.22f;
		double j=659888888888888888.222;
		
		///widening
		double sum = i+f+j;
		System.out.println(+sum);
		
		///
		double sub = (short)j-f-i;
		System.out.println(+sub);

	}

}
