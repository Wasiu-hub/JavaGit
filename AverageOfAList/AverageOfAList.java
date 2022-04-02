// implement here a program, that first reads user input adding them to a list until user gives -1. Then it
// computes the average of the numbers on the list and prints it.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        while(true){
            int number = scanner.nextInt();
            if (number == -1){
                break;
            }
            list.add(number);
        }
        int count = 0;
        int sum = 0;

        for (int i = 0; i < list.size(); i++) {
            count += 1;
            sum += list.get(i);
        }
        double ave = sum /(double)count;
        System.out.println("Average: " + ave);
    }
