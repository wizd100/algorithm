package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P10871 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String nx = br.readLine();
        StringTokenizer st1 = new StringTokenizer(nx);
        int N = Integer.parseInt(st1.nextToken());
        int X = Integer.parseInt(st1.nextToken());

        String strA = br.readLine();
        StringTokenizer st2 = new StringTokenizer(strA);
        for (int i = 0; i < N; i++) {
            int A = Integer.parseInt(st2.nextToken());
            if (A < X) {
                sb.append(A + " ");
            }
        }
        System.out.println(sb);
    }
}
