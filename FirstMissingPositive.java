import java.util.*;
public class FirstMissingPositive {
    public static void main(String[] args) {
        int [] arr = {1,2,0};
        int res = firstMissingPositive(arr);
        System.out.println(res);

    }
    public  static int firstMissingPositive(int[] nums) {

        for(int i=0;i<nums.length;i++){
            while(nums[i]>0 && nums[i]<= nums.length && nums[i]!=nums[nums[i]-1]){
                swap(nums,i,nums[i]-1);
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i] != i+1){
                return i+1;
            }
        }
        return nums.length+1;


    }
    private static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

}

