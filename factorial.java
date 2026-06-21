import java.math.BigInteger;
import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        if (!sc.hasNextInt()) {
            System.out.println("Invalid input");
            return;
        }
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers");
            return;
        }
        System.out.println(n + "! = " + factorialBig(n));
    }

    private static BigInteger factorialBig(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}
