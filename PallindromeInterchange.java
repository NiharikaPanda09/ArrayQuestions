import java.util.*;
public class PallindromeInterchange {
    public static void main(String[] args) {
          String s = "aab";
        System.out.println(partition(s));
    }
    private static boolean isPallindrome(String s){
        int start = 0;
        int end = s.length()-1;
        for(int i=start;i<end;i++){
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }

            start++;
            end--;
        }
        return true;
    }
    public static List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        recur(result, new ArrayList<>(), s, 0);
        return result;
    }
    private static void recur(List<List<String>> res,List<String> tempList,String s,int begin){
        if(begin == s.length()){
            res.add(new ArrayList<>(tempList));
        }else{
            for(int i=begin;i<s.length();i++){
                if(isPallindrome(s.substring(begin,i+1))) {
                    tempList.add(s.substring(begin, i + 1));
                    recur(res,tempList,s,i+1);
                    tempList.remove(tempList.size()-1);
                }

            }
        }
    }
}
