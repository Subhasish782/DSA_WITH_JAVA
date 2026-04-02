import java.util.*;

public class phase1 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    // String n=sc.nextLine();
    // *(1)-Take a string input and print its length.
    // System.out.println(n.length());
    // *(2)-Print the first and last character of a string.
    // String n = sc.nextLine();

    // System.out.println(n.charAt(0)); // first character
    // System.out.println(n.charAt(n.length() - 1)); // last character

    // *(3)-Convert all characters of a string to uppercase.
    // String n = sc.nextLine();
    // String up=n.toUpperCase();
    // System.out.println(up);

    // *(4)-Convert all characters of a string to lowercase.
    // String lower=n.toLowerCase();
    // System.out.println(lower);

    // *(5)-Count how many characters (excluding spaces) are in the string.

    // String str=n.replaceAll("\\s","");
    // System.out.println(str.length());

    // int count=0;
    // for(int i=0; i < n.length();i++) {
    //     if(n.charAt(i) != ' ') {
    //         count++;
    //     }
    // }
    // System.out.println(count);

    // *(6)-Count how many words are in a sentence.
    //   int count=1;
    //   for(int i=0; i < n.length();i++) {
    //     if(n.charAt(i) == ' ') {
    //       count++;
    //     }
    //   }
    //   System.out.println(count);
    // }
    // *(7)-Take two strings and print them concatenated.
    // String str1 = sc.nextLine();
    // String str2 = sc.nextLine();

    // System.out.println(str1+str2);

    // ? With string Builder:-

    // String str1 = sc.nextLine();
    // String str2 = sc.nextLine();

    // StringBuilder sb = new StringBuilder();

    // sb.append(str1);
    // sb.append(str2);

    // System.out.println(sb.toString());

    // *(8)-Compare two strings lexicographically (like dictionary order).
    //   String str1=sc.nextLine();
    //   String str2=sc.nextLine();

    //   int n=str1.compareTo(str2);
    //   if(n == 0) {
    //     System.out.println("Strings are equal");
    //   }else if(n > 0) {
    //     System.out.println(str1+" is greater than "+str2);
    //   }else {
    //     System.out.println(str2+" is greater than "+str1);
    //   }

    // *(9)-Print the ASCII value of each character in a string.
    // String str = sc.nextLine();

    // for (int i = 0; i < str.length(); i++) {
    //   char ch = str.charAt(i);
    //   System.out.println(ch + " = " + (int) ch);
    // }

    //*(10)-Check whether the string is empty or not.
    String str=sc.nextLine();
    if(str.isEmpty()){
      System.out.println("String is empty");
    }else {
      System.out.println("String is not empty");
    }
  }
}
