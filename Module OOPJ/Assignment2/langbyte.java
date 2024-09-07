package OOPJ.Assignment2;

public class langbyte {
	
	public static void main(String args[]) {

		byte b= Byte.BYTES;
		System.out.println(b);
		
		byte c =Byte.MAX_VALUE;
		System.out.println(c);
		
		byte d =Byte.MIN_VALUE;
		System.out.println(d);
		
		byte number = 25;
		String s = Byte.toString(number);
		System.out.println(s);
		
		//String strnumber = "20";
		//byte j = Byte.parseByte(strnumber);
		//System.out.println(j);
		
		//String stnumber = "An12cd3";
		//byte k =Byte.parseByte(stnumber);  //throws exception
		//System.out.println(k);
		
		byte number1 = 25;
		byte n = Byte.valueOf(number1);
		System.out.println(n);
		
		String strnumber = "20";
		byte m = Byte.valueOf(strnumber);
		System.out.println(m);
		
	
}
}