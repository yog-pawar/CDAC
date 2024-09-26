package assignment1;

import java.util.Scanner;

public class Assignment1_3 {
	
	public static int fact(int i){
			if(i<=1) 
				return 1;	
			else 
			return (i*fact(i-1));
					}
	
		public static void main(String[] args) {
			System.out.println("enter number");
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			System.out.println(fact(a));
	}
}
