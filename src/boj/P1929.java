package boj;

import java.util.Scanner;

public class P1929 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int M = sc.nextInt();
        int N = sc.nextInt();
        int[] number = new int[N + 1];

        number[1] = 1;
        for (int i = 2; i * i <= N; i++) {
            if (number[i] > 0) {
                continue;
            }

            for (int j = i + i; j <= N; j += i) {
                number[j]++;
            }
        }

        for (int i = M; i <= N; i++) {
            if (number[i] == 0) {
                sb.append(i + "\n");
            }
        }

        System.out.println(sb);
    }
}
