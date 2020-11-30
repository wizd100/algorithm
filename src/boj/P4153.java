package boj;

import java.util.Arrays;
import java.util.Scanner;

public class P4153 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1;
        int n2;
        int n3;
        int arr[] = new int[3];

        while (true) {
            n1 = sc.nextInt();
            n2 = sc.nextInt();
            n3 = sc.nextInt();

            if (n1 == 0 && n2 == 0 && n3 == 0) {
                break;
            }

            arr[0] = n1;
            arr[1] = n2;
            arr[2] = n3;

            Arrays.sort(arr);

            if ((arr[0] * arr[0] + arr[1] * arr[1] == arr[2] * arr[2])) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
        }
    }
}
