public class DayOfWeekSwitch {
    public static void main(String[] args) {
        for (int i = -1; i < 7; i++) {
            printDayOfTheWeek(i);
        }
    }

    public static void printDayOfTheWeek(int number) {
        if (number < 0 || number > 6) {
            System.out.println("Invalid Day of the Week");
            return;
        }

        String day = "";

        switch (number) {
            case 0:
                day = "Sunday";
                break;
            case 1:
                day = "Monday";
                break;
            case 2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wednesday";
                break;
            case 4:
                day = "Thursday";
                break;
            case 5:
                day = "Friday";
                break;
            case 6:
                day = "Saturday";
                break;
        }

        System.out.println(day);
    }
}
