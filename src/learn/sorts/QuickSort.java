package learn.sorts;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 7, 6, 2, 1, 4};
        //int[] arr = {5, 4, 3, 8, 9, 6, 7, 1, 10, 2};
        //int[] arr = {2, 1};
        //int[] arr = {1, 2, 3, 4, 5};
        quickSort(arr, 0, arr.length - 1);

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);
        }
    }

    public static void quickSort(int[] arr, int left, int right) {
        int i;
        int j;
        int pivot;
        int tmp;

        if (left < right) {
            i = left;
            j = right;
            pivot = arr[(left + right) / 2];

            while (i < j) {
                while (arr[j] > pivot) {
                    j--;
                }
                // 이 부분에서 arr[j-1]에 접근해서 익셉션 발생가능함.
                while (i < j && arr[i] < pivot) {
                    i++;
                }

                tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }

            quickSort(arr, left, i - 1);
            quickSort(arr, i + 1, right);
        }
    }
}
