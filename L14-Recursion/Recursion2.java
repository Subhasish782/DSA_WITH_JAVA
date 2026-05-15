public class Recursion2 {
  // *Tilling Problem:-
  public static int tillingProblem(int n) {
    // base case
    if (n == 1 || n == 0) {
      return 1;
    }
    // Vertically Case
    int fnm1 = tillingProblem(n - 1);
    // Horizontally case
    int fnm2 = tillingProblem(n - 2);

    int totWays = fnm1 + fnm2;
    return totWays;
  }

  // *Remove Duplicate in a String :-
  // *Friends Pairing problem:-
  public static int friendsPairing(int n) {
    if (n == 1 || n == 2) {
      return n;
    }
    // Single
    int fnm1 = friendsPairing(n - 1);
    // Pair
    int fnm2 = friendsPairing(n - 2);
    int pairWays = (n - 1) * fnm2;
    // total Ways
    int totWays = fnm1 + pairWays;
    return totWays;
  }

  // *Binary search problem:
  public static void printBinaryStrings(int n, int lastPlace, String str) {
    if (n == 0) {
      System.out.println(str);
      return;
    }
    printBinaryStrings(n - 1, 0, str + "0");
    if (lastPlace == 0) {
      printBinaryStrings(n - 1, 1, str + "1");
    }
  }

  public static void main(String args[]) {
    // int n = 5;
    // System.out.println(tillingProblem(4));
    // System.out.println(friendsPairing(3));
    printBinaryStrings(3,0,"");
  }
}
