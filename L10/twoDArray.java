import java.util.*;

public class twoDArray {
  public static boolean search(int matrix[][], int key) {
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        if (matrix[i][j] == key) {
          System.out.print("found at cell (" + i + "," + j + ")");
          return true;
        }
      }
    }
    System.out.println("key not found");
    return false;
  }
  //*Spiral Matrix:-
  public static void spiralMatrix(int matrix[][]) {
    int startRow = 0;
    int startCol = 0;
    int endRow = matrix.length - 1;
    int endCol = matrix[0].length - 1;

    while (startRow <= endRow && startCol <= endCol) {
      // top
      for (int j = startCol; j <= endCol; j++) {
        System.out.print(matrix[startRow][j] + " ");
      }
      // right
      for (int i = startRow + 1; i <= endRow; i++) {
        System.out.print(matrix[i][endCol] + " ");
      }
      // bottom
      for (int j = endCol - 1; j >= startCol; j--) {
        if (startRow == endRow) {
          break;
        }
        System.out.print(matrix[endRow][j] + " ");
      }
      // right
      for (int i = endRow - 1; i >= startRow + 1; i--) {
        if (startCol == endCol) {
          break;
        }
        System.out.print(matrix[i][startCol] + " ");
      }

      startRow++;
      startCol++;
      endRow--;
      endCol--;
    }
    System.out.println();
  }

  // public static int daigonalSum(int matrix[][]) {
  //     int sum=0;
  //     int n=matrix.length;
  //     for(int i=0; i < n-1;i++) {
  //         //PD
  //         sum += matrix[i][i];
  //         //SD
  //         if(i != n-1-i) {
  //             sum += matrix[i][n-1-i];
  //         }
  //     }
  //     return sum;
  // }
  //*Diagonal Sum:-
  public static int daigonalSum(int matrix[][]) {
    int sum = 0;
    int n = matrix.length;

    for (int i = 0; i < n; i++) {
      // Primary diagonal
      sum += matrix[i][i];

      // Secondary diagonal (avoid double-counting center in odd n)
      if (i != n - 1 - i) {
        sum += matrix[i][n - 1 - i];
      }
    }
    return sum;
  }
  //*search in sorted matrix:-
  public static boolean staircaseSearch(int matrix[][],int key) {
    int row=0;
    int col=matrix[0].length-1;

    while(row <matrix.length && col >= 0) {
        if(matrix[row][col] == key) {
            System.out.println("found at cell (" + row + "," + col + ")");
            return true;
        }
        else if(key < matrix[row][col]) {
            col--;
        }
        else {
            row++;
        }
    }
    System.out.println("key not found");
    return false;
  }

  //*staircsase search second method:-(using row)

  public static boolean staircaseSearch2(int matrix[][],int key) {
    int n=matrix.length-1;
    int m=0;

    while(n >= 0 && m < matrix[0].length) {
        if(matrix[n][m] == key) {
            System.out.println("found at cell (" + n + "," + m + ")");
            return true;
        }
        else if(key < matrix[n][m]) {
            n--;
        }
        else {
            m++;
        }
    }
    System.out.println("key not found");
    return false;
  }

  public static void main(String args[]) {

    // int matrix[][]=new int [3][3];
    // int n=matrix.length;
    // int m=matrix[0].length;

    // Scanner sc=new Scanner(System.in);

    // for(int i=0; i < n;i++) {
    //     for(int j=0;j < m;j++){
    //         matrix[i][j]=sc.nextInt();
    //     }
    // }
    int matrix[][] = {
      {10,20,30,40},
      {15,25,35,45},
      {27,29,37,48},
      {32,33,39,50}
    };

    // print 2D array
    // for(int i=0; i < n;i++) {
    //     for(int j=0;j < endCol;j++){
    //         System.out.print(matrix[i][j]+" ");
    //     }
    //     System.out.println();
    // }
    // search(matrix,5);
    // spiralMatrix(matrix);
    // System.out.print(daigonalSum(matrix));
    System.out.print(staircaseSearch(matrix,39));
  }
}
