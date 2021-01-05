package boj;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class P11650 {
    public static void main(String[] args) {
        solution2();
    }

    public static void solution1() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] arr = new int[200002][200002];

        for (int i = 0; i < N; i++) {
            arr[sc.nextInt() + 100000][sc.nextInt() + 100000] = 1;
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 0) {
                    continue;
                }
                System.out.printf("%d %d", i, j);
            }
        }
    }

    public static void solution2() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] arr = new int[N][2];
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();

        }

        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] n1, int[] n2) {
                if (n1[0] == n2[0]) {
                    return n1[1] - n2[1];
                } else {
                    return n1[0] - n2[0];
                }
            }
        });

        for (int i = 0; i < N; i++) {
            sb.append(arr[i][0] + " " + arr[i][1] + "\n");
        }

        System.out.println(sb);
    }
}
