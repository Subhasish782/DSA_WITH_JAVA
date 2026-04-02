import java.util.*;

public class Lev5 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        //*Take coordinates (x, y) and check if the point lies on the X-axis, Y-axis, or at the
        //*origin.

        // System.out.print("Enter the coordinates of x : " +" ");
        // int x =sc.nextInt();

        // System.out.print("Enter the coordinates of y : ");
        // int y =sc.nextInt();

        // if(x == 0 && y == 0 ) {
        //     System.out.println("Lies on origin.");
        // }else if(x == 0) {
        //     System.out.println("Lies on y axis");
        // }else if(y == 0) {
        //     System.out.println("Lies on x axis");
        // }else {
        //     System.out.println("check for this coordinates is not available.");
        // }

        //*Take three numbers and check if they can form a Pythagorean triplet.
        
        // System.out.print("Enter three numbers: ");
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt();

        // boolean isTriplet = false;

        // if (a > b && a > c) {
        //     isTriplet = (a * a == b * b + c * c);
        // } else if (b > a && b > c) {
        //     isTriplet = (b * b == a * a + c * c);
        // } else {
        //     isTriplet = (c * c == a * a + b * b);
        // }

        // if (isTriplet) {
        //     System.out.println("Yes, it is a Pythagorean triplet.");
        // } else {
        //     System.out.println("No, it is not a Pythagorean triplet.");
        // }

        //*Take day and month and check if it forms a valid calendar date (ignoring leap years).

        // System.out.print("Enter day: ");
        // int day=sc.nextInt();

        // System.out.print("Enter month: ");
        // int month=sc.nextInt();

        // if(month < 1 && month > 12) {
        //     System.out.println("invalid month");
        // }else if(day < 1) {
        //     System.out.println("invalid day");
        // }else {
        //     if((month == 1 || month == 3 || month == 5 || month == 7 || 
        //         month == 8 || month == 10 || month == 12) && day <= 31) {
        //             System.out.println("valid date");
        //         }else if((month == 4 || month == 6 || month == 9 || month == 11) && day <= 30) {
        //             System.out.println("valid date");
        //         }else if((month == 2) && day <= 28) {
        //             System.out.println("valid date");
        //         }else {
        //             System.out.println("Invalid date");
        //         }
        // }


      //* Take time (hours and minutes) and print the smaller angle between the hour and
      //*minute hands.

      //*Take three numbers and check if they are in arithmetic progression.

      //?(in A.P : b−a=c−b)

      // int a=sc.nextInt();
      // int b=sc.nextInt();
      // int c=sc.nextInt();

      // if((b-a) == (c-b)) {
      //   System.out.println("The numbers are in A.P");
      // }else {
      //   System.out.println("The numbers are not in A.P");
      // }

      //*Take three numbers and check if they are in geometric progression.

      //?(in G.P : b/a=c/b)

      // int a=sc.nextInt();
      // int b=sc.nextInt();
      // int c=sc.nextInt();

      // if(a == 0 || b == 0) {
      //   System.out.println("Cannot divide by zero");
      // }
      // else if((b/a) == (c/b)) {
      //   System.out.println("The numbers are in G.P");
      // }else {
      //   System.out.println("The numbers are not in G.P");
      // }

      //*Take an integer (1–9999) and check if the sum of its digits is greater than the product
     //*of its digits.

      //  int n = sc.nextInt();

      //   int sum = 0;
      //   int product = 1;

      //   if (n < 10) {
      //       // 1-digit number
      //       sum = n;
      //       product = n;
      //   } 
      //   else if (n < 100) {
      //       // 2-digit number
      //       int a = n / 10;      // tens
      //       int b = n % 10;      // ones
      //       sum = a + b;
      //       product = a * b;
      //   } 
      //   else if (n < 1000) {
      //       // 3-digit number
      //       int a = n / 100;             // hundreds
      //       int b = (n / 10) % 10;       // tens
      //       int c = n % 10;              // ones
      //       sum = a + b + c;
      //       product = a * b * c;
      //   } 
      //   else {
      //       // 4-digit number
      //       int a = n / 1000;            // thousands
      //       int b = (n / 100) % 10;      // hundreds
      //       int c = (n / 10) % 10;       // tens
      //       int d = n % 10;              // ones
      //       sum = a + b + c + d;
      //       product = a * b * c * d;
      //   }

      //   if (sum > product) {
      //       System.out.println("Sum of digits is greater than product");
      //   } 
      //   else if (sum < product) {
      //       System.out.println("Product of digits is greater than sum");
      //   } 
      //   else {
      //       System.out.println("Sum and product of digits are equal");
      //   }

      //* Take two dates (day and month) and determine which one comes first in the
      //*calendar.

      //  //First date
      //   int day1 = sc.nextInt();
      //   int month1 = sc.nextInt();

      //   // Second date
      //   int day2 = sc.nextInt();
      //   int month2 = sc.nextInt();

      //   if (month1 < month2) {
      //       System.out.println("First date comes earlier in the calendar");
      //   } 
      //   else if (month1 > month2) {
      //       System.out.println("Second date comes earlier in the calendar");
      //   } 
      //   else {
      //       // Same month — compare days
      //       if (day1 < day2) {
      //           System.out.println("First date comes earlier in the calendar");
      //       } 
      //       else if (day1 > day2) {
      //           System.out.println("Second date comes earlier in the calendar");
      //       } 
      //       else {
      //           System.out.println("Both dates are the same");
      //       }
      //   }

      //*Take a year and print the corresponding century (e.g., “19th century”, “20th century”.

      int year = sc.nextInt();
      


    }
}