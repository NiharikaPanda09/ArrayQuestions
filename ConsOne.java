import java.util.*;
public class ConsOne {
    public static void main(String[] args) {
        int [] arr = {1,1,0,1,1,1};
        int res = findMaxConsecutiveOnes(arr);
        System.out.println(res);
    }
    public static  int findMaxConsecutiveOnes(int[] nums) {
       int ct=0;
       int maxct = 0;
       for(int i=0;i< nums.length;i++){
           if(nums[i] == 1){
               ct++;
               maxct = Math.max(maxct,ct);

           }else{
               ct = 0;
           }
       }
       return maxct;

    }
}
