public class MinutesToYearsAndDays {
    private static final String INVALID_VALUE = "Invalid Value";

    public static void main(String[] args) {
        printYearsAndDays(1051200);
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println(INVALID_VALUE);
            return;
        }

        long years = minutes / (60 * 24 * 365);
        long days = (minutes % (60 * 24 * 365)) / (60 * 24);

        String ans = minutes + " min = " + years + " y and " + days + " d";
        System.out.println(ans);
    }
}
