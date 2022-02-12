// Write a program that asks the user for input until the user inputs 0. After this the program prints the amount of numbers
// inputted and the sum of the numbers. The number zero does not need to be added to the sum, but adding it does not change
// the results. You need two variables to keep track of the information. Use one for keeping track of the numbers inputted
// and other for keeping track of the sum

        Scanner scanner = new Scanner(System.in);
        int value = 0;
        int period = 0;
        while (true) {
            System.out.println("Give a number:");
            int num = scanner.nextInt();
            System.out.println();
            if (num == 0) {
                break;
            }
            if (num != 0) {
                value = value + 1;
                period = period + num;
            }
        }
        System.out.println("Number of numbers: " + value);
        System.out.println("Sum of the numbers: " + period);
