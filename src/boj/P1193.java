package boj;

import java.util.Scanner;

public class P1193 {
    public static void main(String[] args) {
        //solution1();
        solution2();
    }

    public static void solution1() {
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

    public static void solution2() {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int a = 1;
        int b = 2;
        int count = 2;
        boolean up = false;
        boolean down = true;

        if (X == 1) {
            System.out.println("1/1");
            return;
        }

        while (X != count) {
            //System.out.printf("%d : %d/%d\n", count, a, b);
            //좌측 하단으로 이동
            if (down) {
                //맨 좌측 도달했을때 밑으로 이동
                if (b == 1) {
                    a++;
                    up = true;
                    down = false;
                    count++;
                    continue;
                }
                a++;
                b--;
                count++;
                continue;
            }

            if (up) {
                //맨위로 도달했을때 오른쪽으로 이동
                if (a == 1) {
                    b++;
                    count++;
                    up = false;
                    down = true;
                    continue;
                }
                a--;
                b++;
                count++;
                continue;
            }
        }

        System.out.printf("%d/%d", a, b);
    }
}
