package learn.sorts;

public class CountingSort {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 1, 0, 4, 5, 2, 1, 3, 0, 5, 5, 5, 3, 0, 0};
        int[] arr2 = {2, 5, 4, 0, 0, 5, 5, 3, 0, 0, 5, 2, 1, 0, 0, 5};
        countingSort(arr2);
    }

    public static void countingSort(int[] arr) {
        int N = 10;
        int[] countArr = new int[N];

        for (int i = 0; i < arr.length; i++) {
            countArr[arr[i]]++;
        }

        for (int i = 0; i < countArr.length; i++) {
            System.out.println(countArr[i]);
        }
    }
}
