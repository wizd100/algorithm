package boj;

import java.util.Scanner;

public class P2775 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] k = new int[T];
        int[] n = new int[T];
        int[][] apt = new int[15][14];

        for (int i = 0; i < T; i++) {
            k[i] = sc.nextInt();
            n[i] = sc.nextInt();
        }

        for (int i = 0; i < apt.length; i++) {
            for (int j = 0; j < apt[i].length; j++) {
                if (i == 0) {
                    apt[i][j] = j + 1;
                    continue;
                } else if (j == 0) {
                    apt[i][j] = 1;
                    continue;
                } else if (j == 1) {
                    apt[i][j] = i + 2;
                    continue;
                }

                //apt[i][j] = apt[i - 1][j] + apt[i][j - 1];
            }
        }

        for (int i = 0; i < apt.length; i++) {
            for (int j = 0; j < apt[i].length; j++) {
                System.out.printf("%d ", apt[i][j]);
            }
            System.out.println();
        }

        for (int i = 0; i < T; i++) {
            System.out.println(apt[k[i]][n[i] - 1]);
        }
    }
}
