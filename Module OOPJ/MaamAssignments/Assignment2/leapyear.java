package OOPJ;

import java.util.Scanner;

public class leapyear {
	
	public static void main (String args[]) {
		
		System.out.println("Enter a year");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String b;
		
		//if (a%4==0 && a%100!=0 || a%400==0) {
			
		//	System.out.println("is a leap year");
		//}
		//else {
		//	System.out.println("is not a leap year");
		//}
		
	//}
//}

/////using switch case////
		b = (a%4==0 && a%100!=0 || a%400==0)? "leap" : "not leap";

		switch(b) {
        
        case "leap":
        	
        	System.out.println("is a leap year");
        	break;
        	
        case "not leap":
        	System.out.println("is not a leap year");
        	break;
        	
        default:
        	System.out.println("not born");
        
        }
	}
}
