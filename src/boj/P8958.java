package boj;

import java.util.Scanner;

public class P8958 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        String[] str = new String[Integer.parseInt(n)];

        for (int i = 0; i < Integer.parseInt(n); i++) {
            str[i] = scanner.nextLine();
        }

        for (int i = 0; i < str.length; i++) {
            int sum = 0;
            int count = 0;

            for (int j = 0; j < str[i].length(); j++) {
                if (str[i].charAt(j) == 'O') {
                    ++count;
                    sum += count;
                } else if (str[i].charAt(j) == 'X') {
                    count = 0;
                    sum += count;
                }
            }

            System.out.println(sum);
        }

    }
}
