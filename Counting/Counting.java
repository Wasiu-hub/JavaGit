
import java.util.Scanner;

// Write a program that reads an integer from the user. Next, the program prints numbers from 0 to the number given by the user. You can assume that the user always gives a positive number.

public class Counting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
	System.out.println("Enter inputs");
        int number = scanner.nextInt();
        for (int i = 0; i <= number; i++) {
            System.out.println(i);
        }
    }
}
