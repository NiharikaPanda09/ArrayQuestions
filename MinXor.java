import java.util.*;
public class MinXor {
    public static void main(String[] args) {
         int [] nums = {2,1,3,4};
         int k = 1;
        System.out.println(minOperations(nums,k));

    }
    public static int minOperations(int[] nums, int k) {
       int [] oneBit = new int[32];

       for(int num:nums){
           for(int i=0;i<32;i++){
               if ((num & 1<<i)!=0){
                   oneBit[i]++;
               }
           }
       }
       int ans =0;
       for(int i=0;i<32;i++){
         if((k &(1<<i)) !=0){
             ans += oneBit[i] % 2 == 0 ? 1 : 0;
         } else {
             ans += oneBit[i] % 2 == 1 ? 1 : 0;
         }
       }

        return ans;
         }
       }

