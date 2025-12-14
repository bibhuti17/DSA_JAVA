public class Prime_Number {
    public static void main(String[] args) {
        System.out.println(isPrime(2));

    }
    static boolean isPrime(int n) {
        if (n < 2) return false;
        int c = 2;
        while (c * c <= n) {
            if (n % c == 0) {
                return false;
            }
            c++;
        }
        return (c * c > n);
    }
}
