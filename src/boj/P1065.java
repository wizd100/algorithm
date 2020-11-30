package boj;

import java.util.Scanner;

public class P1065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        //한자리, 두자리 수는 모두 한수
        if (N < 100) {
            System.out.println(N);
            return;
        }

        int count = 99;

        for (int i = 100; i <= N; i++) {
            if (generator(i)) {
                count++;
            }
        }

        System.out.println(count);
    }

    public static boolean generator(int n) {
        //둘째자리와 첫째자리를 비교해서 증감값
        int cal = n / 10 % 10 - n % 10;
        int compare = n / 10 % 10;

        //세번재 자리부터 비교
        n /= 100;
        while (n != 0) {
            if (n != compare + cal) {
                return false;
            }
            compare = n;
            n /= 10;
        }

        return true;
    }
}
