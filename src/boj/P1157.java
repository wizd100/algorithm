package boj;

import java.util.HashMap;
import java.util.Scanner;

public class P1157 {
    public static void main(String[] args) {
        //solution1();
        solution2();
    }

    public static void solution1() {
        HashMap<Character, Integer> map = new HashMap<>();
        char maxKey = '?';
        int maxValue = 0;
        Scanner sc = new Scanner(System.in);
        String s = sc.next().toUpperCase();

        //getOrDefault(key, default) -> map에 키값이 있다면 value 값 리턴, 없다면  default 값 리턴
        //if 문으로 containsKey 로 체크를 하는것 보다 더 깔끔하게 코드작성
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);

            if (maxValue < map.get(s.charAt(i))) {
                maxValue = map.get(s.charAt(i));
                maxKey = s.charAt(i);
            } else if (maxValue == map.get(s.charAt(i))) {
                maxKey = '?';
            }
        }

        System.out.println(maxKey);
    }

    public static void solution2() {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int[] strCount = new int[26]; //A ~ Z 알파벳 26개
        int max = 0;
        int maxIndex = 0;

        //대문자로 변환
        str = str.toUpperCase();

        //알파벳 수 계산
        for (int i = 0; i < str.length(); i++) {
            strCount[(int)str.charAt(i) - 65]++; // char A = 65
        }

        //가장 많이 사용된 알파벳 찾기
        for (int i = 0; i < strCount.length; i++) {
            if (max < strCount[i]) {
                max = strCount[i];
                maxIndex = i;
            } else if (max == strCount[i]) {
                maxIndex = -1;
            }
        }

        if (maxIndex == -1) {
            System.out.println("?");
        } else {
            System.out.println((char)(maxIndex + 65));
        }
    }
}
