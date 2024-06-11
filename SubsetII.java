import java.util.*;

public class SubsetII {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2};
        System.out.println(subsetsWithDup(nums));
    }

    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        findAns(0, nums, new ArrayList<>(), ans);
        return ans;
    }

    public static void findAns(int index, int[] nums, List<Integer> current, List<List<Integer>> ans) {
        ans.add(new ArrayList<>(current));
        for (int i = index; i < nums.length; i++) {
            if (i > index && nums[i] == nums[i - 1]) {
                continue; // skip duplicates
            }
            current.add(nums[i]);
            findAns(i + 1, nums, current, ans);
            current.remove(current.size() - 1); // backtrack
        }
    }
}
