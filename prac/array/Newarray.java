import java.util.*;

public class Newarray {
    public static int binarySearch(int arr[],int key) {
        int start=0;
        int end=arr.length-1;

        while(start <= end) {
            int mid=(start + end )/ 2;
            if(arr[mid] == key) {
                return mid;            
            }if(arr[mid] < key) {
                start=mid+1;
            }else {
                end=mid-1;
            }
        }
        return -1;
    }
    public static void printReverse(int arr[]) {
        int first=0;
        int last=arr.length-1;
 
        while(first <= last) {
            int temp=arr[last];
            arr[last]=arr[first];
            arr[first]=temp;

            first ++;
            last --;
        }
    }
    public static int totPairs(int arr[]) {
        int totalPairs=0;
        for(int i=0; i <= arr.length-1;i++) {
            
            for(int j=i+1; j <= arr.length-1;j++) {
                totalPairs ++;
            }
        }
        return totalPairs;
    }
    public static void printSubArray(int arr[]) {
        for(int i=0; i <= arr.length-1;i++) {
            int start=i;
            for(int j=i; j <= arr.length-1;j++) {
                int end=j;
                for(int k=start; k <= end;k++) {
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        // int arr[]={2,4,6,8,10,12,14};
        // int key=10;
        // // binarySearch(arr,key);
        // System.out.println(binarySearch(arr,key));

        // int arr[]={2,4,6,8,10};
        // printReverse(arr);
        // for(int i=0; i <= arr.length-1;i++) {
        //     System.out.print(arr[i]+" ");
        // }
        int arr[]={2,4,6,8,10};
        printSubArray(arr);
    }
}