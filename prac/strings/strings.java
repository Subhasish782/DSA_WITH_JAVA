import java.util.*;

public class strings {
  public static boolean isPalindrome(String str) {
    for (int i = 0; i < str.length() / 2; i++) {
      int n = str.length();
      if (str.charAt(i) != str.charAt(n - i - 1)) {
        return false;
      }
    }
    return true;
  }

  public static float getShortestPath(String path) {
    int x = 0;
    int y = 0;
    for (int i = 0; i < path.length(); i++) {
      char dir = path.charAt(i);

      // south
      if (dir == 'S') {
        y--;
      }
      // North
      else if (dir == 'N') {
        y++;
      }
      // west
      else if (dir == 'W') {
        x--;
      }
      // East
      else {
        x++;
      }
    }
    int x2 = x * x;
    int y2 = y * y;
    return (float) Math.sqrt(x2 + y2);
  }

  

  public static String GetToUpperCase(String str) {
    StringBuilder sb = new StringBuilder(" ");
    sb.append(Character.toUpperCase(str.charAt(0)));
    for (int i = 1; i < str.length(); i++) {
      if (str.charAt(i) == ' ' && i < str.length() - 1) {
        sb.append(str.charAt(i));
        i++;
        sb.append(Character.toUpperCase(str.charAt(i)));
      } else {
        sb.append(str.charAt(i));
      }
    }
    return sb.toString();
  }

  public static void main(String args[]) {
    // *(1)-check if a string is plaindrome or not:-
    // String str="noon";
    // System.out.println(isPalindrome(str));
    // *Shortesy Path:-
    // String path = "WWWEEEWSSSS";
    // System.out.println(getShortestPath(path));
    // * ToUppercase :-
    // String str = "hi, i am subh";
    // System.out.println(GetToUpperCase(str));
  }
}
