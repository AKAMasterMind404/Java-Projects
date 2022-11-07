public class NumberToWords {
    public static void main(String[] args) {
        numberToWords(1000);
        System.out.println(reverse(-121));
        System.out.println(getDigitCount(-121));
    }

    public static int reverse(int number) {
        boolean isNegative = number < 0;
        if (isNegative) {
            number *= -1;
        }

        int length = getDigitCount(number);
        int r = 0;

        while (number > 0) {
            r += (number % 10) * (int) (Math.pow(10, length - 1));
            number /= 10;
            length -= 1;
        }

        return r * (isNegative ? -1 : 1);
    }

    public static int getDigitCount(int number) {
        if (number < 0) return -1;
        if (number < 10) return 1;
        int c = 0;
        while (number > 0) {
            c += 1;
            number /= 10;
        }
        return c;
    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
            return;
        }

        if (number == 0) {
            System.out.print("Zero");
            return;
        }

        int l = 0;
        int _n = number;
        while (_n > 0) {
            l += 1;
            _n /= 10;
        }

        int _max = (int) Math.pow(10, l - 1);
        while (l > 0) {
            number = Math.abs(number);
            int num = number / _max;
            String numWord = "";

            switch (num) {
                case 1:
                    numWord = "One";
                    break;
                case 2:
                    numWord = "Two";
                    break;
                case 3:
                    numWord = "Three";
                    break;
                case 4:
                    numWord = "Four";
                    break;
                case 5:
                    numWord = "Five";
                    break;
                case 6:
                    numWord = "Six";
                    break;
                case 7:
                    numWord = "Seven";
                    break;
                case 8:
                    numWord = "Eight";
                    break;
                case 9:
                    numWord = "Nine";
                    break;
                default:
                    numWord = "Zero";
                    break;
            }
            System.out.print(numWord + (l > 1 ? " " : ""));
            number = number % _max;
            _max /= 10;
            l -= 1;
        }
    }
}
