import java.util.*;
public class HeightChecker {
    public static void main(String[] args) {
           int [] height ={5,1,2,3,4};
        System.out.println(heightChecker(height));
    }
    public static  int heightChecker(int[] heights) {
        int[] expected = heights.clone();
        int ct =0;
        Arrays.sort(expected);
        for(int i=0;i<heights.length;i++){
            if(heights[i] !=expected[i]){
                ct++;
            }
        }
        return ct;
    }
}
