package boj;

import java.util.Scanner;

public class P11721 {
    public static void main(String[] args) {
        /*String str1 = "OneTwoThreeFourFiveSixSevenEightNineTen";
        System.out.println(str1.substring(0, 10));
        System.out.println(str1.substring(10, 20));*/

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        for (int i = 0; i < str.length(); i += 10) {
            if (i + 10 >= str.length()) {
                System.out.println(str.substring(i, str.length()));
            } else {
                System.out.println(str.substring(i, i + 10));
            }
        }
    }
}
