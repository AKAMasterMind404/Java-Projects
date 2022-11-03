public class MethodOverloading {
    // METHOD OVERLOADING IS WHEN MULTIPLE METHODS ARE DECLARED
    // WITH THE SAME NAME YET DIFFERENT NUMBER OR TYPES
    // OF PARAMETERS

    /*
    Definition: Method Overloading is a feature that allows us to have multiple
    methods within the same class but with differing parameters. This allows
    us to have different implementations for with the same name. Calls to an
    overloaded method will run/return a specific implementation of the method.

    Changing just the return type of method will not overload it. In order to
    properly overload a method, the number of parameters must be different by one
    or at-least one parameter should have a different data type.
    */

    public static void main(String[] args) {
        double v1 = calcFeetAndInchesToCentimeters("10");
        double v2 = calcFeetAndInchesToCentimeters(10, 3);
        double v3 = calcFeetAndInchesToCentimeters(20);
        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);
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

        return calcFeetAndInchesToCentimeters(feet, 0);
    }

    public static double calcFeetAndInchesToCentimeters(String inches) {
        return calcFeetAndInchesToCentimeters(0, Double.parseDouble(inches));
    }

}
