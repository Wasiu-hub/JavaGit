
public class ArrayPrinter {

    // Complete the method public static void printNeatly(int[] array) in the class named 'ArrayPrinter' to make it print the numbers of the array it receives more neatly. There should be a whitespace and a comma between each number. don't put a comma after the last number.
    // Print the numbers on one line using System.out.print.

    public static void main(String[] args) {
        int[] array = {5, 1, 3, 4, 2};
        printNeatly(array);
//        System.out.println(array);
       
    }

    public static void printNeatly(int[] array) {
       
        int index = 0;
        while (index < array.length - (1)) {
            System.out.print(array[index] + ", ");
            index++;

            }

            if (index == array.length - (1)) {
                System.out.println(array[index] + "");
        }
    }
}
