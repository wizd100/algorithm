package boj;

import java.util.Scanner;

public class P1002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int r1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            int r2 = sc.nextInt();

            //무한대
            if (x1 == x2 && y1 == y2 && r1 == r2) {
                System.out.println(-1);
                continue;
            }

            double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

            //0
            if (distance > r1 + r2) {
                System.out.println(0);
                continue;
            }

            if (distance < Math.abs(r1 - r2)) {
                System.out.println(0);
                continue;
            }

            //1
            if (distance == r1 + r2) {
                System.out.println(1);
                continue;
            }

            if (distance == Math.abs(r1 - r2)) {
                System.out.println(1);
                continue;
            }

            //2
            System.out.println(2);
        }
    }
}
