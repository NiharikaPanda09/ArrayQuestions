import java.util.*;
public class toLowerCase {
    public static void main(String[] args) {
        String s = "Hello";
        String res = toLowerCase(s);
        System.out.println(res);

    }
    public static String toLowerCase(String s) {
        s = String.valueOf(s.charAt(0)).toLowerCase(Locale.ROOT);
        return s;

    }
}
