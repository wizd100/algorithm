package boj;

import java.util.Scanner;

public class P2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[9];
        int max = 0;
        int maxIndex = 0;

        for (int i = 0; i < 9; i++) {
            num[i] = sc.nextInt();

            if (max < num[i]) {
                max = num[i];
                maxIndex = i;
            }
        }

        System.out.println(max);
        System.out.println(maxIndex + 1);
    }
}
