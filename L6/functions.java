import java.util.*;

public class functions {
    public static void printHello() {
        System.out.println("Hello");
    }
    public static int calculateSum(int a ,int b) {
        int sum = a + b;
        return sum;
    }
    public static int multiply(int a , int b) {
        int product= a * b;
        return product;
    }
    public static int factorial(int n) {
        int fact = 1;

        for(int i=1;i<=n;i++) {
            fact=fact * i;
        }
        return fact;//this is my factorial
    }

    public static int binCoeff(int n,int r) {
        int fact_n=factorial(n);
        int fact_r=factorial(r);
        int fact_nmr=factorial(n-r);

        int binom=fact_n/(fact_r*fact_nmr);
        return binom;
    }
    
    public static boolean isPrime(int n) {
        //*Method 1:-
        
        // if(n == 2) { //corner cases
        //     return true;
        // }
        // for(int i=2;i <= n-1;i++) {
        //     if(n % i == 0) {
        //         return false;
                
        //     }
        // }
        // return true;

        //*Method 2:-(optimized)

        if(n == 2) {
            return true;
        }

        for(int i=2; i <= Math.sqrt(n);i++) {
            if(n % i == 0) {
                return false;
            } 
        }
        return true;
    }

    public static void primesInRange(int n) {
        for(int i =2 ;i <= n ;i++) {
            if(isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    //*(vvi)-Binary to decimal conversion:-

    public static void binToDec(int binNum) {
        int pow=0;
        int decNum=0;

        while(binNum > 0) {
            int lastDigit=binNum % 10;

            decNum=decNum + (lastDigit * (int)Math.pow(2,pow));
            pow ++;

            binNum=binNum / 10;
        }
        System.out.println("Decimal number of"+binNum+"is : "+decNum);
    }

    //*(vvi)-Decimal to Binary conversion:-s

    public static void decToBin(int n) {
        int myNum=n;
        int pow=0;
        int binNum=0;

        while(n > 0) {
            int rem= n % 2;

            binNum=binNum + (rem * (int)Math.pow(10,pow));
            pow ++;

            n = n / 2;
        }
        System.out.println("Binary form of "+myNum+" is : "+binNum);
    }


    public static void  main(String args[]) {
        // printHello();//Function call
        //*(1 example):-

        Scanner sc=new Scanner(System.in);
        // int a=sc.nextInt();
        // int b=sc.nextInt();

        // int sum=calculateSum(a,b);
        // System.out.println(sum);

        //* (swap):-

        // int a = 5;
        // int b = 10;

        // int temp = a;
        // a = b;
        // b = temp;

        // System.out.println("a: " + a);
        // System.out.println("b: " + b);

        //* (find product of two numbers):- 
        // System.out.println(multiply(4,5));
        // int prod=multiply(4,6);
        // System.out.println(" a * b = "+ prod);

        // prod=multiply(10,6);
        // System.out.println(" a * b = "+ prod);

        //* Find factorial of a number:-

        // System.out.println("Enter a number to find factorial: ");
        // int n = sc.nextInt();

        // int res=factorial(n);
        // System.out.println("Factorial of "+ n + " is: " + res);

        //*find binomial coefficient:-
        // System.out.println("Enter n and r to find Binomial Coefficient: ");
        // int n = sc.nextInt();
        // int r = sc.nextInt();

        // int result=binCoeff(n,r);
        // System.out.println("Binomial Coefficient C("+ n + "," + r + ") is: " + result);

        //! check number is prime or not:-
        //* Method 1:-
        // System.out.println(isPrime(7));
        // primesInRange(20);//how many numbers are prime.

        //!(vvi)-Binary to decimal conversion:-

        // System.out.println("Enter a binary number: ");
        // int binNum=sc.nextInt();

        // binToDec(binNum);

        //!(vvi)-Decimal to Binary conversion:-

        decToBin(7);





    }
}