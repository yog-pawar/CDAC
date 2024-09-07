package OOPJ;

import java.util.Scanner;

public class BMIndex {
	
public static void main (String args[]){
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter weight");
		float weight = sc.nextFloat();
		System.out.println("Enter height");
		float height = sc.nextFloat();
		Float Bmi;
		
		Bmi= weight/(height*height);
		
		if(Bmi<15) {
			System.out.println("You are underweight");
		}
		else if(Bmi>=25) {
			System.out.println("You are overweight");
		}
		else {
			System.out.println("You are fit");
		}

}
}
