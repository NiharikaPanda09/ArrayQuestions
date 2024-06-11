import java.util.*;
public class ReversePair {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 3, 1};
        int res = ReversePair.reversePairs(arr); // Call using class name
        System.out.println(res);
    }

    public static int reversePairs(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        return mergeSort(nums, 0, nums.length - 1);
    }

    private static int mergeSort(int[] arr, int left, int right) {
        if (left >= right) {
            return 0;
        }

        int mid = left + (right - left) / 2;
        int count = mergeSort(arr, left, mid) + mergeSort(arr, mid + 1, right);

        int[] merged = new int[right - left + 1];
        int i = left, j = mid + 1, k = 0;
        while (i <= mid && j <= right) {
            if (arr[i] > 2L * arr[j]) {
                count += mid - i + 1;
                j++;
            } else {
                i++;
            }
        }

        i = left;
        j = mid + 1;
        k = 0;
        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                merged[k++] = arr[i++];
            } else {
                merged[k++] = arr[j++];
            }
        }

        while (i <= mid) {
            merged[k++] = arr[i++];
        }

        while (j <= right) {
            merged[k++] = arr[j++];
        }

        System.arraycopy(merged, 0, arr, left, merged.length);

        return count;
    }
}