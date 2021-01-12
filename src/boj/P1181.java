package boj;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class P1181 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine(); //라인 개행 처리
        String[] arr = new String[N];
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextLine();
        }

        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                //단어 길이가 같은 경우 사전 순으로 정렬
                if (o1.length() == o2.length()) {
                    return o1.compareTo(o2);
                }

                //단어 길이로 정렬
                return o1.length() - o2.length();
            }
        });

        sb.append(arr[0] + "\n");

        for (int i = 1; i < N; i++) {
            //중복 단어 제거
            if (arr[i].equals(arr[i - 1])) {
                continue;
            }

            sb.append(arr[i] + "\n");
        }

        System.out.println(sb);
    }
}
