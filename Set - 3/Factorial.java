import java.util.Scanner;
import java.lang.IllegalArgumentException;

public class Factorial {
    public static void main(String agrs[]) throws IllegalArgumentException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();
        if (n < 0) {
            throw new IllegalArgumentException("Value of x must be positive");
        }
        long arr[] = new long[n + 1];
        arr[0] = 1;
        for (int i = 1; i <= n; ++i) {
            if (i * arr[i - 1] >= Integer.MAX_VALUE) {
                throw new IllegalArgumentException("Result will overflow");
            }
            arr[i] = i * arr[i - 1];
        }
        System.out.println("Fatorial of " + n + " is = " + arr[n]);

    }
}
