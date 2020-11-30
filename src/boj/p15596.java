package boj;

import java.util.Scanner;

public class p15596 {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
    }

    public static long sum(int[] a) {
        long answer = 0;

        for (int i = 0; i < a.length; i++) {
            answer += a[i];
        }

        return answer;
    }
}
