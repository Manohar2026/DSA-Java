package Arrays.Basics;

public class CountPositiveNegative {

    static int countNegative(int[] arr) {

        // Initial negative elements.
        int countNegative = 0;

        // Loop through array.
        for(int i : arr) {

            // check if element less than zero.
            if(i < 0) {
                countNegative++;
            }
        }

        // Return negative count.
        return countNegative;
    }

    static int countPositive(int[] arr) {

        // Initial positive elements
        int countPositive = 0;

        // Loop through array.
        for(int i : arr) {

            // check if element greater than 0.
            if(i > 0) {
                countPositive++;
            }
        }

        // Return positive count.
        return countPositive;
    }

    public static void main(String[] args) {
        int[] arr = {1, 6, -23, 0, -12, 4, -9};

        System.out.println("Positive integers in an array : " + countPositive(arr));

        System.out.println("Negative integers in an array : " + countNegative(arr));
    }
}
