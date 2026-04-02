import java.util.*;
public class sortArr2 {
    public static void selectionSort(int arr[]) {
        for(int i=0;i < arr.length-1;i++) {
            int minPos=i;
            for(int j=i+1; j < arr.length;j++) {
                if(arr[minPos] > arr[j]){
                    minPos=j;
                }
            }
            //swap
            int temp=arr[minPos];
            arr[minPos]=arr[i];
            arr[i]=temp;
        }
    }

    public static void insertionSort(int arr[]) {
        for(int i=1;i < arr.length;i++) {
            int curr=arr[i];
            int prev=i-1;

            while(prev >= 0 && arr[prev] > curr) {
                arr[prev+1]=arr[prev];
                prev --;
            }
            //Insertion
            arr[prev+1]=curr;
        }
    }
    public static void countingSort(int arr[]) {
        
    }
    public static void printArr(int arr[]) {
        for(int i=0; i < arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String args[]) {
        int arr[]={5,4,1,3,2};
        // selectionSort(arr);
        // insertionSort(arr);
        // Arrays.sort(arr,0,3);
        // Arrays.sort(arr,Collections.reverseOrder());
        printArr(arr);
    }
}