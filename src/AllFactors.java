public class AllFactors {
    public static void main(String[] args) {
        printFactors(10);
    }

    public static void printFactors(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
            return;
        }
        int n = 1 + (number / 2);
        for (int i = 1; i < n; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.print(number);
    }
}
