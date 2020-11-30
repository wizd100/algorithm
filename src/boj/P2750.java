package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P2750 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int[] num = new int[N];

        for (int i = 0; i < N; i++) {
            num[i] = Integer.parseInt(br.readLine());
        }

        //bubbleSort(num);
        //quickSort(num, 0, num.length - 1);
        Arrays.sort(num);

        for (int i = 0; i < N; i++) {
            sb.append(num[i] + "\n");
        }
        System.out.println(sb);
    }

    public static void bubbleSort(int[] num) {
        int temp;
        for (int i = 0; i < num.length - 1; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] > num[j]) {
                    temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }
    }

    public static void quickSort(int[] arr, int left, int right) {
        int i;
        int j;
        int pivot;
        int tmp;

        if (left < right) {
            i = left;
            j = right;
            pivot = arr[(left + right) / 2];

            while (i < j) {
                while (arr[j] > pivot) {
                    j--;
                }
                // 이 부분에서 arr[j-1]에 접근해서 익셉션 발생가능함.
                while (i < j && arr[i] < pivot) {
                    i++;
                }

                tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }

            quickSort(arr, left, i - 1);
            quickSort(arr, i + 1, right);
        }
    }
}
