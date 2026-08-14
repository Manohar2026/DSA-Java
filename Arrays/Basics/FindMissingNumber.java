package Arrays.Basics;

public class FindMissingNumber {

    static int findMissingNumber(int[] arr) {
        // first calculate expectedSum
        int n = arr.length;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        // loop through array.
        for(int i : arr) {
            // now calculate actual sum.
            actualSum += i;
        }

        // Finally their difference is the missing number.
        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 0, 7, 5, 6};

        System.out.println("Missing number is : " + findMissingNumber(arr));
    }
}
