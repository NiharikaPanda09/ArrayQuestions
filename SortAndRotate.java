import java.util.Arrays;

public class SortAndRotate {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 1, 2};
        boolean res = check(arr);
        System.out.println(res);
    }

    public static boolean check(int[] nums) {
        int[] sortedArray = Arrays.copyOf(nums, nums.length);
        Arrays.sort(sortedArray);

        for (int k = 0; k < nums.length; k++) {
            if (Arrays.equals(nums, sortedArray)) {
                return true;
            }
            rotated(nums); // Rotate the array by one position
        }

        return false;
    }

    public static void rotated(int[] nums) {
        int temp = nums[nums.length - 1];
        for (int i = nums.length - 1; i > 0; i--) {
            nums[i] = nums[i - 1];
        }
        nums[0] = temp;
    }
}
