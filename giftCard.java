// A friend of yours was hired to create an application for a new burger restaurant chain that arrived in town. It should calculate whether a customer should be given a gift card. The intention is that after the first 1000 customers, every 25th should receive a gift card. In addition, every 2000th customer gets a larger gift card. Others receive nothing (expect for the chance to buy the restaurant's servings, of course!).

public class Main {

    public static void main(String[] args) {


        Scanner x = new Scanner(System.in);
        System.out.print("Customer number: ");
        int y = Integer.valueOf(x.nextLine());

        if (y >= 1000 && y % 2000 == 0) {
            System.out.println("Gets a large gift card!");
        } else if (y % 25 == 0) {
            System.out.println("Gets a gift card!");
        } else {
            System.out.println("Gets nothing.");
        }

    }
}