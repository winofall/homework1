public class hw3 {
    public static boolean isprime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
        }
    public static void main(String[] args) {
        int countprimes = 0;
        for (int i = 2; i <= 20000; i++) {
            if (isprime(i)) {
                System.out.print(i + " ");
                countprimes++;
                if (countprimes % 5 == 0) {
                    System.out.println();
                }
            }
        }
    }
}
