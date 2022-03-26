// Implement a program, which calculates the sum 1+2+3+...+n where n is given as user input.
class Main1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Last number? ");
        int lastNumber = scan.nextInt();

        int sum = 0;
        for (int i = 1; i <= lastNumber; i++) {
            sum += i;
        }
        System.out.println("The sum is " + sum);
    }
}
