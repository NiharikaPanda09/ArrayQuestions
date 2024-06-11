import java.util.*;
public class RepeatingCharacterReplacement {
    public static void main(String[] args) {
          String s = "ABAB";
          int k = 2;
          int res = characterReplacement(s,k);
        System.out.println(res);
    }
    public static int characterReplacement(String s, int k) {
        int [] count = new int[26];
        int left =0;
        int ctC = 0;
        int max_len = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            ctC = Math.max(ctC, ++count[c - 'A']); // Update maxCount and count[c]
            int replace = i - left + 1 - ctC;

            if (replace > k) {
                count[s.charAt(left++) - 'A']--; // Decrease count for the character at left
            }

            max_len = Math.max(max_len, i - left + 1);
        }

        return max_len;
    }
}
