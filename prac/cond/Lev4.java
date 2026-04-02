import java.util.*;

public class Lev4 {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);

        //*(1)-Take a character and check if it is a letter, a digit, or neither.

        // System.out.println("Enter your character: "+" ");
        // char ch=sc.next().charAt(0);

        // if(Character.isLetter(ch)) {
        //     System.out.println("The input character is a Letter");
        // }else if (Character.isDigit(ch)) {
        //     System.out.println("The input character is a Digit");
        // }else {
        //     System.out.println("Neither");
        // }

        //*(2)-Take a number and print “Fizz” if divisible by 3, “Buzz” if divisible by 5, and
        //* “FizzBuzz” if divisible by both.

        // int n = sc.nextInt();

        // if (n % 3 == 0 && n % 5 == 0){
        //     System.out.println("FizzBuzz");
        // }else if (n % 3 == 0) {
        //     System.out.println("Fizz");
        // }else if (n % 5 == 0) {
        //     System.out.println("Buzz");
        // }else {
        //     System.out.println("n is not divisible by 3 & 5");
        // }

        //*(3)-Take three numbers and print the median value (neither maximum nor minimum).

        // System.out.print("Enter the value of  a : "+ " ");
        // int a =sc.nextInt();

        // System.out.print("Enter the value of  b : "+ " ");
        // int b =sc.nextInt();

        // System.out.print("Enter the value of  c : ");
        // int c =sc.nextInt();

        // if(a >= b && a <= c || a <= b && a >= c) {
        //     System.out.println("median: "+" "+a);
        // }else if(b >=a && b <= c || b <= a && b >= c) {
        //     System.out.println("median: "+" "+b);
        // }else {
        //     System.out.println("median: "+" "+c);
        // }

        //*(4)-Take 24-hour time (hours and minutes) and print whether it is AM or PM.

        // System.out.print("Enter hours (0–23): ");
        // int hours = sc.nextInt();

        // System.out.print("Enter minutes (0–59): ");
        // int minutes = sc.nextInt();

        // if (hours < 0 || hours > 23 || minutes < 0 || minutes > 59) {
        //     System.out.println("Invalid time input.");
        // } else {
        //     if (hours < 12) {
        //         System.out.println("It is AM.");
        //     } else {
        //         System.out.println("It is PM.");
        //     }
        // }

        //*(5)-Take income and age, and check if eligible for tax (age > 18 and income > 5 L).

        //  System.out.print("Enter your Anually income: "+ " ");
        //  int income=sc.nextInt();

        //  System.out.print("Enter your age: "+ " ");
        //  int age=sc.nextInt();

        //  if(income > 500000 && age > 18) {
        //     System.out.println("You are eligible for tax.");
        //  }else {
        //     System.out.println("You are not eligible for tax.");
        //  }

        //*(6)-Take electricity units consumed and calculate the bill as per slabs (using if-else).

        //*(7)- Take a password string and check basic rules (length ≥ 8 and contains at least one
        //*digit).

        System.out.print("Enter password: ");
        String pass = sc.nextLine();

        boolean hasDigit = false;

        // Only using conditional logic (manual check for 0–9)
        if (pass.contains("0") || pass.contains("1") || pass.contains("2") ||
            pass.contains("3") || pass.contains("4") || pass.contains("5") ||
            pass.contains("6") || pass.contains("7") || pass.contains("8") ||
            pass.contains("9")) {
            hasDigit = true;
        }

        if (pass.length() >= 8 && hasDigit) {
            System.out.println("Successfully logged in.");
        } else {
            System.out.println("Password must be at least 8 characters long and contain a digit.");
        }

    



    }
}