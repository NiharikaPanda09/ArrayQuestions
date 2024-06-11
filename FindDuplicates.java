import java.util.*;
public class FindDuplicates {
    public static void main(String[] args) {
        int [] arr= {1,3,4,2,2};
        int res = findDuplicate(arr);
        System.out.println(res);


    }
    public static int findDuplicate(int[] nums) {
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            int j = nums.length - 1; // Start j from the end of the array
            while (i != j && nums[i] != nums[j]) {
                j--; // Decrement j until it reaches i or finds a duplicate
            }
            if (i != j && nums[i] == nums[j]) {
                return nums[i]; // Return the duplicate element
            }
        }
        return -1;

    }
}
