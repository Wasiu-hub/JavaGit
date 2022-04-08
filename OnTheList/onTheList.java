// Write a program that reads the user input until an empty string is entered. The inputs are added into a list. After reading the inputs, one more string is requested from the user. The program then tell whether that string was found in the list or not.

class Main1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        System.out.println("Enter names");

        while (true) {
            String inputString = scan.nextLine();
            if (inputString.equals("")) {
                break;
            }
            list.add(inputString);
        }

        System.out.print("Search for ? ");
        String searchedString = scan.nextLine();

        if (list.contains(searchedString)) {
            System.out.println(searchedString + " was found!");
        } else {
            System.out.println(searchedString + " was not found!");
        }
    }
}

