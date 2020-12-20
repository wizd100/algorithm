package learn.sorts;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {10, 3, 5, 1, 7, 6, 9, 2, 4, 8};
        int temp;
        int sortedIndex;
        /*
         * 10 3 5 1 7 6 9 2 4 8 - 시작
         * 3 10| 5 1 7 6 9 2 4 8 - 첫번째 패스
         * 3 5 10| 1 7 6 9 2 4 8 - 두번째 패스
         * 3 5 1 10| 7 6 9 2 4 8 - 교환 10 1
         * 3 1 5 10| 7 6 9 2 4 8 - 교환 5 1
         * 1 3 5 10| 7 6 9 2 4 8 - 교환 3 1 세번째 패스
         * */

        for (int i = 0; i < arr.length - 1; i++) {
            sortedIndex = i + 1;
            //정렬이 안된 값을 교환
            if (arr[i] > arr[i + 1]) {
                temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }

            //이미 정렬이 된 값을 교환
            for (int j = sortedIndex; j > 0; j--) {
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);
        }
    }
}
