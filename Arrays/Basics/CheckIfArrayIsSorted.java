package Arrays.Basics;

public class CheckIfArrayIsSorted {

    static boolean checkIfArrayIsSorted(int[] arr) {

        // Loop through the array.
        for(int i = 1; i < arr.length; i++) {
            
            // check if current element smaller than its previous element.
            if(arr[i] < arr[i-1]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 4, 5, 6, 7};

        System.out.println("The array is sorted or not : " + checkIfArrayIsSorted(arr));
    }
}
