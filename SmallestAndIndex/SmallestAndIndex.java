// Write a program that reads numbers from the user. Reading process stops when number 9999 is entered. The program prints the smallest number in the list and the index where found.

class Main1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            System.out.println("Enter number, 99 stops input");
            int number = scan.nextInt();
            if (number == 9999) {
                break;
            }
            list.add(number);
        }

        int smallest = list.get(0);
        int i = 0;
        while (i < list.size()) {
            if (list.get(i) < smallest) {
                smallest = list.get(i);
            }
            i++;
        }
        :System.out.println("Smallest number is " + smallest);
         i = 0;


        while (i < list.size()) {
            if (list.get(i) == smallest) {
                System.out.println("Found at index " + i);
            }
            i++;
        }
    }
}
