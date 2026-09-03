package Arrays.Hashing;

public class FindMajorityElement {

    static int findMajorityElement(int[] arr) {
        int[] hash = new int[10];

        for (int i = 0; i < arr.length; i++) {
            hash[arr[i]]++;
        }

        int majority = Integer.MIN_VALUE;
        int majorityElement = -1;
        for (int i = 0; i < hash.length; i++) {
            if (hash[i] > majority) {
                majority = hash[i];
                majorityElement = i;
            }
        }

        return majorityElement;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 4, 4, 1, 2, 7, 8, 7, 0, 9 };

        System.out.println(findMajorityElement(arr));
    }
}
