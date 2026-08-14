package Arrays.Basics;

public class CountEvenOdd {

    static int countOdd(int[] arr) {

        // Initial odd elements.
        int oddCount = 0;

        // Loop through array.
        for(int i : arr) {

            // check if element divisible by 2.
            if(i % 2 != 0) {
                oddCount++;
            }
        }

        // return oddcount
        return oddCount;
    }

    static int countEven(int[] arr) {

        // Initial even elements.
        int evenCount = 0;

        // Loop through array.
        for(int i : arr) {

            // check if element divisible by 2.
            if(i % 2 == 0) {
                evenCount++;
            }
        }

        // return evencount.
        return evenCount;
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 4, 7, 2, 9, 10};

        System.out.println("Even elements in array : " + countEven(arr));

        System.out.println("Odd elements in array : " + countOdd(arr));
    }
}
