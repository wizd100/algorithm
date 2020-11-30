package boj;

import java.util.Arrays;
import java.util.Scanner;

public class P10809 {
    public static void main(String[] args) {
        // a ~ z -> 97 ~ 122
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int[] alphabet = new int[26];
        Arrays.fill(alphabet, -1);

        for (int i = 0; i < str.length(); i++) {
            if(alphabet[(int)str.charAt(i) - 97] == -1) {
                alphabet[(int)str.charAt(i) - 97] = i;
            }
            //System.out.printf("%d ", (int)str.charAt(i) - 97);
        }

        for (int i = 0; i < alphabet.length; i++) {
            System.out.printf("%d ", alphabet[i]);
        }
    }
}
