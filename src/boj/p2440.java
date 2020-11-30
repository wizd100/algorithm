package boj;

import java.util.Scanner;

public class p2440 {
    public static void main(String[] args) {
        int inputNum;

        Scanner scanner = new Scanner(System.in);
        inputNum = scanner.nextInt();

        for (int i = 0; i < inputNum; i++) {
            for (int j = 0; j < inputNum - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
