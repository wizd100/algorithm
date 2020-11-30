package boj;

import java.util.Scanner;

public class p1712 {
    public static void main(String[] args) {
        long a;
        long b;
        long c;
        long d;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextLong();
        b = scanner.nextLong();
        c = scanner.nextLong();

        if (b >= c) {
            System.out.print(-1);
        } else {
            d = a / (c - b) + 1;
            System.out.print(d);
        }
    }
}