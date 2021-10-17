
public class Printer {

    // Complete the method public static void printArrayInStars(int[] array) in the class named 'Printer' to make it print a row of stars for each number in the array. The amount of stars on each row is defined by the corresponding number in the array.

    public static void main(String[] args) {
        // You can test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array) {
        // Write some code in here
        int i = 0;
        while (i < array.length) {
            int number = array[i];

            int j = 0;
            while (j <= number - 1) {
                System.out.print("*");
                j++;
            }

            System.out.println("");
            i++;
        }
    }

}
