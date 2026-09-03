package Arrays.Hashing;

public class FindUniqueElement {

    static int findUniqueElement(int[] arr) {
        int[] hash = new int[10];

        for (int i = 0; i < arr.length; i++) {
            hash[arr[i]]++;
        }

        for (int i = 0; i < hash.length; i++) {
            if (hash[i] == 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 4, 1, 2, 7, 7, 9 };

        System.out.println(findUniqueElement(arr));
    }
}
