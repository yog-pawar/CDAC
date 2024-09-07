package OOPJ;

import java.util.Scanner;

public class Age {
	
	public static void main (String args[]){
		
		System.out.println("Enter age");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		
		if (age>=18) {
			System.out.println("Vote its ur right");
		}
		else {
			System.out.println("You cant vote");
		}
		
	}

}
