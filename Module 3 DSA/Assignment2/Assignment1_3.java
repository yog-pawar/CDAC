package assignment2;
import java.util.Scanner;

public class Assignment1_3{
	
	public static String removespace(String str) {
        return str.replaceAll("\\s+", "");   ////// Removes whitespace characters
    }
	
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String result = removespace(input);

        System.out.println("String after removing whitespace: \"" + result + "\"");

    }    
}
