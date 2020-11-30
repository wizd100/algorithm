package boj;

import java.util.Scanner;

public class P1085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();

        int wMin = w - x < x ? w - x : x;
        int hMin = h - y < y ? h - y : y;

        System.out.printf("%d", wMin < hMin ? wMin : hMin);
    }
}
