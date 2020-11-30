package boj;

import java.util.Scanner;

public class P1193 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int count = 1;
        int i = 1;
        int j = 1;
        boolean downSearch = false;
        boolean upSearch = false;

        while (x != count) {
            System.out.printf("%d/%d : %d\n", i, j, count);

            if (downSearch) {
                if (j - 1 == 0) {
                    downSearch = false;
                    continue;
                } else {
                    i += 1;
                    j -= 1;
                    count++;
                    continue;
                }
            }

            if (upSearch) {
                if (i - 1 == 0) {
                    upSearch = false;
                    continue;
                } else {
                    i -= 1;
                    j += 1;
                    count++;
                    continue;
                }
            }

            if (i == 1) {
                j += 1;
                count++;
                downSearch = true;
                continue;
            } else if (j == 1) {
                i += 1;
                count++;
                upSearch = true;
                continue;
            }

        }

        System.out.printf("R : %d/%d : %d\n", i, j, count);
    }
}
