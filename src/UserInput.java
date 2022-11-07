import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        int captured = 0;

        while (captured < 10) {
            boolean hasDouble = scanner.hasNextDouble();
            if (hasDouble) {
                sum += scanner.nextDouble();
                captured++;
            } else {
                scanner.next();
            }
        }

        System.out.println(sum);
        scanner.close();
    }
}
