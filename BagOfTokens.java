import java.util.*;
public class BagOfTokens {
    public static void main(String[] args) {
        int[] arr = {50, 50, 50, 100};
        int power = 50;
        int res = bagOfTokensScore(arr, power);
        System.out.println(res);

    }

    public static int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int score =0;
        int left =0;
        int right = tokens.length-1;
        while(left<=right){
            if(power >= tokens[left]){
                power -= tokens[left];
                left++;
                score++;
            }else if(score>0 && right > left ){
                power += tokens[right];
                right--;
                score--;
            }else{
                break;
            }
        }
        return score;
    }
}