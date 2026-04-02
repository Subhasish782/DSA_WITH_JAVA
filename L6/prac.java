import java.util.*;

public class prac {
    //*Question 1 : Write a Java method to compute the average
    //*of three numbers.
                               
    public static int calAvg(int a,int b,int c) {
        int avg= (a + b + c) / 3;
        return avg;
    }

    //* check num is even or not:-

    public static boolean isEven(int n) {
        boolean isEven=false;
        if(n % 2 == 0) {
            isEven=true;
        }
        return isEven;
        
    }

    //* find reverse of a number :-

    public static int reverse(int n) {
        int rev=0;
        while(n > 0) {
            int lastDigit=n % 10;
            rev=(rev * 10)+lastDigit;
            n=n / 10;
        }
        return rev;
    }
    //*Write a Java program to check if a number is a palindrome in Java.
    public static boolean checkPalindrome(int n) {
        if (reverse(n) == n) {
            return true;
        }
        return false;
    }
    //*Write a Java method to compute the sum of the digits in an integer.

    public static int sumDigits(int n) {
        int sum=0;
        while (n > 0) {
            int lastDigit=n % 10;
            sum += lastDigit;
            n /= 10;
        }
        return sum;

    }
    public static void main(String args[]) {
        // System.out.println(calAvg(2,4,6));
        // System.out.println(isEven(9));
        // System.out.println(reverse(10899));
        // System.out.println(checkPalindrome(321));
        System.out.println(sumDigits(1234));


    }
} 