package assignment6;

import java.util.HashSet;

public class Question5 {
	 public static void main(String[] args) {
		 int[] array1 = { 1, 2, 3, 4, 5 };
		 int[] array2 = { 3, 4, 5, 6, 7 };
		 HashSet<Integer> set = new HashSet<>();
		 System.out.println("Intersection of arrays:");
		 for (int value : array1) {
		 set.add(value);
		 }
		 
		for (int value : array2) {
		 if (set.contains(value)) {
		 System.out.print(value + " ");
		 }
		 }
		 }
}
