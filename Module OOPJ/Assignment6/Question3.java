package assignment6;

public class Question3 {
	 public static void main(String[] args) {
		 int[] numbers = { 20, 5, 7, 8, 35, 12 };
		 int max = numbers[0];
		 int min = numbers[0];
		 
		for (int number : numbers) {
		 if (number > max) {
		 max = number;
		 }
		 if (number < min) {
		 min = number;
		 }
		 }
		 System.out.println("Maximum value: " + max);
		 System.out.println("Minimum value: " + min);
		 }
}
