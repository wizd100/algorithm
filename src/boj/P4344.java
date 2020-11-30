package boj;

import java.util.Scanner;

public class P4344 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int C = sc.nextInt();

        for (int i = 0; i < C; i++) {
            int N = sc.nextInt();
            double sum = 0;
            double avg = 0;
            double count = 0;
            double[] score = new double[N];

            for (int j = 0; j < N; j++) {
                score[j] = sc.nextInt();
                sum += score[j];
            }

            avg = sum / N;

            for (int j = 0; j < N; j++) {
                if (score[j] > avg) {
                    count++;
                }
            }

            System.out.printf("%.3f%%\n", count / N * 100);
        }
    }
}
