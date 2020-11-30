package boj;

import java.util.Scanner;

public class P1978 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;

        for (int i = 0; i < N; i++) {
            int number = sc.nextInt();

            if (number < 2) {
                continue;
            }

            if (isPrime2(number)) {
                count++;
            }
        }

        System.out.println(count);
    }

    public static boolean isPrime(int n) {
        int count = 1;

        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }

            if (count > 2) {
                return false;
            }
        }

        if (count == 2) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isPrime2(int n) {
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
