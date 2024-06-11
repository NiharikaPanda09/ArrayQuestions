import java.util.*;
import java.util.HashMap;
public class ContiguousArray {
    public static void main(String[] args) {
        int[] nums1 = {0, 1};
        int[] nums2 = {0, 1, 0};

        System.out.println(findMaxLength(nums1)); // Output: 2
        System.out.println(findMaxLength(nums2));

    }
    public static int findMaxLength(int[] nums) {
        int longest = 0;
        int sum = 0;
        HashMap<Integer,Integer> map = new  HashMap<>();
        map.put(0,-1);
        for(int i=0;i< nums.length;i++) {
            if (nums[i] == 0) {
                sum--;
            } else {
                sum++;
            }

            if (map.containsKey(sum)) {
                longest = Math.max(longest, i -map.get(sum));
            }else{
                map.put(sum,i);
            }
        }
        return longest;


    }
}
