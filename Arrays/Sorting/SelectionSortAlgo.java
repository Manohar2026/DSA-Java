package Arrays.Basics;

public class SelectionSortAlgo {

    static void selectionSortAlgo(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int smallest = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[smallest]) {
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };

        selectionSortAlgo(arr);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
