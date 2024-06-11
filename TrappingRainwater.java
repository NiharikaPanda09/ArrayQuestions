import java.util.*;
public class TrappingRainwater {
    public static void main(String[] args) {
          int [] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        int res = trap(height);
        System.out.println(res);

    }
    public static int trap(int[] height) {

        if (height == null) {
            return 0;
        }

        int left = 0;
        int right = height.length - 1;
        int maxleft = height[left];
        int maxright = height[right];
        int res= 0;

        while (left < right) {
            if (maxleft < maxright) {
                left++;
                maxleft = Math.max(maxleft, height[left]);
                res += maxleft - height[left];
            }

            // Move the pointers inward
            else {
                right--;
                maxright = Math.max(maxright, height[right]);
                res += maxright - height[right];
            }



        }
        return res;
    }
}
