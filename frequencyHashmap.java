import java.util.*;
import java.util.HashMap;
public class frequencyHashmap {
    public static void main(String[] args) {

    }
    public static int maxFrequency(int[] nums, int k) {
        int left =0;
        int total =0;
        int res =0;
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int right =0;right<nums.length;right++){
            total += nums[right];
            map.put(nums[right], map.getOrDefault(nums[right],0)+1);

            while((long)nums[right] * (right-left+1) > total+k){
                map.put(nums[left], map.get(nums[left])-1);
                if (map.get(nums[left]) == 0)
                    map.remove(nums[left]);
                total -= nums[left];
                left++;
            }

            // Update the result with the maximum window size encountered so far
            res = Math.max(res, right - left + 1);
            }
        return res;
        }
    }


