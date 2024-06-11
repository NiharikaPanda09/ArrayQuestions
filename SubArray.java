import java.util.*;
public class SubArray {
    public static void main(String[] args) {
        int [] arr = {1,0,1,0,1};
        int goal = 0;
        int res = numSubarraysWithSum(arr,goal);
        System.out.println(res);

    }
    public  static int numSubarraysWithSum(int[] nums, int goal) {
        int ct =0;
         for(int i=0;i<nums.length;i++){
            for(int j=0;j<i;j++){
                if(nums[i] + nums[j] <= goal){
                    ct++;
                }
            }
        }
        return ct;

    }
}
