public class poundsToKilograms {

    public static boolean hasTeen(int x, int y, int z) {
        boolean b1 = x <= 19 && x >= 13;
        boolean b2 = y <= 19 && y >= 13;
        boolean b3 = z <= 19 && z >= 13;
        return b1 || b2 || b3;
    }

    public static boolean isTeen(int x) {
        return x <= 19 && x >= 13;
    }

    public static void main(String[] args) {

    }
}
