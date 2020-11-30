package boj;

import java.util.Scanner;

public class P1110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int num = N;
        int count = 0;

        while (true) {
            if (count != 0 && N == num) {
                break;
            }

            //1글자 일때
            if (num < 10) {
                num = num * 11;
                count++;
                continue;
            }

            int sum = num / 10 + num % 10;
            num = num % 10 * 10 + sum % 10;
            count++;
        }

        System.out.println(count);
    }
}
