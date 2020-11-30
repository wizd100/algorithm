package boj;

import java.util.Scanner;

public class P2908 {
    public static void main(String[] args) {
        //solution1();
        solution2();
    }

    public static void solution1() {
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

    public static void solution2() {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int reverse1 = Integer.parseInt(sb1.append(n1).reverse().toString());
        int reverse2 = Integer.parseInt(sb2.append(n2).reverse().toString());

        if (reverse1 > reverse2) {
            System.out.println(reverse1);
        } else {
            System.out.println(reverse2);
        }
    }
}
