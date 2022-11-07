public class PlayingCat {
    private static final String INVALID_VALUE = "Invalid Value";

    public static void main(String[] args) {
    }

    public static boolean isCatPlaying(boolean summer, int temperature) {
        return temperature >= 25 && temperature <= (summer ? 45 : 35);
    }
}
