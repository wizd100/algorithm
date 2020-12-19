package learn.sorts;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {30, 5, 21, 10, 4, 13, 8, 25, 19, 1};

        //첫번째 수와 그 다음수를 비교해서 정렬
        //장점 : 구현하기 쉽다, 적은 수에선 쓸만함
        //단점 : 수가 클 수록 수행시간이 길어짐
        //-i를 하는 이유? -> 맨 마지막 부터 정렬이 됨 (맨 마지막은 비교를 안해도 된다는 것)
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        //1 4 5 8 10 13 19 21 25 30
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);
        }
    }
}
