public class LastDigitChecker {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(83, 12, 32));
    }

    public static boolean isValid(int num) {
        return !((num < 10) || (num > 1000));
    }

    public static boolean hasSameLastDigit(int x, int y, int z) {
        if (!isValid(x) || !isValid(y) || !isValid(z)) return false;
        int x1 = x % 10;
        int y1 = y % 10;
        int z1 = z % 10;

        return x1 == y1 || x1 == z1 || y1 == z1;
    }
}
