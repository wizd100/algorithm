package boj;

import java.util.Scanner;

public class P3052 {
    public static void main(String[] args) {
        //solution1();
        solution2();
    }

    public static void solution1() {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];
        int[] r = new int[42];
        int count = 0;

        for (int i = 0; i < 10; i++) {
            num[i] = sc.nextInt();
            r[num[i] % 42]++;
        }

        for (int i = 0; i < r.length; i++) {
            if (r[i] > 0) {
                count++;
            }
        }

        System.out.println(count);
    }

    public static void solution2() {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];
        int[] r = new int[42];
        int count = 0;

        for (int i = 0; i < 10; i++) {
            num[i] = sc.nextInt();

            r[num[i] % 42]++;
        }

        for (int i = 0; i < r.length; i++) {
            if (r[i] > 0) {
                count++;
            }
        }

        System.out.println(count);
    }
}
