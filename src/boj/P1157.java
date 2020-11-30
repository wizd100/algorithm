package boj;

import java.util.HashMap;
import java.util.Scanner;

public class P1157 {
    public static void main(String[] args) {
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
}
