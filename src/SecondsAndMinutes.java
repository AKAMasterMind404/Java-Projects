public class SecondsAndMinutes {
    private static final String INVALID_VALUE = "Invalid Value";

    public static void main(String[] args) {
        String ans = getDurationString(3909L);
        System.out.println(ans);
    }

    public static String getDurationString(long minutes, long seconds) {
        if (minutes < 0 || seconds < 0 || seconds > 59) {
            return INVALID_VALUE;
        }

        long hours = minutes / 60;
        minutes = minutes % 60;

        String _hours = (hours < 10 ? "0" : "") + hours;
        String _minutes = (minutes < 10 ? "0" : "") + minutes;
        String _seconds = (seconds < 10 ? "0" : "") + seconds;

        return _hours + "h " + _minutes + "m " + _seconds + "s";
    }

    public static String getDurationString(long seconds) {
        if (seconds < 0) {
            return INVALID_VALUE;
        }

        return getDurationString(seconds / 60, seconds % 60);
    }
}
