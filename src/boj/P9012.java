package boj;

import java.util.Scanner;

public class P9012 {
    //vps -> 스택의 총 수는 짝수가 되여야 함
    //맨 마지막 값은 무조건 )
    //( , ) 값이 똑같이 있어야함 = 총 수의 절반
    //맨뒤 ) 값과 그 앞부터 ( 값을 탐색한 다음 지움 그리고 앞으로 민다
    //)( -> 닫히지 않았음으로 NO
    //

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        scanner.nextLine();

        String s;
        String[] arr;
        int ptr;

        for (int i = 0; i < T; i++) {
            s = scanner.nextLine();
            arr = s.split("");
            ptr = arr.length;

            //짝수가 아니면 vps가 아님
            if (ptr % 2 != 0) {
                System.out.println("NO");
                continue;
            }
            //맨 마지막 값이 )이 아니면 vps가 아님
            if (!arr[ptr - 1].equals(")")) {
                System.out.println("NO )");
                continue;
            }

            while (true) {
                if (arr[ptr - 1].equals(")")) {
                    ptr--;
                    if (arr[ptr].equals("(")) {
                        ptr--;
                    }
                }
            }
        }
    }
}
