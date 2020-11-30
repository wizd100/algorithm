package boj;

import java.util.Scanner;

public class P2231 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int generators = 0;

        //1부터 N - 1까지 생성자 계산
        for (int i = 1; i < N; i++) {
            int sum = i;
            int temp = i;

            while (temp != 0) {
                sum += temp % 10;
                temp /= 10;
            }

            if (sum == N) {
                generators = i;
                break;
            }
        }

        System.out.println(generators);
    }
}
