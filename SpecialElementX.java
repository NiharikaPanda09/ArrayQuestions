import java.util.*;
public class SpecialElementX {
    public static void main(String[] args) {
         int [] nums = {0,4,3,0,4};
         int res = specialArray(nums);
        System.out.println(res);
    }
    public static int specialArray(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        for (int x = 0; x <= n; x++) {
            // Find the number of elements greater than or equal to x
            int count = 0;
            for (int num : nums) {
                if (num >= x) {
                    count++;
                }
            }
            if (count == x) {
                return x;
            }
        }
        return -1;
    }
}
