// Write a program that prints from a given value to another given value.
:
class Main1 {
    public static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Where to? ");
        int end = console.nextInt();

        System.out.print("Where from? ");
        int begin = console.nextInt();

        for (int i = begin; i <= end; i++) {
            System.out.println(i);
        }
    }
