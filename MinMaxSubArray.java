import java.util.*;
public class MinMaxSubArray {
    public static void main(String[] args) {
        int [] nums = {1,3,5,2,7,5};
        int min = 1;
        int max = 5;
        long res = countSubarrays(nums,min,max);
        System.out.println(res);

    }
    public static long countSubarrays(int[] nums, int minK, int maxK) {
        long count = 0;
        int n = nums.length, badI = -1, minI = -1, maxI = -1;

        for(int i = 0; i < n; i++) {
            if(nums[i] < minK || nums[i] > maxK) badI = i;
            if(nums[i] == minK) minI = i;
            if(nums[i] == maxK) maxI = i;
            count += Math.max(0, Math.min(minI, maxI) - badI);
        }
        return count;
    }
}
