package Arrays.TwoPointers;

public class RemoveDuplicates {

    static void removeDuplicateFromSortedArray(int[] arr) {
        int start = 0;
        int end = 1;
        int count = 1;

        while (end < arr.length) {
            if (arr[start] != arr[end]) {
                start++;
                arr[start] = arr[end];
                end++;
                count++;
            } else {
                end++;
            }
        }

        while (count < arr.length) {
            arr[count] = 0;
            count++;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 3, 3, 4, 5, 6 };

        removeDuplicateFromSortedArray(arr);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
