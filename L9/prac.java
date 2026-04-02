import java.util.*;

public class prac {
    public static void bubbleSort(int arr[]) {
        int n=arr.length;
        //*Asending order:-
        // for(int i=0; i < n-1;i++) {
        //     int swap=0;
        //     for(int j=0; j < n-i-1;j++) {
        //         if(arr[j] > arr[j+1]) {
        //             //swap
        //             int temp=arr[j];
        //             arr[j]=arr[j+1];
        //             arr[j+1]=temp;

        //             swap++;
        //         }
        //         if(swap == 0) {
        //             break;
        //         }
        //     }
        // }

        //*Decending order:-
        for(int i=0; i < n-1;i++) {
            int swap=0;
            for(int j=0; j < n-i-1;j++) {
                if(arr[j] < arr[j+1]) {
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                    swap++;
                }
                if(swap == 0) {
                    break;
                }
            }
        }
    }
    public static void selectionSort(int arr[]) {
        for(int i=0;i < arr.length-1;i++) {
            int minPos=i;
            for(int j=i+1; j < arr.length;j++) {
                // if(arr[minPos] < arr[j]) { //For Decending order
                 if(arr[minPos] > arr[j]) {//For ascending order
                    minPos=j;
                }
                //swap
                int temp=arr[minPos];
                arr[minPos]=arr[i];
                arr[i]=temp;
            }
        }
    }
    public static void insertionSort(int arr[]) {
        for(int i=1; i < arr.length;i++) {
            int curr=arr[i];
            int prev=i-1;
            while(prev >= 0 && arr[prev] < curr) {//ascending order(arr[prev] > curr)
                arr[prev+1]=arr[prev];
                prev --;
            }
            //Insertion
            arr[prev+1]=curr;
        }
    }
    public static void printArr(int arr[]) { //Interger for Collections.reverseOrder()
        for(int i=0;i < arr.length;i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int arr[]={5,4,1,3,2};//Here also Interger for Collections.reverseOrder()
        // bubbleSort(arr);
        // selectionSort(arr);
        // insertionSort(arr);
        // Arrays.sort(arr);
        Arrays.sort(arr,Collections.reverseOrder());
        printArr(arr);

    }
}