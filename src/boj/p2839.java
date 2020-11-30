package boj;

import java.util.Scanner;

public class p2839 {
    public static void main(String[] args) {
        int n;
        int temp;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        //5로만 나눠지는 값
        if (n % 5 == 0) {
            System.out.println(n / 5);
            return;
        }

        //3, 5 둘다 나눠지는 값
        for (int i = n / 5; i >= 1; i--) {
            temp = n - i * 5;
            if (temp % 3 == 0) {
                System.out.printf("%d", i + temp / 3);
                return;
            }
        }

        //3으로만 나눠지는 값, 없으면 -1
        if (n % 3 == 0) {
            System.out.println(n / 3);
        } else {
            System.out.println(-1);
        }
    }
}
