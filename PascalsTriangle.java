import java.util.*;
public class PascalsTriangle {
    public static void main(String[] args) {
        int numRow = 5;
        System.out.println(generate(numRow));

    }
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1); // First and last element of each row is 1
                } else {
                    // Calculate the value based on the previous row
                    int value = triangle.get(i - 1).get(j - 1) + triangle.get(i - 1).get(j);
                    row.add(value);
                }
            }
            triangle.add(row);
        }

        return triangle;

    }
}
