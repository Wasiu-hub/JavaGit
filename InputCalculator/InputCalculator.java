/**Input Calculator
 Write a method called inputThenPrintSumAndAverage that does not have any parameters.
 The method should not return anything (void) and it needs to keep reading int numbers from the keyboard.
 When the user enters something that is not an int then it needs to print a message in the format "SUM = XX AVG = YY".
 XX represents the sum of all entered numbers of type int.
 YY represents the calculated average of all numbers of type long.
 */
public static void inputThenPrintSumAndAverage() {
    Scanner scan = new Scanner(System.in);
    int sum = 0;
    int count = 0;
    double avg = 0;
    while (true) {
        System.out.println("Enter number");
        boolean isAnInt = scan.hasNextInt();

        if (isAnInt) {
            int number = scan.nextInt();

            sum += number;
            count++;

        } else {
            break;
        }
        scan.nextLine();
        avg = sum/(double)count;
    }
    System.out.println("SUM = " + sum + " AVG = " + Math.round(avg));
}

