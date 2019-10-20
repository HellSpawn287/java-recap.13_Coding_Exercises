public class MegaBytes_Converter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (0 <= kiloBytes) {
            System.out.println(kiloBytes + " KB = "
                    + kiloBytes / 1024 + " MB and "
                    + kiloBytes % 1024 + " KB.");
        } else {
            System.out.println("Invalid Value");
        }
    }

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2050);
        System.out.println("\n");
        printMegaBytesAndKiloBytes(-2050);
        printMegaBytesAndKiloBytes(0);
    }
}
