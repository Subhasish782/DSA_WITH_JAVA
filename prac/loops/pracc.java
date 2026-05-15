import java.util.*;

public class pracc {
    public static int findArmNum(int n) {
        int originalNum=n;
        // int digits=0;
        int sum=0;
        int temp=n;
        //?count digits:-
        // while(n > 0) {
        //     digits++;
        //     n /= 10;
        // }
        int digits=String.valueOf(temp).length();

        //find armstrong
        temp=n;
        while( temp > 0) {
            int lastD=n % 10;
            sum += Math.pow(lastD,digits);
            temp /= 10;

        }
        return sum;
        if(sum == originalNum) {
            System.out.println("number is Armstrong num");
        }else {
            System.out.println("number is not  Armstrong num");
        }

    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println(findArmNum(153));
        

    }
}