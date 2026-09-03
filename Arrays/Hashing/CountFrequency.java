package Arrays.Hashing;

public class CountFrequency {

    static int countFrequency(int[] arr, int target) {
        int[] hash = new int[10];

        for (int i = 0; i < arr.length; i++) {
            hash[arr[i]]++;
        }

        return hash[target];
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 4, 1, 2, 7, 8, 7, 0, 9 };

        System.out.println(countFrequency(arr, 4));
    }
}
