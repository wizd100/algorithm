package boj;

import java.math.BigInteger;
import java.util.Scanner;

public class P10757 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        BigInteger sum;

        BigInteger bigA = new BigInteger(A);
        BigInteger bigB = new BigInteger(B);

        sum = bigA.add(bigB);

        System.out.println(sum);
    }
}
