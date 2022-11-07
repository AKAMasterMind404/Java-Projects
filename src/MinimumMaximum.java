import java.util.Scanner;

public class MinimumMaximum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;

        while (scanner.hasNextDouble()){
            double d = scanner.nextDouble();
            if (d < min) min = d;
            if (d > max) max = d;
        }

        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);

        scanner.close();
    }
}
