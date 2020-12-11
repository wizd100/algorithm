package boj;

import java.util.Scanner;

public class P10250 {
    public static void main(String[] args) {
        //solution1();
        solution2();
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

    public static void solution1() {
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

    public static void solution2() {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int H = sc.nextInt();
            int W = sc.nextInt();
            int N = sc.nextInt();

            int roomNumber = 101;

            for (int j = 0; j < N; j++) {
                //System.out.printf("%d\n", roomNumber);

                if (roomNumber / (H * 100) == 1) {
                    roomNumber = (roomNumber % 100) + 101;
                    continue;
                }

                roomNumber += 100;
            }

            System.out.println(roomNumber);
        }
    }
}
