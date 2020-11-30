package boj;

import java.util.Scanner;

public class P2869 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double V = sc.nextDouble();

        double days = (V - B) / (A - B);
        System.out.println((int)Math.ceil(days));
    }
}
