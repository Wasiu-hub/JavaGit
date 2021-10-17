
import java.util.Scanner;

// The exercise template already contains a program, that creates an array and prints the values of the array twice. Modify the program to do following: After the first printing, the program should ask for two indices from the user. The values in these two indices should be swapped, and in the end the values of the array should be printed once again.

public class Swap {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int[] array = new int[5];
        array[0] = 1;
        array[1] = 3;
        array[2] = 5;
        array[3] = 7;
        array[4] = 9;

        int index = 0;
        while (index < array.length) {
            System.out.println(array[index]);
            index++;
        }
        System.out.println("");

        System.out.println("Give two indices to swap:");
        int num1 = Integer.valueOf(reader.nextLine());
        int num2 = Integer.valueOf(reader.nextLine());
        
        System.out.println("");

        int helper = array[num1];
        array[num1] = array[num2];
        array[num2] = helper;

        index = 0;

        while (index < array.length) {
            System.out.println(array[index]);
            index++;
        }

    }

}
