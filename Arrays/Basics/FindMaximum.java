package Arrays.Basics;

public class FindMaximum {

    static int findMaximum(int[] arr) {
        
        //Initially consider first element as largest
        int largest = arr[0];

        //loop from second element till last element
        for(int i = 1; i < arr.length; i++) {

            //check if current element greater than largest
            if(arr[i] > largest) {

                //if the condition is true than, we get new largest
                largest = arr[i];
            }
        }

        //Finally return the largest element
        return largest;
    }


    public static void main(String[] args) {
        
        //Declared, initialized, and values set
        int[] arr = {2, 6, 1, 9, 3, 0, 34};

        //Calling findMaximum method and printing the output
        System.out.println("Largest number in the array is : " + findMaximum(arr));
    }
}
