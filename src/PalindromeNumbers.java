public class PalindromeNumbers {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }

    public static boolean isPalindrome(int number) {
        number = Math.abs(number);
        int num2 = number;
        int length = 0;

        while (num2 > 0) {
            length += 1;
            num2 /= 10;
        }

        num2 = number;
        int r = 0;

        while (num2 > 0) {
            r += (num2 % 10)*(int)(Math.pow(10, length - 1));
            num2 /= 10;
            length -= 1;
        }

        return r == number;
    }
}
