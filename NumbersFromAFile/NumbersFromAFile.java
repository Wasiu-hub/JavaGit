//Write a program that prompts the user for a filename, as well as the upper and lower bounds for the accepted range of numbers. Then the program reads the numbers contained in the file (each number is on its own line) and only accounts for the numbers which are inside the given range. Finally, the program should print the number of numbers that were inside the given range.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();

        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());

        try (Scanner filescanner = new Scanner(Paths.get(file))) {

            int index = 0;
            while (filescanner.hasNextLine()) {
                int line = Integer.valueOf(filescanner.nextLine());

                if (line >= lowerBound && line <= upperBound) {
                    index++;
                }
            }
            System.out.println("Numbers: " + index);

        } catch (Exception e) {
            System.out.println("Reading the file" + file + "failed.");

        }
    }
