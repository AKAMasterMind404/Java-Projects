public class DiagonalStar {
    public static void main(String[] args) {
        printSquareStar(9);
    }

    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
            return;
        }
        int numRows = (number - 2) / 2;

        basic(number);
        for (int i = 0; i < numRows; i++) {
            printRow(i, number);
        }
        if (number % 2 == 1) printMiddle(number);
        for (int i = numRows - 1; i >= 0; i--) {
            printRow(i, number);
        }
        basic(number);
    }

    private static void basic(int num) {
        for (int i = 0; i < num; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    private static void printRow(int away, int size) {
        System.out.print("*"); // beginning of row

        for (int i = 0; i < away; i++) {
            System.out.print(" ");
        }
        System.out.print("*"); //first

        for (int i = 0; i < size - (away * 2) - 4; i++) {
            System.out.print(" ");
        }

        System.out.print("*"); //second
        for (int i = 0; i < away; i++) {
            System.out.print(" ");
        }

        System.out.print("*" + "\n"); // end of row
    }

    private static void printMiddle(int num) {
        int numSpaces = (num - 3) / 2;
        System.out.print("*");
        for (int i = 0; i < numSpaces; i++) {
            System.out.print(" ");
        }
        System.out.print("*");
        for (int i = 0; i < numSpaces; i++) {
            System.out.print(" ");
        }
        System.out.print("*" + "\n");
    }
}