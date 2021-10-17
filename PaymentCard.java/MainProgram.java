
public class MainProgram {
   PART 1
// The exercise template comes with a code file called Main, which contains the main method.

// Add a new class to the project called PaymentCard. Here's how to add a new class: On the left side of the screen is the list of projects. Right-click on the project name. Select New and Java Class from the drop-down menu. Name the class as "PaymentCard".

// First, create the PaymentCard object's constructor, which is passed the opening balance of the card, and which then stores that balance in the object's internal variable. Then, write the toString method, which will return the card's balance in the form "The card has a balance of X euros".

// The following is the template of the PaymentCard class:
// public class PaymentCard {
//     private double balance;

//     public PaymentCard(double openingBalance) {
//         // write code here
//     }

//     public String toString() {
//         // write code here
//     }
// }

  PART 2

//   Complement the PaymentCard class with the following methods:

// public void eatAffordably() {
//     // write code here
// }

// public void eatHeartily() {
//     // write code here
// }

// The method eatAffordably should reduce the card's balance by € 2.60, and the method eatHeartily should reduce the card's balance by € 4.60.

  PART 3
// What happens if the card runs out of money? It doesn't make sense in this case for the balance to turn negative. Change the methods eatAffordably and eatHeartily so that they don't reduce the balance should it turn negative.

  PART 4

//   Topping up the card
// Add the following method to the PaymentCard class:

// public void addMoney(double amount) {
//     // write code here
// }

  PART 5
//   Topping up the card with a negative value
// Change the addMoney method further, so that if there is an attempt to top it up with a negative amount, the value on the card will not change.

// The following main program tests the class:

// public class MainProgram {
//     public static void main(String[] args) {
//         PaymentCard card = new PaymentCard(10);
//         System.out.println("Paul: " + card);
//         card.addMoney(-15);
//         System.out.println("Paul: " + card);
//     }
// }

  PART 6

// Multiple cards
// Write code in the main method of the MainProgram class that contains the following sequence of events:

// Create Paul's card. The opening balance of the card is 20 euros
// Create Matt's card. The opening balance of the card is 30 euros
// Paul eats heartily
// Matt eats affordably
// The cards' values ​​are printed (each on its own line, with the cardholder name at the beginning of it)
// Paul tops up 20 euros
// Matt eats heartily
// The cards' values ​​are printed (each on its own line, with the cardholder name at the beginning of it)
// Paul eats affordably
// Paul eats affordably
// Matt tops up 50 euros
// The cards' values ​​are printed (each on its own line, with the cardholder name at the beginning of it)
// The main program's template is as follows:

// public class Main {
//     public static void main(String[] args) {
//         PaymentCard paulsCard = new PaymentCard(20);
//         PaymentCard mattsCard = new PaymentCard(30);

//         // write code here
//     }
// }


    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        
        // Here you can write code to test that PaymentCard works as intended
        // be sure to erase the extra code for the last part of the exercise!
        PaymentCard paulsCard = new PaymentCard(20);
        PaymentCard mattsCard = new PaymentCard(30);
        
        paulsCard.eatHeartily();
        mattsCard.eatAffordably();
        
        System.out.println("Paul: " + paulsCard);
        System.out.println("Matt: " + mattsCard);
        
        paulsCard.addMoney(20);
        mattsCard.eatHeartily();
        
        System.out.println("Paul: " + paulsCard);
        System.out.println("Matt: " + mattsCard);
        
         paulsCard.eatAffordably();
         paulsCard.eatAffordably();
         mattsCard.addMoney(50);
        
        System.out.println("Paul: " + paulsCard);
        System.out.println("Matt: " + mattsCard);
        

//        card.addMoney(-15);
//        System.out.println("Paul: " + card);

//        card.eatAffordably();
//        card.addMoney(15);
//        System.out.println(card);
//        
//        card.addMoney(10);
//        System.out.println(card);
//        
//        card.addMoney(200);
//        System.out.println(card);
//        card.eatHeartily();
//        card.eatAffordably();
//        System.out.println(card);

           
    }
}
