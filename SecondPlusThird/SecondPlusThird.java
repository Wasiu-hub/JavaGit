/:/ Write a program that reads integers from the user and adds them to a list, this ends when the user enters 0, and find the sum of the second and third elements. The program is allowed to malfunction if there are fewerthan three entries on the list

import java.util.ArrayList;
import java.util.Scanner;

public class SecondPlusThird {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int number = scanner.nextInt;
            if (number == 0) {
                break;
            }

            numbers.add(number);
        }
        int sum = (numbers.get(1) + numbers.get(2));
        System.out.println(sum);
    }
}.
