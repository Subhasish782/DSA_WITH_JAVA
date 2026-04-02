import java.util.*;

public class Lev4 {
    public static void incStars(int n) {
        for(int i=1;i <= n;i++) {
            for(int j=1; j <= i;j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    public static void rightAlignTri(int n) {
        for(int i=1;i <= n ;i++) {
            //spaces
            for(int j=1; j <= n-i;j++) {
                System.out.print(" "+ " ");
            }
            //stars
            for(int j=1; j <= i;j++) {
                System.out.print("*"+" ");
            }
            System.out.println();

        }
    }

    public static void evenStars(int n) {
        for(int i=1;i <= n ;i++) {
            for(int j = 1; j <= (2*i);j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void oddStars(int n) {
        for(int i=1;i <= n ;i++) {
            for(int j = 1; j <= (2*i)-1;j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void centerdPyramid(int n) {
        for(int i=1;i <= n;i++) {
            for(int j=1;j <= n-i;j++) {
                System.out.print(" "+" ");//spaces
            }
            for(int j = 1;j <= (2*i)-1 ; j++) {
                System.out.print("*"+" ");//stars
            }
            System.out.println();
        }
    }

    public static void spaceAlternate(int n) {
        for(int i=1;i <= n;i++) {
            for(int j=1; j <= (n+i)-1;j++) {
                if((i + j) >= 6 && (i + j) % 2 == 0) {
                    System.out.print("*"+ " ");
                }else {
                    System.out.print("b"+ " ");
                }
            }
            System.out.println();
        }
    }
    public static void incNumbers(int n) {
        for(int i=1;i <= n;i++) {
            for(int j=1;j <= i;j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void numberInc(int n) {
        int count=1;
        for(int i=1;i <= n;i++) {
            for(int j=1;j <= i;j++) {
                System.out.print((count % 10)+" ");
                count ++;
            }
            System.out.println();
        }
    }

    public static void printChar(int n) {
        char ch='A';
        for(int i=1;i <= n;i++) {
            //spaces
            for(int j=1;j <= n-i;j++) {
                System.out.print(" "+" ");
            }
            //char
            for(int j=1;j <= (2*i)-1;j++) {
                System.out.print(ch+" ");
                ch++;
            
            }
            System.out.println();
        }
    }
    public static void symetricalNum(int n) {
        for(int i=1;i <= n;i++) {
            for(int j=1;j <= i;j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    public static void pyramidNum(int n) {
        for(int i=1;i <= n ;i++) {
            //spaces
            for(int j=1;j <= n-i;j++) {
                System.out.print(" "+" ");
            }
            //here we print  numbers in two parts:-
            //Assending order
            for(int j=1 ; j <= i ;j++) {
                System.out.print(j+" ");
            }
            //Decending order:-
            for(int j=i-1 ; j >= 1 ;j--) {
                System.out.print(j+" ");//vvi imp j ->   i-1 to 1.
            }
            System.out.println();
        }
    }
    public static void halfdaimand(int n) {
        //1st half
        for(int i=1; i <= n;i++) {
            for(int j=1; j <= i;j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }

        //2nd half:-
        for(int i=n; i >= 1;i--) {
            for(int j=1; j <= i;j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    public static void starDaimond(int n) {
        //1st half:-
        for(int i=1; i <= n;i++) {
            //spaces
            for(int j=1; j <= n-i;j++) {
                System.out.print(" "+ " ");
            }
            //star
            for(int j=1; j <= (2*i)-1;j ++) {
                System.out.print("*"+ " ");
            }
            System.out.println();
        }
        //2nd half:-
        for(int i=n-1; i >= 1;i--) {
            //spaces
            for(int j=n; j > i ;j--) {
                System.out.print(" "+ " ");
            }
            //star
            for(int j=1; j <= (2*i)-1;j ++) {
                System.out.print("*"+ " ");
            }
            System.out.println();
        }
    }

    public static void numberFiveFourPyramid(int n) {
        //1st half:-
        for(int i=1; i <= n;i++) {
            //spaces:-
            for(int j=1;j <= n-i ;j++) {
                System.out.print(" "+" ");
            }
            //Decending order:-
            for(int j=n; j >= n-i+1;j--) {
                System.out.print(j+" ");
            }
            //Assending order:-
            for(int j= n-i+2; j <= n ;j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        



    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //*squares:-
        // int n=sc.nextInt();

        // for(int i=1;i <=n;i++) {
        //     for(int j=1;j <= n;j++) {
        //         System.out.print("*"+" ");
        //     }
        //     System.out.println();
        // }
        // incStars(5);
        // rightAlignTri(5);
        // evenStars(5);
        // oddStars(5);
        // centerdPyramid(5);
        // spaceAlternate(5);
        // incNumbers(5);
        // numberInc(5);
        // printChar(5);
        // pyramidNum(5);
        // halfdaimand(5);
        // starDaimond(5);
        numberFiveFourPyramid(5);

    }
}