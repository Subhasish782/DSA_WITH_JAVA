import java.util.*;

public class array {
    public static int linearSearch(int numbers[],int key) {
        for(int i=0; i < numbers.length;i++) {
            if(numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }
    public static int getLowest(int num[]) {
        int lowest=Integer.MAX_VALUE; //i alwaus capital
        for(int i=0;i < num.length;i++) {
            if(lowest > num[i]) {
                lowest=num[i];
            }
        }
        return lowest;
    }
    public static int binarySearch(int numbers[],int key) {
        int start=0;
        int end=numbers.length-1;

        while(start <= end) {
            int mid=(start+end) / 2;
            if(numbers[mid] == key) {
                return mid;
            }
            if(numbers[mid] < key) {
                start= mid+1;
            }else {
                end= mid-1;
            }
        }
        return -1;
    }
    public static void printReverse(int num[]) {
        int start=0;
        int end=num.length-1;

        while(start <= end) {
            int temp=num[end];
            num[end]=num[start];
            num[start]=temp;

            start ++;
            end --;
        }
    }
    public static void pairsArray(int num[]) {
        for(int i=0; i < num.length;i++) {
            int curr=num[i];
            for(int j=i+1; j < num.length;j++) {
                System.out.print("("+curr+","+num[j]+")");
            }
            System.out.println();
        }
    }
    public static void printSubArray(int num[]) {
        for(int i=0;i < num.length;i++) {
            int start=i;
            for(int j=i;j < num.length;j++) {
                int end=j;
                for(int k=start; k <= end;k++) {
                    System.out.print(num[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    //*Trapping rain water:-
    
    public static void main(String args[]) {
        //*Linear search:-
        // int numbers[]={2,4,6,8,10,12,14,16};
        // int key=12;

        // System.out.println(linearSearch(numbers,key));
        //*Largest number:-
        // int num[]={9,5,8,2,3,5};
        // System.out.println(getLowest(num));

        //*Binary Search:-

        // int numbers[]={2,4,6,8,10,12,14};
        // int key=14;

        // System.out.println(binarySearch(numbers,key));

        //*Reverse an array:

        // int num[]={2,4,6,8,10,17};
        // printReverse(num);

        // for(int i=0; i < num.length;i++) {
        //     System.out.print(num[i] + " ");
        // }

        //*pairs in array:-
        // int num[]={2,4,6,8,10};
        // pairsArray(num);

        //*SubArray:-
        int num[]={2,4,6,8,10};
        printSubArray(num);





    }
}