package boj;

import java.util.Scanner;

public class P10828 {
    private int ptr;
    private int[] stk;

    public P10828(int max) {
        ptr = 0;
        stk = new int[max];
    }

    public int push(int n) {
        return stk[ptr++] = n;
    }

    public int pop() {
        if (ptr <= 0) {
            return -1;
        }
        return stk[--ptr];
    }

    public int size() {
        return ptr;
    }

    public int empty() {
        if (ptr <= 0) {
            return 1;
        }
        return 0;
    }

    public int top() {
        if (ptr <= 0) {
            return -1;
        }
        return stk[ptr - 1];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //명령어의 수가 입력됨
        int num = scanner.nextInt();
        scanner.nextLine(); // 개행문자(\n) 때문에 다음 nextLine for문이 0에 바로 입력이 됨 (for문 하나가 그냥 넘어감)
        P10828 stk = new P10828(num);

        for (int i = 0; i < num; i++) {
            String s = scanner.nextLine();

            if (s.contains("push")) {
                String[] arr = s.split(" ");
                stk.push(Integer.parseInt(arr[1]));
            } else if (s.equals("pop")) {
                System.out.println(stk.pop());
            } else if (s.equals("size")) {
                System.out.println(stk.size());
            } else if (s.equals("empty")) {
                System.out.println(stk.empty());
            } else if (s.equals("top")) {
                System.out.println(stk.top());
            }
        }
    }
}
