import java.math.BigInteger;

public class Fibonacci {

    public static BigInteger[] fibonacci(int n) {
        BigInteger[] sequence = new BigInteger[n];
        BigInteger a = BigInteger.ZERO;
        BigInteger b = BigInteger.ONE;
        for (int i = 0; i < n; i++) {
            sequence[i] = a;
            BigInteger next = a.add(b);
            a = b;
            b = next;
        }
        return sequence;
    }

    public static void main(String[] args) {
        BigInteger[] numbers = fibonacci(100);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println((i + 1) + ": " + numbers[i]);
        }
    }
}
