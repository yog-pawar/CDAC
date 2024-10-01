package assignment2;
import java.util.Scanner;

public class Assignment1_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the height ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            // Print stars for the current row
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // new line
            System.out.println();
        }

        scanner.close();
    }
}
