import java.util.*;
import java.util.Arrays;
public class DRotation {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int d = 2;
        DRotation obj = new DRotation();
        obj.leftRotate(arr, arr.length, d);
        System.out.println(Arrays.toString(arr));

    }
    public static void leftRotate(int[] arr,int n,int d){
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
    }
    public static void reverse(int [] arr,int start,int end){
        while(start<=end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }




    }
}
