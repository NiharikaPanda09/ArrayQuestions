import java.util.*;
public class MaxConsIII {
    public static void main(String[] args) {
        int [] nums = {1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;
       int res = longestOnes(nums,k);
        System.out.println(res);

    }
    public static int longestOnes(int[] nums, int k) {
       int max_len = 0;
       int left =0;
       int Zero_ct = 0;
       for(int i=0;i< nums.length;i++){
           if(nums[i] == 0){
               Zero_ct++;
           }
           while(Zero_ct > k){
               if(nums[left] == 0){
                   Zero_ct--;
               }
               left++;
           }
           max_len = Math.max(max_len,i-left+1);
       }
       return max_len;

    }
}
