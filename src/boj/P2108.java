package boj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class P2108 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] num = new int[N];
        int total = 0;
        int[] countPlusNum = new int[4001];
        int[] countMinusNum = new int[4001];
        int temp = 0;
        ArrayList<Integer> arrModeNum = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            num[i] = sc.nextInt();

            total += num[i];

            if (num[i] >= 0) {
                countPlusNum[num[i]]++;
            } else {
                countMinusNum[num[i] * -1]++;
            }
        }

        Arrays.sort(num);

        //산술 평균
        System.out.println(Math.round((double)total / (double)N));

        //중앙값
        System.out.println(num[N / 2]);

        //최빈값
        for (int i = 0; i < countPlusNum.length; i++) {
            if (countPlusNum[i] == 0 && countMinusNum[i] == 0) {
                continue;
            }

            if (temp <= countPlusNum[i]) {
                if (temp < countPlusNum[i]) {
                    arrModeNum.clear();
                }
                temp = countPlusNum[i];
                arrModeNum.add(i);
            }

            if (temp <= countMinusNum[i]) {
                if (temp < countMinusNum[i]) {
                    arrModeNum.clear();
                }
                temp = countMinusNum[i];
                arrModeNum.add(i * -1);
            }
        }

        if (arrModeNum.size() == 1) {
            System.out.println(arrModeNum.get(0));
        } else if (arrModeNum.size() == N) {
            System.out.println(num[1]);
        } else {
            Collections.sort(arrModeNum);
            System.out.println(arrModeNum.get(1));
        }

        //범위
        if (N == 1) {
            System.out.println(0);
            return;
        }

        System.out.println(num[N - 1] - num[0]);
    }
}
