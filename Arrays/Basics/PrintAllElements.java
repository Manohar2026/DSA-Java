package Arrays.Basics;

public class PrintAllElements {

    static void printAllElements(int[] arr) {

        System.out.print("[");

        // Loop through array.
        for(int i = 0; i < arr.length; i++) {

            // Print each element
            System.out.print(arr[i]);

            // print ", " comma and space till last element - 1
            if(i < arr.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.print("]");
    }

    public static void main(String[] args) {
        
        int[] arr = {1, 5, 3, 7, 2, 9};

        printAllElements(arr);
    }
}
