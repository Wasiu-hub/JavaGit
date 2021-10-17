
import java.util.ArrayList;
import java.util.Scanner;

// Write a program that reads numbers from the user. When number 9999 is entered, the reading process stops. After this the program will print the smallest number in the list, and also the indices where that number is found. Notice: the smallest number can appear multiple times in the list.

public class IndexOf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        System.out.print("Search for? ");
        int number = Integer.valueOf(scanner.nextLine());
        for (int i = 0; i < list.size(); i++) {
            int index = list.get(i);
            if (index == number) {
                System.out.println(number + " is at index " + i);
            } else {

                System.out.println("");
            }

        }

        // implement here finding the indices of a number
    }
}
