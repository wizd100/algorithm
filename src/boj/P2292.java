package boj;

import java.util.Scanner;

public class P2292 {
    public static void main(String[] args) {
        //solution1();
        solution2();
    }

    public static void solution1() {
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

    public static void solution2() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int start = 2;
        int plus = 6;
        int end = start + plus - 1;
        int count = 2;

        if (N == 1) {
            System.out.println(1);
            return;
        }

        while (true) {
            System.out.printf("%d ~ %d\n", start, end);
            if (N >= start && N <= end) {
                System.out.println(count);
                break;
            }
            start = start + plus;
            plus += 6;
            end = start + plus - 1;
            count++;
        }
    }
}
