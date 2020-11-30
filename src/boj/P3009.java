package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P3009 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] x = new int[1001];
        int[] y = new int[1001];

        for (int i = 0; i < 3; i++) {
            String xy = br.readLine();
            StringTokenizer st = new StringTokenizer(xy);
            x[Integer.parseInt(st.nextToken())]++;
            y[Integer.parseInt(st.nextToken())]++;
        }

        for (int i = 0; i < x.length; i++) {
            if (x[i] == 1) {
                sb.append(i + " ");
                break;
            }
        }
        for (int i = 0; i < y.length; i++) {
            if (y[i] == 1) {
                sb.append(i);
                break;
            }
        }
        System.out.println(sb);
    }
}
