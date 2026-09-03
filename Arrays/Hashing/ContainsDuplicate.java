package Arrays.Hashing;

public class ContainsDuplicate {

    static boolean containsDuplicate(int[] arr, int target) {
        int[] hash = new int[10];

        for (int i = 0; i < arr.length; i++) {
            hash[arr[i]]++;
        }

        if (hash[target] > 1) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 4, 4, 1, 2, 7, 8, 7, 0, 9 };

        System.out.println(containsDuplicate(arr, 9));
    }
}
