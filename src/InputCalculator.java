import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int s = 0;
        long c = 0;

        while (scanner.hasNextInt()) {
            s += scanner.nextInt();
            c += 1;
        }

        long a = Math.round((double) s / c);
        System.out.println("SUM = " + s + " AVG = " + a);
    }
}
