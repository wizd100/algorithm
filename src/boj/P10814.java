package boj;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class P10814 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        String[][] arr = new String[N][2];
        String[] temp = new String[2];
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            temp = sc.nextLine().split(" ");
            arr[i][0] = temp[0];
            arr[i][1] = temp[1];
        }

        Arrays.sort(arr, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                //나이순
                return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
            }
        });

        for (int i = 0; i < N; i++) {
            sb.append(arr[i][0] + " " + arr[i][1] + "\n");
        }

        System.out.println(sb);
    }
}
