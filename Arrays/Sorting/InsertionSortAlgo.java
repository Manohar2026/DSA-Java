package Arrays.Sorting;

public class InsertionSortAlgo {

    public static void insertionSort(int[] numbers) {
        for (int i = 1; i < numbers.length; i++) {
            int key = numbers[i];
            int j;

            for (j = i - 1; j >= 0 && numbers[j] > key; j--) {
                numbers[j + 1] = numbers[j];
            }

            numbers[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };

        insertionSort(arr);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
