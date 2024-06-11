import java.util.*;
public class RepeatAndMissing {
    public static void main(String[] args) {
        int [] nums = {3,1,2,5,3};
        int[] res = repeatedNumber(nums);
        System.out.println(Arrays.toString(res));


    }

    public static int[] repeatedNumber(final int[] A) {
        int repeating = -1;
        int missing = -1;

        for (int i = 0; i < A.length; i++) {
            int ct = 0;
            for (int j = i; j < A.length; j++) {
                if (A[i] == A[j]) {
                    ct++;
                }
            }
            if (ct == 2) {
                repeating = A[i];
            } else if (ct == 0) {
                missing = A[i];
            }
            if (repeating != -1 && missing != -1) {
                break;
            }
        }

        return new int[]{repeating, missing};

    }
}
