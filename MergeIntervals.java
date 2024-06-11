import java.util.*;
public class MergeIntervals {
    public static void main(String[] args) {
        int [][] arr = {
                {1,3},
                {2,6},
                {8,10},
                {15,18}
        };
        int [][]res = merge(arr);
        System.out.println(Arrays.deepToString(res));

    }
    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        List<int[]> merged = new ArrayList<>();
        merged.add(intervals[0]);

        for(int i=1;i<intervals.length;i++){
            int[] currentInterval = intervals[i];
            int [] lastInterval = merged.get(merged.size()-1);

            if(currentInterval[0] <= lastInterval[1]){
                lastInterval[1] = Math.max(lastInterval[1],currentInterval[1]);
            }else{
                merged.add(currentInterval);
            }
        }
        return merged.toArray(new int[merged.size()][]);


    }
}
