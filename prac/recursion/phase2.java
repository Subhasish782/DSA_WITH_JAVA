public class phase2 {
    //* Count the number of digits in a number recursively:-
    //? digits(n) = 1 + digits(n/10) ----- Formula
    public static int countDigits(int n) {
        if( n == 0) {
            return 0;
        }
        return 1+countDigits(n / 10);
    }
    //*Reverse a number recursively:-
    public static int reverseNum(int n,int rev) {
         if(n == 0) {
            return rev;
         }
         rev=rev * 10 + (n % 10);
         return reverseNum(n / 10,rev);
    }
    public static void main(String args[]) {
        // System.out.println(reverseNum(12345,0));
    }
}