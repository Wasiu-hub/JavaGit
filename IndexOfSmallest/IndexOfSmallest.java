:
import java.util.ArrayList;
import java.util.Scanner;

// Write a program that reads numbers from the user. When number 9999 is entered, the reading process stops. After this the program will print the smallest number in the list, and also the indices where that number is found. Notice: the smallest number can appear multiple times in the list.

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        // implement here a program that reads user input
        // until the user enters 9999

        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        while (true) {
            int input = scanner.nextInt();
            if (input == 9999) {
                break;
            }

            list.add(input);
        }
        System.out.println("");
        
        int smallest = list.get(0);
        int index = 0;
        while (index < list.size()){
            if (list.get(index) < smallest){
                smallest = list.get(index);
            }
            index++;
        }
        System.out.println("Smallest number: " + smallest);
        
        index = 0;
        while (index < list.size()){
            if (list.get(index) == smallest){
                System.out.println("Found at index: " + index);
            }
            index++;
        }
    }
}
