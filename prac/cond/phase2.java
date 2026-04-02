import java.util.*;
public class phase2 {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);

    //*Take three sides and check if they form a valid triangle.

    // double a=sc.nextDouble();
    // double b=sc.nextDouble();
    // double c=sc.nextDouble();

    // if(a+b > c && b+c > a && a+c > b ) {
    //     System.out.println("it's a valid angle");
    // }else {
    //     System.out.println("it's  not a valid angle");
    // }

    //?determine whether it is equilateral, isosceles, or
    //?scalene.

    // if (a == b && b == c ) {
    //     System.out.println("it's a equilateral triangle");
    // }else if (a == b || b == c || c == a ) {
    //     System.out.println("it's a isosceles triangle");
    // }else {
    //     System.out.println("it's a scalene triangle");
    // }

    //* check if one of two given numbers is a multiple of the other.

    // int n1=sc.nextInt();
    // int n2=sc.nextInt();

    // if(n1 == 0 || n2 == 0) {
    //     System.out.println("cannot check mulitiplies with zero.");
    // }else if (n1 % n2 == 0 || n2 % n1 == 0) {
    //     System.out.println("Yes,both numbesr are divisible each other.");
    // }else {
    //     System.out.println("No,both numbesr are  not divisible each other.");
    // }

    //*Take the hour of the day (0–23) and print “Good Morning”, “Good Afternoon”, “Good
   // * Evening”, or “Good Night”.

        // System.out.print("Enter hour of the day (0-23): ");
        // int hour = sc.nextInt();

        // if (hour < 0 || hour > 23) {
        //     System.out.println("Invalid hour! Please enter 0 to 23.");
        // } else if (hour <= 11) {
        //     System.out.println("Good Morning");
        // } else if (hour <= 15) {
        //     System.out.println("Good Afternoon");
        // } else if (hour <= 20) {
        //     System.out.println("Good Evening");
        // } else {
        //     System.out.println("Good Night");
        // }

    //*Take a month number (1–12) and print the number of days in that month (ignore leap
    //*years.

        System.out.print("Enter month number (1-12): ");
        int month = sc.nextInt();

        switch (month) {
            case 1:
                System.out.println("January has 31 days.");
                break;
            case 2:
                System.out.println("February has 28 days (ignoring leap years).");
                break;
            case 3:
                System.out.println("March has 31 days.");
                break;
            case 4:
                System.out.println("April has 30 days.");
                break;
            case 5:
                System.out.println("May has 31 days.");
                break;
            case 6:
                System.out.println("June has 30 days.");
                break;
            case 7:
                System.out.println("July has 31 days.");
                break;
            case 8:
                System.out.println("August has 31 days.");
                break;
            case 9:
                System.out.println("September has 30 days.");
                break;
            case 10:
                System.out.println("October has 31 days.");
                break;
            case 11:
                System.out.println("November has 30 days.");
                break;
            case 12:
                System.out.println("December has 31 days.");
                break;
            default:
                System.out.println("Invalid input! Please enter a number between 1 and 12.");
        }

    }
}