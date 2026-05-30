import java.util.*;

public class pracc {

    public static boolean findArmNum(int n) {

        int originalNum = n;
        int sum = 0;
        int temp = n;

        // Count digits
        int digits = String.valueOf(n).length();

        // Find Armstrong sum
        while (temp > 0) {

            int lastD = temp % 10;

            sum += (int)Math.pow(lastD, digits);

            temp /= 10;
        }

        return sum == originalNum;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (findArmNum(n)) {
            System.out.println("Number is Armstrong");
        } else {
            System.out.println("Number is not Armstrong");
        }
    }
}
