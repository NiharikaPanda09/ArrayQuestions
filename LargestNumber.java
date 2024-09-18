import java.util.*;
public class LargestNumber {
    public static void main(String[] args) {
       int[] arr = {10,2};
        System.out.println(largestNumber(arr));
    }
    public static  String largestNumber(int[] nums) {
     String[] str = new String[nums.length];
     for(int i=0;i< nums.length;i++){
         str[i] = String.valueOf(nums[i]);
     }

        Arrays.sort(str, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                String o1 = a+b;
                String o2 = b+a;
                return o2.compareTo(o1);
            }
        });
     if(str[0].equals("0")){
         return "0";
     }
     StringBuilder ans = new StringBuilder();
     for(String num:str){
         ans.append(num);
     }
     return ans.toString();
    }
}
