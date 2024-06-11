import javax.swing.*;
import java.util.*;
import java.util.HashMap;
public class CommonMinVal {
    public static void main(String[] args) {
        int[] nums1 = {4, 5, 6, 7, 8};
        int[] nums2 = {5, 7, 8, 9};
        int commonMin = getCommon(nums1, nums2);
        System.out.println("Common minimum value: " + commonMin);
    }


    public  static int getCommon(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> mp = new HashMap<>();

        for (int num : nums1) {
            mp.put(num, mp.getOrDefault(num, 0) + 1);
        }

        int commonMin = Integer.MAX_VALUE;
        // Iterate through nums2 to find common minimum value
        for (int num : nums2) {
            if (mp.containsKey(num)) {
                commonMin = Math.min(commonMin, num);
            }
        }
        return commonMin == Integer.MAX_VALUE ? -1 : commonMin;

    }
}
