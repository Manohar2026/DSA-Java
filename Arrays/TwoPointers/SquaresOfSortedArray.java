package Arrays.TwoPointers;

public class SquaresOfSortedArray {

    static int[] squaresOfSortedArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int index = arr.length - 1;
        int[] newArr = new int[arr.length];

        while (start < end) {
            int one = arr[start] * arr[start];
            int two = arr[end] * arr[end];

            if (one > two) {
                newArr[index] = one;
                index--;
                start++;
            } else {
                newArr[index] = two;
                index--;
                end--;
            }
        }

        return newArr;
    }

    public static void main(String[] args) {
        int[] arr = { -4, -1, 0, 2, 10 };

        int[] newArr = squaresOfSortedArray(arr);

        for (int i : newArr) {
            System.out.print(i + " ");
        }
    }
}
