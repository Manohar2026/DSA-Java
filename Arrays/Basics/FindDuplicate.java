package Arrays.Basics;

public class FindDuplicate {

    static int findDuplicate(int[] arr) {

        // outer loop .
        for(int i = 0; i < arr.length; i++) {

            // every time runs from i + 2 for every outer loop.
            for(int j = i + 1; j < arr.length; j++) {
                
                // check if it is equal.
                if(arr[i] == arr[j]) {
                    return arr[i];
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 3, 7, 1};

        System.out.println("The duplicate element is : " + findDuplicate(arr));
    }
}
