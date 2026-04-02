public class Lev1 {
    public static int  factorial(int n) {
        int fact=1;
        for(int i=1;i <= n;i++) {
            fact=fact*i;
        }
        return fact;
    }
    public static void main(String[] args) {
        //*(1) Print numbers from 1 to 10 using a for loop:-
        // for (int i = 1; i <= 10; i++) {
        //     System.out.print(i+ " ");
        // }
        System.out.print(factorial(5));
    }
}