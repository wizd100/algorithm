package boj;

import java.util.Scanner;

public class p2447 {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        int[][] arr;
        arr = new int[n][n];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                draw(i, j, n);
            }
            System.out.println();
        }
    }

    public static void draw(int i, int j, int size) {
        if (i % 3 == 1 && j % 3 == 1) {
            System.out.print(" ");
            return;
        }

        i /= 3;
        j /= 3;
        size /= 3;
        draw(i, j, size);

        if (i / size == 1 && j / size == 1) {
            System.out.print(" ");
            return;
        }
        System.out.print("*");
    }

    public static void star(int n) {
        if (n <= 0) {
            return;
        }
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();
        n--;
        star(n);
    }
}
