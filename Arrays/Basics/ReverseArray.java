package Arrays.Basics;

public class ReverseArray {

    static int[] reverseArray(int[] arr) {

        // creating newArr of length same as arr.
        int[] newArr = new int[arr.length];
        int index = 0; // To track index of newArr.

        // Loop through array from last to first.
        for(int i = arr.length - 1; i >= 0; i--) {

            // Add each element.
            newArr[index] = arr[i];
            index++;
        }

        return newArr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 7, 6};

        int[] newArr = reverseArray(arr);

        for(int i : newArr) {
            System.out.print(i + " ");
        }
    }
}