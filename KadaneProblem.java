import java.util.*;
public class KadaneProblem {
    public static void main(String[] args) {
        int [] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int res = maxSubArray(arr);
        System.out.println(res);

    }
    public static int maxSubArray(int[] nums) {
        int sum =0;
        int max = nums[0];
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
            if(sum > max){
                max = sum;
            }
            if(sum < 0) {
                sum = 0;
            }
        }
        return max;

    }

}
