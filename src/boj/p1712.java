package boj;

import java.util.Scanner;

public class p1712 {
    public static void main(String[] args) {
        //solution1();
        solution2();
    }

    public static void solution1() {
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

    public static void solution2() {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        long C = sc.nextLong();

        if (B >= C) {
            System.out.println(-1);
            return;
        }

        long breakEvenPoint = A / (C - B) + 1;

        System.out.println(breakEvenPoint);
    }
}