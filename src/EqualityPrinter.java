public class EqualityPrinter {
    private static final String INVALID_VALUE = "Invalid Value";

    public static void main(String[] args) {
        printEqual(1,2, 3);
    }

    public static void printEqual(int x, int y, int z) {
        if (x < 0 || y < 0 || z < 0) {
            System.out.println(INVALID_VALUE);
            return;
        }

        if (x == y && y == z) {
            System.out.println("All numbers are equal");
            return;
        }

        if (x != y && x != z && y != z) {
            System.out.println("All numbers are different");
            return;
        }

        System.out.println("Neither all are equal or different");
    }

}
