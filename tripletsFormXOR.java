import java.util.*;
public class tripletsFormXOR {
    public static void main(String[] args) {
      int [] arr = {2,3,1,6,7};
      int res = countTriplets(arr);
        System.out.println(res);
    }
    public static int countTriplets(int[] arr) {

       int  n = arr.length;
        int ct = 0;
        for (int i=0;i<n;i++){
            int val = arr[i];
            for (int k=i+1;k<n;k++){
                 val = val^ arr[k];
                 if(val==0){
                     ct += (k-i);
                 }
            }
        }
        return ct;
    }
}
