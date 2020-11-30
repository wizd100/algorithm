package boj;

import java.util.Scanner;

public class P2798 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] card = new int[N];

        for (int i = 0; i < N; i++) {
            card[i] = sc.nextInt();
        }

        System.out.println(blackJack(card, M));
    }

    public static int blackJack(int[] card, int M) {
        int max = M;

        for (int i = 0; i < card.length - 2; i++) {
            for (int j = i + 1; j < card.length - 1; j++) {
                for (int k = j + 1; k < card.length; k++) {
                    int sum = card[i] + card[j] + card[k];

                    if (M == sum) {
                        return sum;
                    }

                    if (M < sum) {
                        continue;
                    }

                    if (max > M - sum) {
                        max = M - sum;
                    }
                }
            }
        }

        return M - max;
    }
}
