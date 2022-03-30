// Write a program that reads integers from the user and adds them to a list, this ends when the user enters -1. Find the greatest of the numbers in the list.
class Main1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        while (true) {
            int input = scanner.nextInt();
            if (input == -1) {
                break;
            }

            list.add(input);
        }
        int greatest = list.get(0);

        for (int i = 0; i < list.size(); i++) {
            int number = list.get(i);
            if (greatest < number) {
                greatest = number;
            }
        }
        System.out.println("The greatest number: " + greatest);
    }
}
