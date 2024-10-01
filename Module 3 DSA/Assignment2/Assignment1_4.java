package assignment2;

import java.util.Scanner;

public class Assignment1_4 {
	
	 static void printString(String str) {
		 if (str.length() == 0) {
		 return;
		 }
		 printString(str.substring(1));
		 System.out.print(str.charAt(0) + " ");
		 }
	 
	 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string");
		String a = sc.nextLine();
		 printString(a);
		 }
    
}
