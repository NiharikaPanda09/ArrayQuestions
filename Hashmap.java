import java.util.*;
import java.util.HashMap;

public class Hashmap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int [] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        HashMap<Integer,Integer> mpp= new HashMap<>();
        for(int i=0;i<n;i++){
            int key = arr[i];
            mpp.put(key,mpp.getOrDefault(key,0)+1);
        }

        int q = sc.nextInt();
        while(q-- >0){
            int num = sc.nextInt();
            System.out.println(mpp.getOrDefault(num,0));
        }
        sc.close();
    }
}
