package boj;

import java.util.Scanner;

public class P2884 {
    public static void main(String[] args) {
        //solution1();
        solution2();
    }

    public static void solution1() {
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

    public static void solution2() {
        Scanner sc = new Scanner(System.in);
        int earlyMin = 45;
        int H = sc.nextInt();
        int M = sc.nextInt();

        M -= earlyMin;

        if (M < 0) {
            H--;
            M += 60;
        }

        if (H < 0) {
            H = 23;
        }

        System.out.printf("%d %d", H, M);

    }
}
