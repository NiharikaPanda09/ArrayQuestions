import java.util.*;
public class FrequencySlidingWindow {
    public static void main(String[] args) {
        int[] nums = {1, 2, 4};
        int k = 5;
        int res = maxFrequency(nums, k);
        System.out.println(res);

    }

    public static int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int left = 0;
        int total = 0;
        int res = 0;
        for (int right = 0; right < nums.length; right++) {
            total += nums[right];

            // Shrink the window from the left as long as the condition is violated
            while (nums[right] * (right - left + 1) > total + k) {
                total -= nums[left];
                left++;
            }

            // Update the result with the maximum window size encountered so far
            res = Math.max(res, right - left + 1);
        }

        return res;
    }
}