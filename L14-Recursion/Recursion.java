import java.util.*;

public class Recursion {
  // *Print Numbers in Decreasing order:-
  public static void printDec(int n) {
    if (n == 1) {
      System.out.print(n);
      return;
    }
    System.out.print(n + " ");
    printDec(n - 1);
  }

  // *Print numbers in Inscresing order:-
  public static void printInc(int n) {
    if (n == 1) {
      System.out.print(n + " ");
      return;
    }
    printInc(n - 1);
    System.out.print(n + " ");
  }
  //*Find the factorial of N:-
  public static int findFact(int n) {
      if(n == 1 | n == 0) {
          return 1;
      }
      int fnm1=findFact(n-1);
      int fn= n * fnm1;
      return fn;
    
  }
  //*Print sum of first N natural numbers:-
  public static int printNnum(int n) {
    if(n == 1) {
      return 1;
    }
    return n + printNnum(n-1);
  }

  //*Print Nth  Fibonacci number:-
  public static int fib(int n) {
    if(n == 0 | n == 1) {
      return n;
    }
    int fnm1=fib(n-1);
    int fnm2=fib(n-2);
    int fn=fnm1 + fnm2;
    return fn;
  }
  //*check if array is sorted or not:-
  public static boolean isSorted(int arr[],int i) {
    if(i == arr.length-1) {
      return true;
    }
    if(arr[i] > arr[i+1]) {
      return false;
    }
    return isSorted(arr,i+1);
  }
  //*First Occurence:-
  public static int firstOccur(int arr[],int key,int i) {
    if(i == arr.length) {
      return -1;
    }
    if(arr[i] == key) {
      return i;
    }
    return firstOccur(arr,key,i+1);
  }
  //*Last Occurence:-
  public static int lastOccur(int arr[],int key,int i) {
    if(i < 0) {
      return -1;
    }
    if(arr[i] == key) {
      return i;
    }
    return lastOccur(arr,key,i-1);
  }
  //*Print x to the power n:-
  //?appproach-1
  public static int power(int x,int n) {
    if(n == 0) {
      return 1;
    }
    return x * power(x,n-1);
  }
  //?optimized apporoach:-
  public static int optimizedPower(int a,int n) {
    if(n == 0) {
      return 1;
    }
    //n is even:-
    int halfPowerSq=optimizedPower(a,n/2) * optimizedPower(a,n/2);
    //n is odd:-
    if(n % 2 != 0) {
      halfPowerSq=a * halfPowerSq;
    }
    return halfPowerSq;
  }

  public static void main(String args[]) {
    int x=2;
    int n=5;
    // int n = 5;
    // int arr[]={8,3,6,9,5,6,4,5};
    // printDec(n);
    // printInc(n);
    //  System.out.print(findFact(n));
    // System.out.println(printNnum(n));
    // System.out.println(fib(n));
    // System.out.println(isSorted(arr,0));
    // System.out.println(firstOccur(arr,6,0));
    // System.out.println(lastOccur(arr,6,arr.length-1));
    // System.out.println(power(2,5));
     System.out.println(optimizedPower(2,5));

    
  }
}
