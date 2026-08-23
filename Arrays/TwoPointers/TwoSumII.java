package Arrays.TwoPointers;

public class TwoSumII {

    static int[] twoSum(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            if (arr[start] + arr[end] == target) {
                return new int[] { start, end };
            } else if (arr[start] + arr[end] < target) {
                start++;
            } else {
                end--;
            }
        }

        return new int[] {};
    }

    public static void main(String[] args) {
        int[] arr = { 2, 7, 8, 4 };

        int[] newArr = twoSum(arr, 11);

        for (int i : newArr) {
            System.out.print(i + " ");
        }
    }
}
