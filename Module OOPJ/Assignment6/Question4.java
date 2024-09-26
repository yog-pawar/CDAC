package assignment6;

import java.util.Arrays;

public class Question4 {
	public static void main(String[] args) {
		 int[] numbers = { 10, 20, 10, 30, 40, 30, 50 };
		 Arrays.sort(numbers);
		 
		int[] uniqueNumbers = new int[numbers.length];
		 int j = 0;
		 uniqueNumbers[j++] = numbers[0];
		 for (int i = 1; i < numbers.length; i++) {
		 if (numbers[i] != numbers[i - 1]) {
		 uniqueNumbers[j++] = numbers[i];
		 }
		 }
		 System.out.println("Array after removing duplicates:");
		 for (int i = 0; i < j; i++) {
		 System.out.print(uniqueNumbers[i] + " ");
		 }
		 }
}
