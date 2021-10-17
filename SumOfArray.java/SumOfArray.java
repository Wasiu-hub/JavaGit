
public class SumOfArray {

    // The class SumOfArray has a method public static int sumOfNumbersInArray(int[] array). Complete the method so that it computes and returns the sum of the numbers in the array it receives as parameter.

    public static void main(String[] args) {
        // You can try the method here
        int[] array = {5, 1, 3, 4, 2};
        int answer = sumOfNumbersInArray(array);
        System.out.println(answer);
    }

    public static int sumOfNumbersInArray(int[] array) {
        // Write some code here
        int sum = 0;
        int index = 0;
        while (index < array.length) {
            int number = array[index];
            sum = sum + number;
            index = index + 1;
        }
        return sum;
    }
}
