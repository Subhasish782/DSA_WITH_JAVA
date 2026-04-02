import java.util.*;

public class pattern {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);

        //! star pattern:-

        //*(1):-

        // for(int i = 1; i <= 4; i ++) {
        //     for(int j=1 ; j <= i ; j++) {
        //         System.out.print("*"+" ");
        //     }
        //     System.out.println();
        // }

        //*(2)-Inverted star pattern:-

        // int n =sc.nextInt(); //no of lines.

        // for(int i = 1 ; i <= n; i++) {
        //     for(int j=4 ; j >= i ; j--) {
        //         System.out.print("*"+" ");
        //     }
        //     System.out.println();
        // }

        //*(3)-Half pyramid pattern:-

        // for(int i =1 ; i <= 4; i++) {
        //     for(int j=1 ; j <= i ; j++) {
        //         System.out.print(j + " ");
        //     }
        //     System.out.println();
        // }

        //*(4)-Character pattern:-

        int n=4;
        char ch='A';

        for(int i=1;i <= n;i++) {
            for(int j=1;j <= i;j++) {
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }




    }
}