import java.util.*;
public class InversionMergeSort {
    public static void main(String[] args) {
        long [] arr = {3,2,1};
        int n = 3;
        long res = getInversions(arr,n);
        System.out.println(res);



    }
    public static long getInversions(long[] arr, int n) {
        int ct =0;
        for(int i=0;i<n;i++){
            for(int j=1;j<n;j++){
                if(arr[i] > arr[j] && i< j){
                    ct++;

                }
            }
        }
        return ct;

    }
}
