public class UnitConversion {
    public static void main(String[] args) {
        double ans = calcFeetAndInchesToCentimeters(13,1);
        System.out.println(ans);
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet < 0 || inches < 0 || inches > 12) {
            System.out.println("Invalid feet or inches parameters");
            return -1;
        }
        double total = 0.0;
        total += 30.48 * feet;
        total += 2.54 * inches;

        return total;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) {
            System.out.println("Invalid feet or inches parameters");
            return -1;
        }
        double feet = inches / 12;
        System.out.println("total:" + feet);

        return calcFeetAndInchesToCentimeters(feet, 0);
    }
}
