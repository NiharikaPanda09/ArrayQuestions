import javax.print.DocFlavor;
import java.util.*;
import java.util.Arrays;
import java.util.HashMap;
public class sortString {
    public static void main(String[] args) {

        String order = "cba"; // Example custom order
        String s = "abcd";   // Example string to be sorted
        String sortedString = customSortString(order, s);
        System.out.println("Sorted String: " + sortedString);
    }

    public static  String customSortString(String order, String s) {
        // Convert strings to char arrays for easier manipulation
        char[] orderArray = order.toCharArray();
        char[] sArray = s.toCharArray();

        Map<Character, Integer> map = new HashMap<>();
        for (char c : sArray) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        StringBuilder sorted = new StringBuilder();

        for (char c : orderArray) {
            if (map.containsKey(c)) {
                int fre = map.get(c);
                while (fre > 0) {
                    sorted.append(c);
                    fre--;
                }
                map.remove(c);

            }
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            char c = entry.getKey();
            int freq = entry.getValue();
            if (freq > 0) {
                sorted.append(c);
                freq--;

            }

        }
        return sorted.toString();

    }
}
