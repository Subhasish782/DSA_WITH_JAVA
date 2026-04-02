import java.util.*;

public class Lev5  {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        //*Print all numbers whose sum of digits is even (1–100).
        // for(int i=1 ; i <= 100;i++) {
        //     if(((i % 10)+(i / 10)) % 2 == 0 ) {
        //         System.out.print(i+" ");
        //     }
        // }

        //*Count how many numbers between 1–500 are divisible by 7 but not by 5.
    //     int count=0;
    //     for(int i=1; i <= 500 ; i++) {
    //         if(i % 7 == 0 && i % 5 != 0) {
    //             count=count+1;
    //         }
    //     }
    //     System.out.println(count);

    //*Print all numbers that are palindromes between 1–500.
    // for (int i = 1; i <= 500; i++) {
    //         int num = i;
    //         int rev = 0;

    //         // reverse the number
    //         while (num > 0) {
    //             int lastDigit = num % 10;
    //             rev = rev * 10 + lastDigit;
    //             num /= 10;
    //         }

    //         // check if palindrome
    //         if (i == rev) {
    //             System.out.print(i + " ");
    //         }
    // }
    //*Print numbers between 1–100 whose digits add up to a multiple of 3.
    // for(int i=1; i <= 100;i++) {
    //     if((i % 10 + i / 10) % 3 == 0 ) {
    //         System.out.print(i+" ");
    //     }
    // }

    //*Find the smallest and largest digit in a given number
    // int n =sc.nextInt();

    // int smallest=9;
    // int largest=0;

    // int temp=n;

    // while(n > 0) {
    //     int digit= n % 10;
    //     if(digit < smallest) {
    //         smallest=digit;
    //     }
    //     if(digit > largest) {
    //         largest=digit;
    //     }

    //     n = n / 10;
    // }
    // System.out.println("Smallest digit in " + temp + " is: " + smallest);
    // System.out.println("Largest digit in " + temp + " is: " + largest);

    //*Print all numbers from 1–n whose binary representation has an even number of 1s.

    //*Print the sum of all odd digits and even digits separately in a number.

        // System.out.print("Enter a number: ");
        // int num = sc.nextInt();

        // int sumEven = 0, sumOdd = 0;

        // while (num > 0) {
        //     int digit = num % 10;
        //     if (digit % 2 == 0)
        //         sumEven += digit;
        //     else
        //         sumOdd += digit;
        //     num = num / 10;
        // }

        // System.out.println("Sum of even digits: " + sumEven);
        // System.out.println("Sum of odd digits: " + sumOdd);
    
    //*Take 5 numbers as input. If the user enters 0, skip it using continue. At the end, print
    //*the sum of all non-zero numbers entered.


        int sum = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter number " + i + ": ");
            int num = sc.nextInt();

            if (num == 0)
                continue; 

            sum += num;
        }

        System.out.println("Sum of all non-zero numbers: " + sum);



    }
}