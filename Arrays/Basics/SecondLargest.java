package Arrays.Basics;

public class SecondLargest {

    static String secondLargest(int[] arr) {

        // Initializing largest and secondlargest as smallest integer.
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        // Loop through array.
        for(int i : arr) {

            // check if element greater than largest
            if(i > largest) {
                secondLargest = largest;
                largest = i;
            }
            // check if element greater than secondlargest but smaller than largest
            else if(i > secondLargest && i < largest) {
                secondLargest = i;
            }
        }

        // checking if secondlargest updated atleast once
        if(secondLargest == Integer.MIN_VALUE) {
            return "No second largest";
        }
        else {
            return secondLargest + "";
        }
    }

    public static void main(String[] args) {
        
        int[] arr = {1, 5, 3 ,34, 12, 9, 10};

        System.out.println("Second largest element in the array is : " + secondLargest(arr));

    }
}
