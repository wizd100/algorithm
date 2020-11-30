package boj;

import java.util.Scanner;

public class P2292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int start = 2;
        int count = 1;
        int N = sc.nextInt();

        if (N == 1) {
            System.out.println(1);
            return;
        }

        // 시작값 = 6(n - 1) + 6(n - 1) ...
        while (start <= N) {
            start += 6 * count;
            count++;
        }

        System.out.println(count);
    }
}
