package boj;

import java.util.Scanner;

public class P2908 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int reverseA = 0;
        int reverseB = 0;

        for (int i = 0; i < 3; i++) {
            reverseA += a % 10 * (int)Math.pow(10, 2 - i);
            a /= 10;
            reverseB += b % 10 * (int)Math.pow(10, 2 - i);
            b /= 10;
        }

        if (reverseA > reverseB) {
            System.out.println(reverseA);
        } else {
            System.out.println(reverseB);
        }

    }
}
