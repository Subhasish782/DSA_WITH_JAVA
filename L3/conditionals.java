import java.util.*;

public class conditionals {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        //* (1)if-else :-

        // int age=sc.nextInt();

        // if(age >= 18) {
        //     System.out.println("You can vote");
        // }else {
        //     System.out.println("not adult");
        // }

        //? print the largest of two numbers:-

        // int a=1;
        // int b=3;

        // if(a > b) {
        //     System.out.println("a is largest");
        // if (a == b) {
        //     System.out.println("a and b are equal");
        // }
        // }else {
        //     System.out.println("b is largest");
        // }

        //? print if number is even or odd :-

        // int n=sc.nextInt();

        // if(n % 2 == 0) {
        //     System.out.println("number is even");
        // }else {
        //     System.out.println("number is odd");
        // }

        //*(2) else if :-

        //? Income tax Calulator:-

        // int income=sc.nextInt(); 
        // int tax;

        // if(income < 400000) {
        //     tax=0;
        // }else if (income >= 400000 && income < 800000) {
        //     tax=(int)(income * 0.05);   
        // }else if (income >= 800000 && income < 1200000) {
        //     tax=(int)(income * 0.1);    
        // }else if (income >= 1200000 && income < 1600000) {
        //     tax=(int) (income * 0.15); 
        // }else if (income >= 1600000 && income < 2000000) {
        //     tax=(int) (income * 0.2);
        // }else if (income >= 2000000 && income < 2400000) {
        //     tax=(int) (income * 0.25);
        // }else {
        //     tax=(int) (income * 0.3);
        // }
        // System.out.println("The tax is: " + tax);

        //*(3) Ternary operator :-
        //syntax
        //! varibale : condition ? expression1 : expression2;

        //* calculator in switch case :-
        System.out.println("Enter a: ");
        int a=sc.nextInt();

        System.out.println("Enter b: ");
        int b=sc.nextInt();
        
        System.out.println("Enter operator: ");
        char operator=sc.next().charAt(0);
        

        switch(operator) {
            case '+' : System.out.println(a + b);
                       break;
            case '-' : System.out.println(a - b);
                       break;
            case '*' : System.out.println(a * b);
                       break;
            case '/' : System.out.println(a / b);
                       break;
            case '%' : System.out.println(a % b);
                       break;
            default  : System.out.println("Invalid operator");
        }

    }
}