import java.util.*;
public class Longest {
    public static void main(String[] args) {
        String [] arr = {"3", "30", "34", "5", "9"};
        String res =printLargest(5,arr);
        System.out.println(res);


    }
    static String printLargest(int n, String[] arr) {
        // code here

           Arrays.sort(arr, new Comparator<String>() {
               @Override
               public int compare(String a, String b) {
                   String x = a+b;
                   String y = b+a;

                   return y.compareTo(x);
               }
           });

           StringBuilder res = new StringBuilder();
           for(String s : arr){
               res.append(s);
           }
           return res.toString();

    }
}
