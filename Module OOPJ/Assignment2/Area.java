package OOPJ;

import java.util.Scanner;

public class Area {

	public static void main (String args[]){
		
		
		System.out.println("Enter any shape");
		Scanner sc = new Scanner(System.in);
		String shape = sc.next();
		
		switch(shape)
		{
		
			case "square":
				System.out.println("Enter side of square");
				int s = sc.nextInt();
				System.out.println("Area os square is " +(s*s) );
			break;	
		
		case "circle":
			System.out.println("Enter radius of circle");
			int r = sc.nextInt();
			System.out.println("Area os circle is " +((r*r)*3.14));
		break;	
		
			case "rectangle":
				System.out.println("Enter length and width of rectangle");
				int l = sc.nextInt();
				int w = sc.nextInt();
				System.out.println("Area os rectangle is " +(l*w));
			break;	
		
		case "triangle":
			System.out.println("Enter height and base of triangle");
			int h = sc.nextInt();
			int b = sc.nextInt();
			System.out.println("Area os triangle is " +((h*b)/2));
		break;	
		
		default:
			System.out.println("You are weak in maths");
		
        }
}
}
