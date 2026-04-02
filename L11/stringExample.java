import java.util.*;

public class stringExample {
  public static float shortestPath(String path) {
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

  public static boolean isPalindrome(String str) {
    for (int i = 0; i < str.length() / 2; i++) {
      int n = str.length();
      if (str.charAt(i) != str.charAt(n - i - 1)) {
        return false;
      }
    }
    return true;
  }

  public static String toUpperCase(String str) {
    StringBuilder sb = new StringBuilder("");

    char ch = Character.toUpperCase(str.charAt(0));
    sb.append(ch);

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
  //*compress string:-

  public static String compress(String str) {

    StringBuilder newStr = new StringBuilder("");

    for (int i = 0; i < str.length(); i++) {
      int count = 1;

      while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
        count++;
        i++;
      }

      newStr.append(str.charAt(i));

      if (count > 1) {
        newStr.append(count);
      }
    }

    return newStr.toString();
  }

  public static void main(String args[]) {
    // Scanner sc=new Scanner(System.in);
    // String name;
    // name=sc.nextLine();
    // System.out.println(name);
    // String str="racecar";
    // System.out.println(isPalindrome(str));
    // String path="WNEENESENNN";
    // System.out.println(shortestPath(path));
    // *print largest string
    // String fruits[]={"apple","mango","banana"};
    // String largest=fruits[0];
    // for(int i=0; i < fruits.length;i++) {
    //     if(largest.compareTo(fruits[i]) < 0) {
    //         largest=fruits[i];
    //     }
    // }
    // System.out.println(largest);
    // * String Builder:-

    // StringBuilder sb=new StringBuilder(" ");
    // for(char ch='a';ch <= 'z';ch++) {
    //     sb.append(ch);
    // }
    // System.out.println(sb);
    // 0(n)

    // ? question-4:-
    // String str="hi, i am subh";
    // System.out.println(toUpperCase(str));

    // ? question-5:-
    String str = "aaabbccdd";
    System.out.println(compress(str));
  }
}
