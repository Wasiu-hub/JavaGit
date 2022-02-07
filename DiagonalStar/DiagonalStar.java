/** Diagonal Star
 Write a method named printSquareStar with one parameter of type int named number.
 If number is < 5, the method should print "Invalid Value".
 The method should print diagonals to generate a rectangular pattern composed of stars (*). This should be accomplished by using loops (see examples below).
 */
public static void printSquareStar(int number) {

    if (number < 5){
        System.out.println("Invalid Value");
    }
    for (int i = 0; i < number && number >= 5; i++) {
        for (int j = 0; j < number && number >= 5; j++) {
            if (i == 0 || i == number - 1) {
                System.out.print("*");
            } else if (j == 0 || j == number - 1) {
                System.out.print("*");

            }else if (i == j) {
                System.out.print("*");
            } else if (j == (number-(i+1))) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();
    }

