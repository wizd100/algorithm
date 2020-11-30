package boj;

import java.util.Scanner;

public class P10870 {
    static int count = 0;

    static int fibonacci(int x, int y, int n) {
        if (count >= n) {
            return x;
        }
        count++;
        return fibonacci(y, x + y, n);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        System.out.println(fibonacci(0, 1, n));
    }
}
