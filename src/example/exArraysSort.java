package example;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class exArraysSort {
    public static void main(String[] args) {
        asc();
        desc();
    }

    public static void asc() {
        int[] arr1 = new int[] {5, 3, 2, 4, 1, 2};

        System.out.print("정렬 전 : ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();

        //오름차순 정렬
        Arrays.sort(arr1);

        System.out.print("정렬 후 : ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
    }

    public static void desc() {
        Integer[] arr1 = new Integer[] {5, 3, 2, 4, 1, 2};

        System.out.print("정렬 전 : ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();

        //내림차순 정렬
        //Arrays.sort(arr1, Comparator.reverseOrder()); //Comparator
        //Arrays.sort(arr1, Collections.reverseOrder()); //Collections

        Arrays.sort(arr1, new Comparator<Integer>() {
           @Override
           public int compare(Integer o1, Integer o2) {
               return o2.compareTo(o1);
           }
        });

        System.out.print("정렬 후 : ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
    }
}
