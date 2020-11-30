package boj;

import java.util.Scanner;

public class P10250 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int H;
        int W;
        int N;

        for (int i = 0; i < T; i++) {
            H = sc.nextInt();
            W = sc.nextInt();
            N = sc.nextInt();

            System.out.println(searchRoom(H, W, N));
        }
    }

    public static int searchRoom(int H, int W, int N) {
        int count = 1;

        for (int k = 1; k <= W; k++) {
            for (int j = 1; j <= H; j++) {
                if (N == count) {
                    return Integer.parseInt(String.format("%d%02d", j, k));
                }
                count++;
            }
        }

        return 0;
    }
}
