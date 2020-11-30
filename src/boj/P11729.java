package boj;

import java.util.Scanner;

//하노이
//println으로 하면 시간초과가 돼서 StringBuilder로 해결
public class P11729 {
    static void move(int n, int x, int y, StringBuilder sb) {
        if (n > 1) {
            move(n - 1, x, 6 - x - y, sb);
        }
        sb.append(x + " " + y + "\n");
        if (n > 1) {
            move(n - 1, 6 - x - y, y, sb);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int N = scanner.nextInt();

        System.out.println((1 << N) - 1);

        move(N, 1, 3, sb);

        System.out.println(sb);
    }
}
