public class NumberOfDaysInMonth {
    public static void main(String[] args) {
    }

    public static boolean isLeapYear(int year) {
        if (year <= 0 || year >= 10000) {
            return false;
        }

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    public static int getDaysInMonth(int month, int year) {
        if (year <= 0 || year >= 10000 || month < 1 || month > 12) {
            return -1;
        }

        int days = -1;

        switch (month) {
            case 1: case 3:
            case 5: case 7:
            case 8: case 10:
            case 12:
                days = 31;
                break;
            case 2:
                boolean leap = isLeapYear(year);
                days = leap ? 29 : 28;
                break;
            default:
                days = 30;
                break;
        }

        return days;
    }


}
