import java.util.*;

public class problem {
    //*Print the number of 7’s that are in the 2d array.
    public static void sevenProblem(int matrix[][],int key) {
        int count=0;
        for(int i=0; i < matrix.length;i++) {
            for(int j=0; j < matrix[0].length;j++) {
                if(matrix[i][j] == key) {
                    count++;
                }
            }
        }
        System.out.println("The count of "+key+" is: "+count);
    }
    //*Print out the sum of the numbers in the second row of the “nums” array.
    public static void sumOfSecondRow(int matrix[][]) {
        int row =1;
        int cols=matrix[0].length;
        int sum=0;

        for(int j=0; j < cols;j++) {
            sum+=matrix[row][j];
        }
        System.out.println("The sum of the 2nd row is: "+sum);
    }
    //*Write a program to Find Transpose of a Matrix.
    public static int[][] tranposeMatrix(int matrix[][]) {

        int row = matrix.length;
        int col = matrix[0].length;

        int transpose[][] = new int[col][row];  // FIXED

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        return transpose;   // FIXED
    }

    public static void printMatrix(int matrix[][]) {
        System.out.println("The matrix is:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        //*1st question:-
        // int arr[][]={
        //     {4,7,8},
        //     {8,8,7}
        // };
        // int key=7;
        // sevenProblem(arr,key);
        //*2nd question:-
        // int matrix[][]={
        //     {1,4,9},
        //     {11,4,3},
        //     {2,2,3}
        // };
        // sumOfSecondRow(matrix);
        //*3rd question:-
        
        int[][] matrix = { {2, 3, 7}, {5, 6, 7} };

        int[][] transposed = tranposeMatrix(matrix);  // FIXED

        printMatrix(transposed);   // FIXED
    }
}