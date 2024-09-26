package assignment6;

public class Question6 {
	public static void main(String[] args) {
		 int[] numbers = { 1, 2, 3, 5, 6 };
		 int N = numbers.length + 1;
		 int sumOfN = N * (N + 1) / 2;
		 int sumOfArray = 0;
		 for (int number : numbers) {
		 sumOfArray += number;
		 }
		 int missingNumber = sumOfN - sumOfArray;
		 System.out.println("Missing number: " + 
		missingNumber);
		 }
}
