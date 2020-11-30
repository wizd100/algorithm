package boj;

import java.util.Scanner;

public class P10773 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int[] stack = new int[k];
        int ptr = 0;
        int sum = 0;

        for (int i = 0; i < k; i++) {
            int n = scanner.nextInt();

            if (n == 0) {
                stack[--ptr] = 0;

            } else {
                stack[ptr++] = n;
            }
        }

        for (int i = 0; i < ptr; i++) {
            sum += stack[i];
        }

        System.out.println(sum);
    }
}
