package boj;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class P1427 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int length = (int)(Math.log10(N) + 1);
        Integer[] arr = new Integer[length];
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < length; i++) {
            arr[i] = N % 10;
            N /= 10;
        }

        Arrays.sort(arr, Collections.reverseOrder());

        for (int i = 0; i < length; i++) {
            sb.append(arr[i]);
        }

        System.out.println(sb);
    }
}
