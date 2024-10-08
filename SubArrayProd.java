import java.util.*;
public class SubArrayProd {
    public static void main(String[] args) {
        int[] nums = {10, 5, 2, 6};
        int k = 100;
        int res = numSubarrayProductLessThanK(nums, k);
        System.out.println(res);
    }

    public static int numSubarrayProductLessThanK(int[] nums, int k) {


        int count = 0;
        int prod = 1;
        int left = 0;

        for (int right = 0; right < nums.length; right++) {
            prod *= nums[right];

            while (prod >= k && left <= right) {
                prod /= nums[left];
                left++;
            }

            count += right - left + 1;
        }

        return count;

    }
}