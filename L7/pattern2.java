import java.util.*;

public class pattern2 {
    //*Hollow Rectangle Pattern:-

    public static void hollow_rectangle(int totRows , int totCols) {
        //outer loops
        for(int i=1;i <= totRows;i++) {
            //inner loops
            for(int j=1;j <= totCols;j++) {
                //cell -> (i,j)
                if(i ==1 || i == totRows || j == 1 || j == totCols) {
                    System.out.print("*"+" ");
                }else {
                    System.out.print(" "+" ");
                }
            }
            System.out.println();
        }
    }

    //*inverted and rotated half pyramid pattern:-

    public static void inverted_rotated_half_pyramid(int n) {
        //outer loops:-
        for(int i=1;i <= n;i++) {
            //inner loops:-
            //spaces:-
            for(int j=1; j <= n-i;j++) {
                System.out.print(" "+" ");
            }
            //stars:-
            for(int j=1;j <= i;j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }

    //*Inverted half pyramid with numbers:-

    public static void inverted_half_pyramid_with_numbers(int n) {
        // //outer loops:-
        // for(int i=n;i >= 1;i--) {
        //     //inner loops:-
        //     for(int j=1;j <= i;j++) {
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }
        for(int i=1; i<=n;i++) {
            for(int j=1;j<=n-i+1;j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    //*Floyd's Triangle:-
    public static void floyds_triangle(int n) {
        int counter = 1;
        for(int i=1;i <= n;i++) {
            for(int j=1;j <= i;j++) {
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }

    //* 0-1 Triangle Pattern:-

    public static void zero_one_triangle(int n) {
        for(int i=1;i <= n;i++) {
            for(int j=1;j <= i;j++) {
                if((i+j) % 2 == 0) {
                    System.out.print("1"+" ");
                }else {
                    System.out.print("0"+" ");
                }
            }
            System.out.println();
        }
    }

    //* Butterfly Pattern:-

    public static void Butterfly(int n) {
        //1st half:-
        for(int i=1;i<=n;i++) {
            //inner loops:-
            //stars:-(i)
            for(int j=1;j<=i;j++) {
                System.out.print("*"+" ");
            }
            //spaces:-(2*(n-i))
            for(int j=1;j <= 2*(n-i);j++) {
                System.out.print(" "+" ");
            }
            //stars:-(i)
            for(int j=1;j<=i;j++) {
                System.out.print("*"+" ");
            }
            System.out.println();

        }

        //2nd half:-
        for(int i=n;i >= 1;i--) {
            //inner loops:-
            //stars:-(i)
            for(int j=1;j<=i;j++) {
                System.out.print("*"+" ");
            }
            //spaces:-(2*(n-i))
            for(int j=1;j <= 2*(n-i);j++) {
                System.out.print(" "+" ");
            }
            //stars:-(i)
            for(int j=1;j<=i;j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        
    }

    //*Solid Rhombus Pattern:-
    public static void solid_rhombus(int n) {
        for(int i=1;i<=n;i++) {
            for(int j=1;j <= n-i;j++) {
                System.out.print(" "+" ");
            }
            for(int j=1;j <= n;j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
       }
    }

    //* Hollow Rhombus Pattern:-

    public static void hollow_rhombus(int n) {
        for(int i=1;i <= n;i++) {
            //spaces:-
            for(int j=1;j <= n-i;j++) {
                System.out.print(" "+" ");
            }
            //stars:-
            for(int j=1;j <= n;j++) {
                if(i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*"+" ");
                }else {
                    System.out.print(" "+" ");
                }
            }
            System.out.println();
        }
    }
    //* Daimond Pattern:-
    public static void daimond(int n) {
        //1st half:-
        for(int i=1;i <= n ;i ++) {
            for(int j=1;j <= n-i ;j++) {
                System.out.print(" "+" ");
            }
            for(int j=1;j <= (2*i-1);j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        //2nd half:-
        for(int i=n;i >= 1;i--) {
            for(int j=1;j <= n-i ;j++) {
                System.out.print(" "+" ");
            }
            for(int j=1;j <= (2*i-1);j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
        

    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);

        // hollow_rectangle(4,5);
        // inverted_rotated_half_pyramid(4);
        // inverted_half_pyramid_with_numbers(5);
        // floyds_triangle(5);
        // zero_one_triangle(5);
        // Butterfly(4);
        // solid_rhombus(5);
        // hollow_rhombus(5);
        daimond(5);
    }
}