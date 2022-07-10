// Write a program that prints the contents of a file called "data.txt", such that each line 
// of the file is printed on its own line.

import java.nio.file.Paths;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(Paths.get("data.txt"))) {

            while (scanner.hasNextLine()) {
                String row = scanner.nextLine();

                System.out.println(row);
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}:wq

