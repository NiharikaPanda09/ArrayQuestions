import java.util.*;
public class nextPermutation {
    public static void main(String[] args) {
       int [] nums = {1,2,3};
       nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
    }
    public  static void nextPermutation(int[] nums) {
        //find the breaking point
        int ind =-1;
        int ind1 = -1;
        int n= nums.length;
        for(int i=n-2;i>=0;i--){
            if(nums[i] < nums[i+1]){
                ind = i;
                break;
            }
        }
        //edge case if the array is greater and theres no next permutation then we reverse that...to find the smallest one
        /**
         * eg:
         * arr[] = {5,4,3,2,1};
         * we do not have next permutation after this
         * so we reverse it and this is the edge case we found
         * i.e{1,2,3,4,5}
         * here the breaking point will be 4
         */
        if(ind== -1){
            reverse(nums,0);
        }else {
            for(int i= n-1;i>=0;i--){
                if(nums[i] > nums[ind]){
                        ind1=i;
                        break;
                }
            }
            swap(nums,ind,ind1);
            reverse(nums,ind+1);
        }
    }
   public static void swap(int[] nums,int i,int j ){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
  public  static  void reverse(int [] nums,int start){
        int i= start;
        int j = nums.length-1;
        while(i<j){
            swap(nums,i,j);
            i++;
            j--;
        }
    }
}
