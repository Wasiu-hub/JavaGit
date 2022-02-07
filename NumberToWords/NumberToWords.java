/** 5.EX 23 Number To Words
 Write a method called numberToWords with one int parameter named number. The method should print out the passed number using words for the digits. If the number is negative, print "Invalid Value".
 Write a second method called reverse. The method reverse should have one int parameter and return the reversed number (int). For example, if the number passed is 234, then the reversed number would be 432. The method  reverse should also reverse negative numbers. Use the method reverse within the method numberToWords in order to print the words in the correct order.
 Write a third method called getDigitCount. The method getDigitCount should have one int parameter called number and return the count of the digits in that number. If the number is negative, return -1 to indicate an invalid value. For example, if the number has a value of 100, the method getDigitCount should return 3 since the number 100 has 3 digits (1, 0, 0).
 */
public static void numberToWords(int number) {
    if (number < 0) {
        System.out.print("Invalid Value");
    }
    int reversedNumber = reverse(number);
    int lastDigit = reversedNumber % 10;
    int digitLeft = reversedNumber / 10;
    int numberCount = getDigitCount(number);
    int i = 0;
    while (i < numberCount) { //   while (lastDigit != 0) was this initially
        switch (lastDigit) {

            case 0:
                System.out.print("Zero ");
                break;
            case 1:
                System.out.print("One ");
                break;
            case 2:
                System.out.print("Two ");
                break;
            case 3:
                System.out.print("Three ");
                break;
            case 4:
                System.out.print("Four ");
                break;
            case 5:
                System.out.print("Five ");
                break;
            case 6:
                System.out.print("Six ");
                break;
            case 7:
                System.out.print("Seven ");
                break;
            case 8:
                System.out.print("Eight ");
                break;
            case 9:
                System.out.print("Nine ");
                break;
            default:
                break;
        }
        lastDigit = digitLeft % 10;
        digitLeft /= 10;
        i++;
    }
}
    public static int reverse(int number) {
        int reverse = 0;
        while (number != 0) {
            int lastDigit = number % 10;
            reverse = (reverse * 10) + lastDigit;
            number = number / 10;
        }
        return reverse;
    }
    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }
        int counter = 1;
        while (number > 9) {
            number /= 10;
            counter++;
        }
        return counter;
    }
}

