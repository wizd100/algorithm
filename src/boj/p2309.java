package boj;

import java.util.Arrays;
import java.util.Scanner;

public class p2309 {
    //9명 전체를 더한 값에서 나머지 2명을 빼서 값이 100인걸 확인
    public static void main(String[] args) {
        int[] number = new int[9];
        int[] number2 = new int[7];

        int total = 0;
        int n1 = 0;
        int n2 = 0;
        int count = 0;

        Scanner sc = new Scanner(System.in);

        //난쟁이 키 입력
        for (int i = 0; i < 9; i++) {
            number[i] = sc.nextInt();
        }

        //9명 총합
        for (int i = 0; i < number.length; i++) {
            total += number[i];
        }

        //2명 빼서 합이 100이 되는 걸 찾기
        for (int i = 0; i < number.length; i++) {
            for (int j = i + 1; j < number.length; j++) {
                if (total - number[i] - number[j] == 100) {
                    //System.out.println(number[i] + " -> " + i);
                    //System.out.println(number[j] + " -> " + j);
                    n1 = i;
                    n2 = j;
                }
            }
        }

        //7명 데이터를 집어넣고 오름차순 정렬
        for (int i = 0; i < number.length; i++) {
            if (i == n1 || i == n2) {
                continue;
            }
            number2[count] = number[i];
            count++;
        }

        Arrays.sort(number2);

        for (int i = 0; i < number2.length; i++) {
            System.out.println(number2[i]);
        }
    }


    /*public static void main(String[] args) {
        int dwarf = 9;
        int select = 7;
        int[] inputNum = new int[dwarf];
        int total = 0;
        int last = dwarf - 1;
        int end = dwarf - select;
        int count = 0;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < dwarf; i++) {
            inputNum[i] = sc.nextInt();
        }

        for (int i = 0; i < select; i++) {
            total += inputNum[i];
            count++;

            if (count == select - 1) {
                //System.out.println("forend");
                if (total != 100) {


                    i = 0;
                    count = 0;

                }
            }
        }

        for (int i = 0; i < inputNum.length; i++) {
            //System.out.println(inputNum[i]);
            //System.out.println(total);
        }
    }*/
}
