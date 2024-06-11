import java.util.*;
public class SingleNumberIII {
    public static void main(String[] args) {
       int [] nums = {1,2,1,3,2,5};
       int[] res = singleNumber(nums);
        System.out.println(Arrays.toString(res));

    }
    public static int[] singleNumber(int[] nums) {
        int xor2no = 0;
        for (int num : nums) {
            xor2no ^= num;
        }

        int lowestBit = xor2no & (-xor2no);

        int[] result = new int[2];
        for (int num : nums) {
            if ((lowestBit & num) == 0) {
                result[0] ^= num;
            } else {
                result[1] ^= num;
            }
        }

        return result;

    }
}
