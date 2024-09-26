package assignment6;

import java.util.Scanner;

public class Question2 {
	 public static void acceptRecord(int[] numbers) {
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("Enter 5 integer values:");
		 for (int i = 0; i < numbers.length; i++) {
		 System.out.print("Enter value for element " + i 
		+ ": ");
		 numbers[i] = scanner.nextInt();
		
		}
		 }
		 public static void printRecord(int[] numbers) {
		 System.out.println("\nCurrent values of the array:");
		 for (int i = 0; i < numbers.length; i++) {
		 System.out.println("Element " + i + ": " + 
		numbers[i]);
		 }
		 }
		 public static void main(String[] args) {
		 int[] numbers = new int[5];
		 acceptRecord(numbers);
		 printRecord(numbers);
		 }
}
