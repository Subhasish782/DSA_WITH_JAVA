public class Recursion2 {
    //* Tilling Problem:-
    public static int tillingProblem(int n) {
        if(n == 0 || n == 1) {
            return 1;
        }
        return tillingProblem(n-1)+tillingProblem(n-2);
    }
    //* Friends Pairing problem :-
    public static int friendsPairingProblem(int n) {
        if(n == 1 || n == 2) {
            return n;
        }
        return friendsPairingProblem(n-1) + (n-1) * friendsPairingProblem(n-2);
    }
    public static void main(String args[]) {
        // System.out.println(tillingProblem(4));
        System.out.println(friendsPairingProblem(5));
    }
}