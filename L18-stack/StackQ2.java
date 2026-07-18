import java.util.Stack;

public class StackQ2 {
  // * Valid ValidParentheses:-
  public static boolean isValid(String str) {
    Stack<Character> s = new Stack<>();

    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);

      // Opening brackets
      if (ch == '(' || ch == '{' || ch == '[') {
        s.push(ch);
      } else {
        // Closing brackets

        if (s.isEmpty()) {
          return false;
        }

        if ((s.peek() == '(' && ch == ')')
            || (s.peek() == '{' && ch == '}')
            || (s.peek() == '[' && ch == ']')) {

          s.pop();
        } else {
          return false;
        }
      }
    }

    if (s.isEmpty()) {
      return true;
    } else {
      return false;
    }
  }

  // *Duplicate Parentheses:-
  public static boolean isDuplicate(String str) {
    Stack<Character> s = new Stack<>();

    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);

      // Closing bracket
      if (ch == ')') {
        int count = 0;

        while (s.peek() != '(') {
          s.pop();
          count++;
        }

        if (count < 1) {
          return true; // Duplicate parentheses found
        } else {
          s.pop(); // Remove opening '('
        }

      } else {
        s.push(ch);
      }
    }

    return false;
  }

  //*Max Rect. Area in Histogram:-

  public static void main(String args[]) {
    // * Valid ValidParentheses:-
    // System.out.println(isValid("()")); // true
    // System.out.println(isValid("()[]{}")); // true
    // System.out.println(isValid("(]")); // false
    // System.out.println(isValid("([)]")); // false
    // System.out.println(isValid("{[]}")); // true

    // *Duplicate Parentheses:-

    // String str1 = "((a+b))";
    // String str2 = "(a+b)";

    // System.out.println(isDuplicate(str1)); // true
    // System.out.println(isDuplicate(str2)); // false

    //*Max Rect. Area in Histogram:-
  }
}
