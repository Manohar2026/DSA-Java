package Arrays.Searching.LinearSearch;

public class LastOccurance {

    static int lastOccurance(int[] arr, int target) {
        int result = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                result = i;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 4, 5, 4, 6 };

        System.out.println(lastOccurance(arr, 4));
    }
}
