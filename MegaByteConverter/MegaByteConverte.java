    // Write a method that converts kiloByte to MegaByte
    public static void printMegabytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("invalid value");
        } else {

            int megaBytes = kiloBytes / 1024;
            int remKiloBytes = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remKiloBytes + " KB");
        }
    }
