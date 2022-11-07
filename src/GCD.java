public class GCD {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(18, 12));
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }

        int s = Math.min(first, second);
        while (s > 0) {
            if (first % s == 0 && second % s == 0) {
                return s;
            }
            s -= 1;
        }
        return 1;
    }
}
