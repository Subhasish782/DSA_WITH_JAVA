import java.util.*;

public class Lev2 {
    public static int sumOfDigits(int n) {
        int sum=0;
        while (n > 0) {
            int lastDigit=n % 10;
            sum=sum+lastDigit;
            n=n / 10;
        }
        return sum;
    }
    public static void  perfectNum(int n) {
        int sum=0;
        int originalNum=n;
        for(int i=1;i <= n-1;i++) {
            if(n % i == 0) {
                sum=sum+i;
            }
        }
        if(sum == originalNum) {
            System.out.println("Perfect Number");
        } else {
            System.out.println("Not a Perfect Number");
        }
    }
    public static boolean isPrime(int n) {  
        if(n == 2) { //corner cases
            return true;
        }
        for(int i=2;i <= n-1;i++) {
            if(n % i == 0) {
                return false;
                
            }
        }
        return true;
    }
    
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        //*Palindrome:-

        // int n=sc.nextInt();
        // int rev=0;
        // int original=n;

        // while (n > 0) {
        //     int lastDigit=n % 10;
        //     rev=rev*10 + lastDigit;
        //     n = n / 10;
        // }
        // if(rev == original) {
        //     System.out.println("Palindrome");
        // } else {
        //     System.out.println("Not a Palindrome");
        // }
        
        //* sum of lastDigits :-
       //    System.out.println(sumOfDigits(1234));
      // perfectNum(34);
        System.out.println(isPrime(17));

        
    }
}

