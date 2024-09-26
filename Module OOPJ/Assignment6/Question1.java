package assignment6;

import java.util.Scanner;

public class Question1 {
	 public static void main(String[] args) {
		 int[] numbers = new int[5];
		 System.out.println("Default values of the array:");
		 for (int i = 0; i < numbers.length; i++) {
		 System.out.println("Element " + i + ": " + numbers[i]);
		 }
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("\nEnter 5 integer values:");
		 for (int i = 0; i < numbers.length; i++) {
		 System.out.print("Enter value for element " + i + ": ");
		 numbers[i] = scanner.nextInt();
		 
		}
		 System.out.println("\nUpdated values of the array:");
		 for (int i = 0; i < numbers.length; i++) {
		 System.out.println("Element " + i + ": " + numbers[i]);
		 }
		 scanner.close();
		 }
		 
}
