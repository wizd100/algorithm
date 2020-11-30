package boj;

import java.util.Scanner;

public class p2439 {
    public static void main(String[] args) {
        int inputNum;

        Scanner scanner = new Scanner(System.in);
        inputNum = scanner.nextInt();

        for (int i = 1; i <= inputNum; i++) {
            for (int j = 1; j <= inputNum - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
