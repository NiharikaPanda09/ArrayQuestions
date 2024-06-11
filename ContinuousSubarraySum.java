import java.util.*;
public class ContinuousSubarraySum {

        public static void main (String[]args){
            int[] nums = {23, 2, 4, 6, 7};
            int k = 6;
            ContinuousSubarraySum css = new ContinuousSubarraySum();
            System.out.println(css.checkSubarraySum(nums, k));
        }

        public boolean checkSubarraySum ( int[] nums, int k){
            if (nums == null || nums.length == 0) {
                return false;
            }
            Map<Integer, Integer> map = new HashMap<>();
            map.put(0, -1); // Initialize with (0, -1) to handle edge cases
            int sum = 0;

            for (int i = 0; i < nums.length; i++) {
                sum += nums[i];
                if (k != 0) {
                    sum %= k;
                }
                if (map.containsKey(sum)) {
                    if (i - map.get(sum) > 1) { // Check if the length of subarray is at least 2
                        return true;
                    }
                } else {
                    map.put(sum, i);
                }
            }
            return false;
        }
    }

