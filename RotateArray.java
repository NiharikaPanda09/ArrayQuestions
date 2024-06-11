import java.util.*;
public class RotateArray {
    public static void main(String[] args) {
        int [][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
      rotate(matrix);
        printMatrix(matrix);

    }
    public static void  rotate(int[][] matrix) {
        for(int k=0;k<matrix.length;k++){
            int i=0;
            int j = matrix.length-1;
            while(i<j){
                swap(matrix,i,k,j,k);
                i++;
                j--;
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=i+1;j<matrix.length;j++){
                swap(matrix,i,j,j,i);
            }
        }


    }
     static  void swap(int [][]matrix,int i,int j,int k,int l){
        int  temp = matrix[i][j];
        matrix[i][j] = matrix[k][l];
        matrix[k][l] = temp;

    }
    static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
