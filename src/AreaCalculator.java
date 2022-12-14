public class AreaCalculator {
    private static final double PI = Math.PI;

    public static void main(String[] args) {
        double ans = area(5.0);
        System.out.println(ans);
    }

    public static double area(double radius) {
        if (radius < 0) {
            return -1.0;
        }

        return PI * radius * radius;
    }

    public static double area(double x, double y) {
        if (x < 0 || y < 0) {
            return -1.0;
        }

        return x * y;
    }
}
