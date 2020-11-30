package boj;

import java.util.Scanner;

public class P7568 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] x = new int[N];
        int[] y = new int[N];
        int[] grade = new int[N];

        for (int i = 0; i < N; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j < N; j++) {
                if (x[i] > x[j] && y[i] > y[j]) {
                    grade[j]++;
                    continue;
                }
                if (x[i] < x[j] && y[i] < y[j]) {
                    grade[i]++;
                    continue;
                }
            }
        }

        for (int i = 0; i < N; i++) {
            System.out.printf("%d ", grade[i] + 1);
        }
    }
}
