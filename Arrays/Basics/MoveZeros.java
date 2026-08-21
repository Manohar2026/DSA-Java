package Arrays.Basics;

public class MoveZeros {

    static int[] moveZeros(int[] arr) {
        int[] newArr = new int[arr.length];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                newArr[index] = arr[i];
                index++;
            }
        }

        return newArr;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 0, 3, 0, 4, 5, 0, 7 };

        int[] newArr = moveZeros(arr);

        for (int i : newArr) {
            System.out.print(i + " ");
        }
    }
}
