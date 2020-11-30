package boj;

import java.util.Scanner;

public class P4948 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int caseMax = 123456;
        boolean[] number = new boolean[caseMax * 2 + 1];

        number[0] = true;
        number[1] = true;
        for (int i = 2; i * i <= caseMax * 2; i++) {
            if (number[i]) {
                continue;
            }
            for (int j = i + i; j <= caseMax * 2; j += i) {
                number[j] = true;
            }
        }

        while (true) {
            int n = sc.nextInt();
            int count = 0;

            if (n == 0) {
                break;
            }

            for (int i = n + 1; i <= n * 2; i++) {
                if (!number[i]) {
                    count++;
                }
            }

            System.out.println(count);
        }
    }
}
