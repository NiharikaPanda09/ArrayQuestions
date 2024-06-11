import java.util.*;
public class LongestConsecutive {
    public static void main(String[] args) {
        int [] arr = {1,1,2,2,3,4,100,101,102};
        System.out.println(longestConsecutive(arr));

    }
    public static int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        Arrays.sort(nums);
        int lastSmallest = Integer.MIN_VALUE;
        int ct = 0;
        int longest = 1;
        for(int i=0;i< nums.length;i++){
            if(nums[i]-1 == lastSmallest){
                ct += 1;
                lastSmallest= nums[i];
            } else if (lastSmallest != nums[i]) {
                lastSmallest = nums[i];
                ct = 1;
            }
            longest = Math.max(longest,ct);
        }
        return longest;

    }
}
