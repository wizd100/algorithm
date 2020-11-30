package boj;

import java.util.Scanner;

public class P1152 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str1 = scanner.nextLine();
        str1 = str1.trim();

        if (str1.equals("")) {
            System.out.println(0);
        } else {
            String[] arr = str1.split(" ");
            System.out.println(arr.length);
        }

    }
}
