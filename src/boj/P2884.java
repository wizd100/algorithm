package boj;

import java.util.Scanner;

public class P2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();

        m = m - 45;

        if (m >= 0) {
            System.out.printf("%d %d", h, m);
            return;
        }

        h = h - 1;
        m = m + 60;

        if (h >= 0) {
            System.out.printf("%d %d", h, m);
            return;
        }

        h = h + 24;
        System.out.printf("%d %d", h, m);
    }
}
