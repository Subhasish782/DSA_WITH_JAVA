import java.util.*;

public class Lev3 {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);

        //*(1)-Take a 3-digit number and check if all digits are distinct.

        // System.out.println("Enter your three digit number : "+" ");
        // int num=sc.nextInt();

        // if(num >= 100 && num <= 999) {
        //     int a=num / 100;
        //     int b=(num / 10)% 10;
        //     int c=num % 10;

        //     if( a != b && b != c && a != c) {
        //         System.out.println("Numbers are distinct");
        //     }else {
        //         System.out.println("Numbers are not distinct");
        //     }
        // }
        // else {
        //     System.out.println("Your number is not three digit number");
        // }

        //*(2)-Take a 3-digit number and determine if the middle digit is the largest, smallest, or
        //*neither.

        // System.out.println("Enter your three digit number : "+" ");
        // int num=sc.nextInt();

        // if(num >= 100 && num <= 999) {
        //     int a=num / 100;
        //     int b=(num / 10)% 10;
        //     int c=num % 10;

        //     if(b > a && b > c) {
        //         System.out.println("middle digit"+" "+b+" "+"is largest");
        //     }else if (b < a && b < c){
        //         System.out.println("middle digit"+b+"is smallest");
        //     }else {
        //         System.out.println("Neither");
        //     }
        // }
        // else {
        //     System.out.println("Your number is not three digit number");
        // }

        //*(3)- Take a 4-digit number and check if the first and last digits are equal:-

        // System.out.println("Enter your three digit number : "+" ");
        // int num=sc.nextInt();

        // if(num >= 1000 && num <= 9999) {
        //     int a=num / 1000;//Thousands
        //     int b=(num / 100)% 10;//hundreds
        //     int c=(num / 10)% 10;//tens
        //     int d=num % 10;//ones

        //     if(a == d) {
        //         System.out.println("First digit and last digits are equal");
        //     }else {
        //         System.out.println("First digit and last digits are not  equal");
        //     }
            
        // }
        // else {
        //     System.out.println("Your number is not four digit number");
        // }

        //*(4)-Check whether a given integer is single-digit, double-digit, or multi-digit.

        // int num=sc.nextInt();

        // if(num > 0 && num < 10) {
        //     System.out.println("It's a single digit number");
        // }else if (num >= 10 && num <= 99) {
        //     System.out.println("It's a double digit number");
        // }else {
        //     System.out.println("It's a multi digit number");
        // }

        //*(5)-Check if a number is a multiple of 7 or ends with 7.

        // int num=sc.nextInt();

        // if(num % 7 == 0) {
        //     System.out.println("It's a divisible by 7");
        // }else if(num % 10 == 7) {
        //     System.out.println("It's last digit is 7");
        // }else {
        //     System.out.println("not divisible by 7 nor last digit is 7");
        // }

        //*(6)-Take coordinates (x, y) and determine which quadrant the point lies in.

        // System.out.print("Enter x coordinate: ");
        // int x = sc.nextInt();

        // System.out.print("Enter y coordinate: ");
        // int y = sc.nextInt();

        // if(x > 0 && y > 0) {
        //     System.out.print("The point (" + x + ", " + y + ") lies in the First Quadrant.");
        // }else if(x < 0 && y > 0) {
        //     System.out.print("The point (" + x + ", " + y + ") lies in the second Quadrant.");
        // }else if (x < 0 && y < 0) {
        //     System.out.print("The point (" + x + ", " + y + ") lies in the third Quadrant.");
        // }else if (x > 0 && y < 0) {
        //     System.out.print("The point (" + x + ", " + y + ") lies in the fourth Quadrant.");
        // }else if ( x == 0 && y == 0) {
        //     System.out.print("The point (" + x + ", " + y + ") lies on origin.");
        // }else if (x == 0) {
        //     System.out.print("The point  lies on y axis only.");
        // }else {
        //     System.out.print("The point  lies on x axis only.");
        // }

        //*(7)-Check if an amount can be evenly divided into 2000, 500, and 100 currency notes.

        //!“Evenly divided” means — after dividing using these notes, no remainder should be left.

        // System.out.print("Enter the amount: ");
        // int amount=sc.nextInt();

        // // Check if divisible by 100 (lowest note denomination)
        // if(amount % 100 != 0) {
        //     System.out.println("Amount cannot be evenly divided into 2000, 500, and 100 notes.");
        //     return;
        // }

        // int notes2000=amount / 2000;
        // int remaining=amount % 2000;

        // int notes500=remaining / 500;
        // remaining = remaining % 500;

        // int notes100=remaining / 100;
        // remaining = remaining % 100;

        // if(remaining == 0) {
        //     System.out.println("Amount  evenly divided into 2000, 500, and 100 notes.");
        //     System.out.println("2000notes : "+notes2000);
        //     System.out.println("500notes : "+notes500);
        //     System.out.println("100notes : "+notes100);
        // }else {
        //     System.out.println("Amount cannot be evenly divided into 2000, 500, and 100 notes.");
        // }

        //*(8)-Take two angles of a triangle and compute the third angle.

        // System.out.print("Enter first angle: ");
        // int A = sc.nextInt();

        // System.out.print("Enter second angle: ");
        // int B = sc.nextInt();

        // // Check if angles are less than 180 and positive
        // if (A <= 0 || B <= 0 || A + B >= 180) {
        //     System.out.println("Invalid angles for a triangle.");
        // } else {
        //     int C = 180 - (A + B); // Third angle
        //     System.out.println("The third angle is: " + C);
        // }


        //*(9)-Check whether a number is a perfect square (without using the square root function).

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num < 0) {
            System.out.println(num + " is not a perfect square (negative number).");
        } else {
            boolean isPerfectSquare = false;
            for (int i = 0; i * i <= num; i++) {
                if (i * i == num) {
                    isPerfectSquare = true;
                    break;
                }
            }

            if (isPerfectSquare) {
                System.out.println(num + " is a perfect square.");
            } else {
                System.out.println(num + " is not a perfect square.");
            }
        }













    }
}