// Write a method public static void divisibleByThreeInRange(int beginning, int end) that prints all the numbers divisible
// by three in the given range. The numbers are to be printed in order from the smallest to the greatest.
class Main1 {
    public static void main(String[] args) {
        divisibleByThree(2,10);
    }
    public static void divisibleByThree(int beginning, int end) {
        for (int i = beginning; i <= end; i++) {
            if (i % 3 == 0){
                System.out.println(i);
            }
        }
    }
}
