package Arrays.TwoPointers;

public class MoveZeroes {

    static void moveZeroes(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {

            if (arr[start] == 0 && arr[end] != 0) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
            }
            if (arr[start] != 0) {
                start++;
            }
            if (arr[end] == 0) {
                end--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 0, 0, 2, 3, 4, 0, 5, 0, 7, 0, 0, 8, 9 };

        moveZeroes(arr);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
