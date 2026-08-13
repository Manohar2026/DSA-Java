package Arrays.Basics;

public class FindSum {

    static int findSum(int[] arr) {

        // Initialize sum as 0.
        int sum = 0;

        // Iterate through each element in an array.
        for(int i : arr) {

            // Add the element with sum.
            sum += i;
        }

        // Return sum.
        return sum;
    }

    public static void main(String[] args) {
        
        int[] arr = {1, 5, 3, 7, 2, 9};

        System.out.println("Sum of all the elements : " + findSum(arr));
    }
}
