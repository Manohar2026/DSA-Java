package Arrays.TwoPointers;

import java.util.*;

public class ThreeSum {

    static List<List<Integer>> threeSum(int[] arr) {
        List<List<Integer>> list = new ArrayList<>();

        Arrays.sort(arr);

        for (int i = 0; i < arr.length - 2; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }
            int start = i + 1;
            int end = arr.length - 1;

            while (start < end) {
                int sum = arr[i] + arr[start] + arr[end];

                if (sum == 0) {
                    list.add(List.of(arr[i], arr[start], arr[end]));
                    start++;
                    end--;

                    while (start < end && arr[start] == arr[start - 1]) {
                        start++;
                    }

                    while (start < end && arr[end] == arr[end + 1]) {
                        end--;
                    }
                } else if (sum < 0) {
                    start++;
                } else {
                    end--;
                }
            }
        }

        return list;
    }

    public static void main(String[] args) {
        int[] arr = { -1, 0, 1, 2, -1, -4 };

        List<List<Integer>> list = threeSum(arr);

        System.out.println(list);
    }
}
