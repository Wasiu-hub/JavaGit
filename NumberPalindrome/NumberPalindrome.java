/** Number Palindrome
 Write a method called isPalindrome with one int parameter called number.
 The method needs to return a boolean.
 It should return true if the number is a palindrome number otherwise it should return false.
 Check the tips below for more info about palindromes

 */

public static boolean palindrome(int number){
    if(number < 0){
        number *= -1;
    }
    int stored = number;
    int reverse = 0;
    while(stored > 0){
        int digit = stored % 10; // extract last significant digit of the      original number

        reverse = (reverse * 10) + digit; // drops last significant digit of the original number

        stored /= 10; // same as number =/10
    }
    if(number == reverse){
        return true;
    } else {
        return false;
    }
}

