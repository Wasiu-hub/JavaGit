
public class AdvancedAstrology {

// PART 1 - Printing stars and spaces
// Define a method called printSpaces(int number) that produces the number of spaces specified by number. The method does not print the line break.

// You will also have to either copy the printStars method your previous answer or reimplement it in this exercise template.

// PART 2- Printing a right-leaning triangle
// Create a method called printTriangle(int size) that uses printSpaces and printStars to print the correct triangle. So the method call printTriangle(4) should print the following:

// PART 3- Printing a Christmas tree
// Define a method called christmasTree(int height) that prints the correct Christmas tree. The Christmas tree consists of a triangle with the specified height as well as the base. The base is two stars high and three stars wide, and is placed at the center of the triangle's bottom. The tree is to be constructed by using the methods printSpaces and printStars.


    public static void printStars(int number) {
        // part 1 of the exercise
        int num = 0;
        while (num < number) {
            System.out.print("*");
            num++;
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise

        int num = 0;
        while (num < number) {
            System.out.print(" ");
            num++;
        }
    }

    public static void printTriangle(int size) {
//        // part 2 of the exercise
        int i = 1;
        int j = size - 1;
        while (i <= size && j >= 0) {
            printSpaces(j);
            printStars(i);
            i++;
            j--;
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        int num = 0;
        int spaces = height - 1;
        int stars = 1;

        while (num < height) {

            printSpaces(spaces);

            printStars(stars);
            spaces = spaces - 1;
            stars = stars + 2;
            num++;
        }

        int line = 0;
        while (line < 2) {
            printSpaces(height - 2);
            printStars(3);
            line++;
        }
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("\n---");
        christmasTree(4);
        System.out.println("\n---");
        christmasTree(10);
    }
}
