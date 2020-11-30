package boj;

import java.util.Scanner;

public class P2581 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        boolean[] number = new boolean[N + 1];
        int sum = 0;
        int min = 0;
        int count = 0;

        //1 ~ N 값까지 소수를 구하는 배열이며 false값이 소수
        number[1] = true;
        for (int i = 2; i <= N; i++) {
            if (number[i]) {
                continue;
            }
            for (int j = i + i; j <= N; j += i) {
                number[j] = true;
            }
        }

        for (int i = M; i <= N; i++) {
            if (!number[i]) {
                sum += i;
                if (count == 0) {
                    min = i;
                    count++;
                }
                //System.out.println(i);
            }
        }

        if (sum == 0) {
            System.out.println(-1);
            return;
        }

        System.out.println(sum);
        System.out.println(min);
    }
}
