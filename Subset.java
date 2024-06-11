import java.util.HashMap;

public class Subset {
    public static void main(String[] args) {

    }

    public String isSubset(long a1[], long a2[], long n, long m) {
        if (m > n)
            return "no";

        HashMap<Long, Integer> map = new HashMap<>();
        for (long num : a1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (long num : a2) {
            if (!map.containsKey(num) || map.get(num) <= 0)
                return "no";
            map.put(num, map.get(num) - 1);
        }

        return "yes";


    }
}
