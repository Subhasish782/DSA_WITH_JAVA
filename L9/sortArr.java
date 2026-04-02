import java.util.*;

public class sortArr {

    public static void bubbleSort(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int swap = 0;

            for (int j = 0; j < n - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {
                    // actual swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap++; // increment ONLY on actual swap
                }
            }

            System.out.println("Swaps in pass " + (i+1) + ": " + swap);

            // optimization: stop early if no swaps happened
            if (swap == 0) {
                break;
            }
        }
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Original array:");
        System.out.println(Arrays.toString(arr));

        bubbleSort(arr);

        System.out.println("Sorted array:");
        printArr(arr);
    }
}
