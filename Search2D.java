import java.util.*;
public class Search2D {
    public static void main(String[] args) {
       int [][] matrix = {
               {1,3,5,7},
               {10,11,16,20},
               {23,30,34,60}
       };
       int target = 3;
       boolean res = searchMatrix(matrix,target);
        System.out.println(res);
    }
    public  static boolean searchMatrix(int[][] matrix, int target) {
//        for(int i=0;i< matrix.length;i++){
//            for(int j=0;j< matrix.length;j++){
//                if(matrix[i][j] == target){
//                    return true;
//                }
//            }
//        }
//        return false;
        int m = matrix.length;
        int n = matrix[0].length;
        int left = 0, right = m * n - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int mid_val = matrix[mid / n][mid % n];

            if (mid_val == target)
                return true;
            else if (mid_val < target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return false;
    }
}
