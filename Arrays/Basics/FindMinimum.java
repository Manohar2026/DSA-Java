package Arrays.Basics;

public class FindMinimum {

    static int findMinimum(int[] arr) {

        // Initial minimum.
        int smallest = arr[0];

        // Check remaining elements.
        for(int i = 1; i < arr.length; i++) {

            // Update minimum if smaller.
            if(arr[i] < smallest) {

                smallest = arr[i];
            }
        }

        // Return smallest.
        return smallest;
    }

    public static void main(String[] args) {
        
        int[] arr = {2, 54, 9, 23, 1, 4, 10};

        System.out.println("Smallest element in the array is : " + findMinimum(arr));
    }
}
