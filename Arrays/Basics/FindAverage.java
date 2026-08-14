package Arrays.Basics;

public class FindAverage {

    static float findAverage(int[] arr) {

        // Initail sum.
        int sum = 0;

        // loop through array.
        for(int i : arr) {

            // Find sum.
            sum += i;
        }

        // This first cast (int) into (float) and then perform (float / int) which return float.
        return (float) sum / arr.length;
    }
    public static void main(String[] args) {
        
        int[] arr = {1, 5, 3, 7, 2, 9};

        System.out.println("Average of all the elements : " + findAverage(arr));
    }
}
