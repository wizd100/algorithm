package boj;

import java.util.Scanner;

public class P1316 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] words = new String[n];
        int groupWordsCount = 0;

        for (int i = 0; i < n; i++) {
            words[i] = sc.next();
        }

        for (int i = 0; i < n; i++) {
            int[] groupWords = new int[26];
            boolean groupWordsCheck = true;

            for (int j = 0; j < words[i].length(); j++) {
                //이전에 단어가 있다면 그룹단어가 아님
                if (groupWords[(int)words[i].charAt(j) - 97] > 0) {
                    groupWordsCheck = false;
                    break;
                }

                //연속된 문자 검색
                int count = 1;

                for (int k = j + 1; k < words[i].length(); k++) {
                    //그다음 단어가 같지 않다면 종료
                    if (words[i].charAt(j) != words[i].charAt(k)) {
                        groupWords[(int)words[i].charAt(j) - 97] = count;
                        break;
                    }

                    j++;
                    count++;
                }
            }

            if (groupWordsCheck) {
                groupWordsCount++;
            }
        }

        System.out.println(groupWordsCount);
    }
}
