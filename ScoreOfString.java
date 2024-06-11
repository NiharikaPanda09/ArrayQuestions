import java.util.*;
public class ScoreOfString {
    public static void main(String[] args) {
               String s = "hello";
               int res = scoreOfString(s);
        System.out.println(res);
    }
    public static int scoreOfString(String s) {
        int total =0;
        for(int i=0;i<s.length()-1;i++){
            total += Math.abs(s.charAt(i)-s.charAt(i+1));
        }
        return total;
    }
}
