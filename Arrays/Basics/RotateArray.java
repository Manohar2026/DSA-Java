package Arrays.Basics;

public class RotateArray {

    static void leftRotateArray(int[] arr) {
        
        // Keep first element in a variable.
        int first = arr[0];

        // loop from second element to last.
        for(int i = 1; i < arr.length; i++) {
            // move each element left.
            arr[i-1] = arr[i];
        }
        
        // now add first element at last.
        arr[arr.length-1] = first;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};

        leftRotateArray(arr);

        for(int i : arr) {
            System.out.print(i + " ");
        }
    }
}
