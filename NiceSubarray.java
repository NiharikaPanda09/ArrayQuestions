import java.util.*;
public class NiceSubarray {
    public static void main(String[] args) {
            int [] nums = {1,1,2,1,1};
            int k = 3;
            int res =  numberOfSubarrays(nums,k);
        System.out.println(res);
    }
    public static int atmost (int[] nums, int k) {
        int i=0;
        int j=0;
        int ans=0;
        int countOdd=0;
        int n=nums.length;
        while(j<n){
            if (nums[j]%2!=0){
                countOdd++;
            }
            while(countOdd>k){
                if (nums[i]%2!=0){
                    countOdd--;
                }
                i++;
            }
            ans+=j-i+1;
            j++;
        }
        return ans;
    }
    public static int numberOfSubarrays(int[] nums, int k) {
        return atmost(nums,k)-atmost(nums,k-1);
    }
}
