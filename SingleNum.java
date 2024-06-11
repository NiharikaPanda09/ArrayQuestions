import java.util.*;
public class SingleNum {
    public static void main(String[] args) {
        int [] arr = {2,2,1};
        int res = singleNumber(arr);
        System.out.println(res);

    }
    public static int singleNumber(int[] nums) {
        int res = 0;
        for (int num : nums) {
            res ^= num; // XOR operation
        }
        return res;
    }
}
