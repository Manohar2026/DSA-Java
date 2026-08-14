package Arrays.Basics;

public class SecondSmallest {

    static String secondSmallest(int[] arr) {

        // Initializing smallest with largest integer value.
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        // Loop through array.
        for(int i : arr) {

            // check if i is smaller than smallest.
            if(i < smallest) {
                secondSmallest = smallest;
                smallest = i;
            }
            // check if i smaller than secondSmallest and greater than smallest.
            else if(i < secondSmallest && i > smallest) {
                secondSmallest = i;
            }
        }

        // check if secondSmallest updated.
        if(secondSmallest == Integer.MAX_VALUE) {
            return "There is no second smallest";
        }
        else {
            return secondSmallest + "";
        }
    }

    public static void main(String[] args) {
        
        int[] arr = {1, 5, 3 ,34, 12, 9, 10};

        System.out.println("Second smallest element in the array is : " + secondSmallest(arr));
    }
}
