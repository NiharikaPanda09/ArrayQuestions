import java.util.*;
public class Pow {
    public static void main(String[] args) {
        double x = 2.0000000;
        int n = 10;
        double res = myPow(x,n);
        System.out.println(res);

    }
    public static double myPow(double x, int n) {
        //base case
        if(n == 0){
            return 1.00;
        }
        return Math.pow(x,n);

    }
}
