package boj;

import java.util.Scanner;

public class P3052 {
    public static void main(String[] args) {
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
