import java.util.*;

public class Lev3 {

    public static int factorial(int n){
            int fact=1;

            for(int i=1;i <=n ;i++) {
                fact=fact*i;
            }
            return fact;
    }

    public static void strongNum(int n) {
        //*check strong number or not:-
        int sum=0;
        int original=n;

        while (n > 0) {
            int lastDidgit=n % 10;
            sum =sum + factorial(lastDidgit);
            n=n / 10;
        }

        if(sum == original) {
            System.out.println(original + " is a Strong Number");
        } else {
            System.out.println(original + " is not a Strong Number");
        }
    }

    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);

        //*Find the squares of 1 to n :-

        // int n=sc.nextInt();

        // for(int i=1;i <= n;i++) {
        //     int square=i * i;
        //     System.out.println(i + "² = " + square);
        // }

        //*FInd cube of 1 to n :-

        //  int n=sc.nextInt();

        // for(int i=1;i <= n;i++) {
        //     int cube=i * i * i;
        //     System.out.println(i + "³ = " + cube);
        // }

        //*Print all numbers between a and b divisible by 7.

        // int a=sc.nextInt();
        // int b=sc.nextInt();

        // System.out.println("-------------");

        // for(int i= a ; i <= b; i++) {
        //     if(i % 7 == 0) {
        //         System.out.println(i);
        //     }
        // }  

        // System.out.println(factorial(5));
        strongNum(123);

        

        

        

        
    }
}