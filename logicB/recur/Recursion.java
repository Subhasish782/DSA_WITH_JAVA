public class Recursion {
  // *power:-
  public static int power(int a, int n) {
        if(n == 0) {
            return 1;
        }
        int halfPower=power(a,n/2);
        int halfPowerSq=halfPower * halfPower;

        if(n % 2 != 0) {
            return a * halfPowerSq;
        }
        return halfPowerSq;
  }

  //* Check if array is sorted or not :-
  public static boolean isSorted(int arr[],int i) {
    if(i == arr.length-1) {
        return true;
    }
    if(arr[i] > arr[i+1]) {
        return false;
    }
    return isSorted(arr,i+1);
  }

  //*Print Even:-
  public static void printEven(int n) {
    if(n == 0) {
        return;
    }
    if(n % 2 == 0) {
        System.out.print(n + " ");
    }
    printEven(n-1);
  }

  //* print odd:-
  public static void printOdd (int n) {
    if(n == 1) {
        return ;
    }
    if(n % 2 != 0) {
        System.out.print(n+" ");
    }
    printOdd(n-1);
  }
  //*Print Fibonacci series up to n terms recursively:-
  public static int fib(int n) {
    if(n == 0 || n == 1) {
        return n;
    }
    return fib(n-1)+fib(n-2);
  }

  //*Find sum of digits of a number recursively:-
  public static int sumOfDigits(int n) {
    if(n == 0) {
        return 0;
    }
    return n % 10 + sumOfDigits(n / 10);
  }
  public static void main(String args[]) {
    // System.out.println(power(2,5));
    // int arr[]={1,3,2,4,5};
    // System.out.println(isSorted(arr,0));
    // printEven(10);
    // printOdd(10);
    // int n=5;
    // for(int i =0; i <  n;i++) {
    //     System.out.print(fib(i)+ " ");
    // }
    int n=2033;
    System.out.println(sumOfDigits(n));
  }
}
