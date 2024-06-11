import java.util.*;
public class UniquePath {
    public static void main(String[] args) {
        int m = 3;
        int n = 7;
        int res = uniquePaths(m,n);
        System.out.println(res);

    }
    public static int uniquePaths(int m, int n) {
        int [] row = new int[n];
        Arrays.fill(row,1);
        for (int i=0;i<m-1;i++){
            int [] newRow = new int[n];
            newRow[n-1] = 1;
            for(int j=n-2;j>=0;j--){
                newRow[j] = newRow[j+1] + row[j];
            }
            row = newRow;
        }
        return row[0];

    }
}
