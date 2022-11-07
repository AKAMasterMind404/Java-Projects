public class LargestPrime {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(0));
        System.out.println(getLargestPrime(45));
        System.out.println(getLargestPrime(-1));
        System.out.println(getLargestPrime(16));
    }

    public static int getLargestPrime(int number){
        if (number <= 1) return -1;

        for (int i = 1 + (number/2); i > 1 ; i--){
            if (number % i == 0){
                boolean isPrime = true;
                for (int j = 1+(i/2); j > 1; j--){
                    if (i%j == 0 && i!=j){
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime)return i;
            }
        }

        return number;
    }
}
