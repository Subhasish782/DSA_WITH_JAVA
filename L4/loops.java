import java.util.*;
public class loops {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        //*(1)- While Loop :-
        //    int count=0;

        //    while(count < 5) {
        //         System.out.println("Subh");
        //         count++;
        //    }
        //? Print numbers from 1 to 10:-

        // int num=1;
        // while (num <= 10) {
        //     System.out.println(num);
        //     num ++;
        // }

        //? Print number from 1 to n:-
        // System.out.println("Enter the value of n: ");
        // int n=sc.nextInt();
        // int num=1;
        // while(num <= n) {
        //     System.out.println(num);
        //     num ++;
        // }

        //?Print Sum of N first natural numbers:-

    //     System.out.println("Enter the value of N: ");
    //     int N=sc.nextInt();
    //     int val=1;
    //     int sum=0;

    //     while(val <= N) {
    //         sum=sum+val;
    //         val ++;
    //     }
    //     System.out.println("The sum of first " + N + " natural numbers is: " + sum);
    //? FInd the sum of odd numbers :-

    // int n=5;
    // int val=2;
    // int sum=0;
    // int i =0;

    // if( val % 2 == 0) {
    //     while(i < n ) {
    //         sum=sum+val;
    //         val ++;
    //         i ++;
    //     }
    //     System.out.println(sum);
    // }
//     public class SumOfEvenNumbers {
//     public static void main(String[] args) {
//         int n = 5;      // how many even numbers to sum
//         int val = 2;    // starting even number
//         int sum = 0;    // to store total sum
//         int count = 0;  // how many numbers we’ve added so far

//         while (count < n) {
//             sum = sum + val;  // add the current even number
//             val += 2;         // move to next even number
//             count++;          // increment counter
//         }

//         System.out.println("Sum of first " + n + " even numbers = " + sum);
//     }
// }
    //?Odd:-
   
        // int n = 5;      // how many even numbers to sum
        // int val = 1;    // starting even number
        // int sum = 0;    // to store total sum
        // int count = 0;  // how many numbers we’ve added so far

        // while (count < n) {
        //     sum = sum + val;  // add the current even number
        //     val += 2;         // move to next even number
        //     count++;          // increment counter
        // }

        // System.out.println("Sum of first " + n + " even numbers = " + sum);

        //*(2)-foor loops:-

        // for(int i =1; i <= 3 ; i ++) {
        //     System.out.println("Hello world");
        // }

        //?sum of even numbers:-
        // int val=2;
        // int sum=0;
        // for(int i=0;i <5;i++) { //here i is how many numbers are we want add.
        //     sum=sum+val;
        //     val += 2;
        // }
        // System.out.println(sum);

        //?Print square pattern:-

        // for(int lines=1;lines <= 4 ; lines ++) {
        //     System.out.println(" * * * *");
        // }

     //!vvi:-
     //? Print last digit of a given number:-

    //  System.out.println("Enter your number: ");
    //  int n=sc.nextInt();

    //  while(n > 0) {
    //     int lastDigit=n % 10;
    //     System.out.print(lastDigit+" ");
    //     n=n / 10;
    //  }

    // for(int i=n; i > 0; i /= 10) {
    //     int lastDigit=i % 10;
    //     System.out.print(lastDigit+" ");
    // }

    //?Reverse the given number:-

    // int n=10899;
    // int rev=0;

    // for(int i=n; i > 0; i/=10) {
    //     int lastDigit=i % 10;
    //     rev = (rev * 10) + lastDigit;
    // }
    // System.out.println("Reverse :"+" "+rev);

    //*Do-while Loop:-

    // int counter=1;
    // do{
    //     System.out.println("Hello world");
    //     counter ++;
    // }while(counter <= 10);

    //* break statement:-

    // do {
    //     System.out.println("Enter your number:"+" ");
    //     int n=sc.nextInt();
    //     if(n % 10 == 0) {
    //         break;
    //     }
    //     System.out.println(n);
    // }while(true);

    //*continue:-

    //?Display all numbers entered by user except multiples of 10.

    // do {
    //     System.out.println("Enter your number:"+" ");
    //     int n=sc.nextInt();

    //     if(n % 10 == 0) {
    //         continue;
    //     }
        
    //     System.out.println("number was :"+n);
    // }while(true);

    //?(vvi) check if a number is prime or not :-

    // System.out.println("Enter your number:"+" ");
    // int n=sc.nextInt();
    // boolean isPrime=true;

    // if(n == 2) {
    //     System.out.println("n is prime");
    // }else {
    //     for(int i = 2; i <= n-1 ; i++) { //also used i <= math.sqrt(n)
    //         if(n % i == 0) {
    //             isPrime = false;
    //         }
    //     }
    //         if(isPrime == true) {
    //              System.out.println("n is prime");
    //         }else {
    //              System.out.println("n is not prime");
    //         }
        
    // }
    //?Write a program that reads a set of integers, and then prints the sum of the
    //?even and odd integers.

    // int evenSum=0;
    // int oddSum=0;

    // System.out.println("Enter how many numbers you want to input: "+ " ");
    // int n =sc.nextInt();//how many numbers we want to take input .

    // System.out.println("Enter yours numbers :" + " ");
    // // int num=sc.nextInt();//enter numbers which we want to do some work.

    // for(int i =0;i < n;i++) {
    //     int num=sc.nextInt();//enter numbers which we want to do some work.
    //     if(num % 2 == 0) {
    //         evenSum += num;
    //     }else {
    //         oddSum += num;
    //     }
    // }
    // System.out.println("Sum of even numbers are :" +" "+evenSum);
    // System.out.println("Sum of odd numbers are :" +" "+evenSum);

    //?Write a program to find the factorial of any number entered 
    //?by the user.

    // int fact=1;
    // System.out.println("Eneter your numbers:"+" ");
    // int n=sc.nextInt();

    // for(int i=n;i >= 1 ; i--) {
    //     fact *= i;
    // }
    // System.out.println("factorial of the"+n+"number is: "+fact);

    // }
    // int multi;
    // int n=sc.nextInt();

    // for(int i=1;i <= 10;i++) {
    //     multi=n * i;
    //     System.out.println(n+" "+"*"+" "+i+""+"="+" "+multi);
    // }

    
    // for(int i = 0; i <= 5; i++ ) {
    //    System.out.println("i = " + i );
    // }
    // System.out.println("i after the loop = "+ i );




 }
}