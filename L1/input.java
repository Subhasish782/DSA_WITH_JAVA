import java.util.*;

public class input {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);//here in means input.
        // String input=sc.next();//it will take input until space.
        // System.out.println(input);

        // String name=sc.nextLine();//it will take input until enter.
        // System.out.println(name);

        // int number=sc.nextInt();//it will take integer input.
        // System.out.println(number);

        int radius=sc.nextInt();

        double area1=3.14 * radius * radius;
        float area2=3.14f * radius * radius;//This is a floating value.
        System.out.println(area1);
        System.out.println(area2);
    }
}