package Arrays.Basics;

public class RemoveDuplicates {

    static void removeDuplicate(int[] arr) {
        int start = 0;
        int point = 1;

        while (point < arr.length) {
            if (arr[start] != arr[point]) {
                start++;
                arr[start] = arr[point];
                point++;
            } else {
                point++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 1, 2, 2, 3, 4, 4, 5 };

        removeDuplicate(arr);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
