public class FlourPack {
    public static void main(String[] args) {
        System.out.println(canPack(1, 0, 4));
        System.out.println(canPack(1, 0, 5));
        System.out.println(canPack(0, 5, 4));
        System.out.println(canPack(2, 2, 11));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) return false;

        for (int i = 0; i <= bigCount; i++) {
            int rem = goal - (5 * i);
            if (rem >= 0 && smallCount >= rem) {
                return true;
            }
        }
        return false;
    }
}
