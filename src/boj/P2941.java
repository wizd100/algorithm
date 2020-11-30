package boj;

import java.util.Scanner;

public class P2941 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (i < str.length() - 2) {
                if (str.charAt(i) == 'd'
                        && str.charAt(i + 1) == 'z'
                        && str.charAt(i + 2) == '=') {
                    count++;
                    i += 2;
                    continue;
                }
            }
            if (i < str.length() - 1) {
                if (str.charAt(i) == 'c' && str.charAt(i + 1) == '=') {
                    count++;
                    i += 1;
                    continue;
                }
                if (str.charAt(i) == 'c' && str.charAt(i + 1) == '-') {
                    count++;
                    i += 1;
                    continue;
                }
                if (str.charAt(i) == 'd' && str.charAt(i + 1) == '-') {
                    count++;
                    i += 1;
                    continue;
                }
                if (str.charAt(i) == 'l' && str.charAt(i + 1) == 'j') {
                    count++;
                    i += 1;
                    continue;
                }
                if (str.charAt(i) == 'n' && str.charAt(i + 1) == 'j') {
                    count++;
                    i += 1;
                    continue;
                }
                if (str.charAt(i) == 's' && str.charAt(i + 1) == '=') {
                    count++;
                    i += 1;
                    continue;
                }
                if (str.charAt(i) == 'z' && str.charAt(i + 1) == '=') {
                    count++;
                    i += 1;
                    continue;
                }
            }

            count++;
        }

        System.out.println(count);
    }
}
