public class FirstAndLastSum {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(9999));
    }

    public static int sumFirstAndLastDigit(int number){
        if (number < 0) return -1;

        if (number <10) return 2*number;

        int sum =  number % 10;
        number /= 10;

        while ((number/10)>0){
            number /= 10;
        }

        sum += number;
        return sum;
    }
}
