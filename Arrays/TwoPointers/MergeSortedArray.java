package Arrays.TwoPointers;

public class MergeSortedArray {

    static int[] mergeSortedArray(int[] arr1, int[] arr2) {
        int[] newArr = new int[arr1.length + arr2.length];
        int index = 0;

        int first = 0;
        int second = 0;

        while (first < arr1.length && second < arr2.length) {
            if (arr1[first] < arr2[second]) {
                newArr[index] = arr1[first];
                index++;
                first++;
            } else {
                newArr[index] = arr2[second];
                index++;
                second++;
            }
        }

        while (first < arr1.length) {
            newArr[index] = arr1[first];
            index++;
            first++;
        }

        while (second < arr2.length) {
            newArr[index] = arr2[second];
            index++;
            second++;
        }

        return newArr;
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 3, 5, 7 };
        int[] arr2 = { 2, 4, 6, 8 };

        int[] newArr = mergeSortedArray(arr1, arr2);

        for (int i : newArr) {
            System.out.print(i + " ");
        }
    }
}
