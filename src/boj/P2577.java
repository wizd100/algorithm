package boj;

import java.util.Scanner;

public class P2577 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long sum = 0;
        String convertSum;
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long c = scanner.nextLong();

        sum = a * b * c;
        convertSum = Long.toString(sum);

        for (int i = 0; i <= 9; i++) {
            int count = 0;

            for (int j = 0; j < convertSum.length(); j++) {
                if (Character.getNumericValue(convertSum.charAt(j)) == i) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
