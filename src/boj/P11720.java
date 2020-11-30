package boj;

import java.util.Scanner;

//integer 형으로 풀려고 하니깐 런타임 에러 (integer 범위에 넘어가는 숫자가 들어와서 오류남)
public class P11720 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long n1 = scanner.nextLong();
        String n2 = scanner.next();

        long sum = 0;

        for (int i = 0; i < n1; i++) {
            sum += n2.charAt(i) - '0';
        }

        System.out.println(sum);

        //System.out.println(solution(1, 1)); //1
        //System.out.println(solution(5, 54321)); //15
        //System.out.println(solution(25, 7000000000000000000000000L)); //15
        //System.out.println(solution(11, 10987654321L)); //15

    }
}
