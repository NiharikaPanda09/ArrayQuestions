import java.util.*;
public class FourSum {
    public static void main(String[] args) {
        int [] nums = {1,0,-1,0,-2,2};
        int target = 0;
        System.out.println(fourSum(nums,target));

    }
    public static  List<List<Integer>> fourSum(int[] nums, int target) {
//        List<List<Integer>> list = new ArrayList<>();
//        Arrays.sort(nums);
//        for(int i=0;i< nums.length-3;i++){
//            if(i>0 && nums[i] == nums[i-1]){
//                continue;
//            }
//            for(int j=0;j< nums.length-2;j++){
//                if(j>i+1 && nums[j] == nums[j-1])
//                    continue;
//                int left = j+1;
//                int right = nums.length-1;
//                while(left<right){
//                    int sum = nums[i] + nums[j] + nums[left] + nums[right];
//                    if(sum == target){
//                       // list.add(List.of(nums[i] + nums[j] + nums[left] + nums[right]));
//                        list.add(List.of(nums[i] + nums[j] + nums[left] + nums[right]));
//
//                        while(left <right && nums[left] == nums[left+1]){
//                            left++;
//                        }
//                        while(left<right && nums[right] == nums[right-1]){
//                            right--;
//                        }
//                        left++;
//                        right--;
//                    }else if(sum <target){
//                        left++;
//                    }else {
//                        right--;
//                    }
//                }
//
//            }
//
//        }
//        return list;

            List<List<Integer>> list = new ArrayList<>();
            Arrays.sort(nums);

            for (int i = 0; i < nums.length - 3; i++) {
                if (i > 0 && nums[i] == nums[i - 1]) {
                    continue;
                }
                for (int j = i + 1; j < nums.length - 2; j++) {
                    if (j > i && nums[j] == nums[j - 1]) {
                        continue;
                    }
                    int left = j + 1;
                    int right = nums.length - 1;
                    while (left < right) {
                        int sum = nums[i] + nums[j] + nums[left] + nums[right];
                        if (sum == target) {
                            list.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));

                            while (left < right && nums[left] == nums[left + 1]) {
                                left++;
                            }
                            while (left < right && nums[right] == nums[right - 1]) {
                                right--;
                            }
                            left++;
                            right--;
                        } else if (sum < target) {
                            left++;
                        } else {
                            right--;
                        }
                    }
                }
            }
            return list;
    }
}
