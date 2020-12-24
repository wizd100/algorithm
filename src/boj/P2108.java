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
        int countMode = 0;
        int countMax = 0;
        ArrayList<Integer> numMode = new ArrayList<>();

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
                    countMode = 0;
                    numMode.clear();
                }
                temp = countPlusNum[i];
                countMax = i;
                countMode++;
                numMode.add(i);
            }

            if (temp <= countMinusNum[i]) {
                if (temp < countMinusNum[i]) {
                    countMode = 0;
                    numMode.clear();
                }
                temp = countMinusNum[i];
                countMax = i * -1;
                countMode++;
                numMode.add(i * -1);
            }
        }

        if (countMode == 1) {
            System.out.println(countMax);
        } else if (countMode == N) {
            System.out.println(num[1]);
        } else {
            Collections.sort(numMode);
            System.out.println(numMode.get(1));
        }

        //범위
        if (N == 1) {
            System.out.println(0);
            return;
        }

        System.out.println(num[N - 1] - num[0]);
    }
}
