package boj;

import java.util.Scanner;

public class P10817 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] n = new int[3];
        int max;
        int min;
        int mid;

        for (int i = 0; i < n.length; i++) {
            n[i] = scanner.nextInt();
        }
        max = n[0];
        min = n[0];
        mid = n[0];


        for (int i = 0; i < n.length; i++) {
            for (int j = i + 1; j < n.length; j++) {
                //System.out.println(n[i] + " : " + n[j]);
                /*if (n[i]) {

                }*/
            }
        }

    }
}
