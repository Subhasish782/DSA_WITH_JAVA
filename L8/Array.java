import java.util.*;

public class Array {
    public static void update(int marks[]) {
        for(int i=0;i < marks.length ;i++) {
            marks[i]=marks[i]+1;
        }
    }
    public static int linearSearch(int numbers[],int key){
        for(int i=0;i < numbers.length;i++) {
            if(numbers[i] == key) {
                return i;
            }
        }
         return -1;
    }
    public static int binarySearch(int numbers[],int key) {
        int start=0 ,  end=numbers.length-1;

        while(start <= end) {
            int mid=(start + end) / 2;

            if(numbers[mid] == key) {
                return mid;
            }
            if(numbers[mid] < key) {
                start=start+1;
            }else {
                end=end-1;
            }
        }
        return -1;
    }
    public static void reverseArray(int numbers[]) {
        int first=0,last=numbers.length-1;

        while(first < last) {
            int temp=numbers[last];
            numbers[last]=numbers[first];
            numbers[first]=temp;

            first++;
            last--;
        }
    }

    public static void printPairs(int numbers[]) {
        int totalPairs=0;
        for(int i=0;i < numbers.length;i++) {
            int curr=numbers[i];
            for(int j=i+1;j < numbers.length;j++) {
                System.out.print("("+curr+","+numbers[j]+")");
                totalPairs++;
            }
            System.out.println();
        }
        System.out.println("Total Pairs :"+totalPairs);
    }

    public static void printSubArray(int numbers []) {
        for(int i=0;i < numbers.length;i++) {
            int start=i;
            for(int j=i;j < numbers.length;j++){
                int end=j;
                for(int k=start; k <= end;k++) {//print
                    System.out.print(numbers[k]+" ");//subarry
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);

        //!Array :-
        //*Array creation:-

        // int marks[]=new int[5];

        // int numbers[]={1,2,3};//3

        // String fruits[]={"apple","cherry","mango"};//3

        //*Input:-

        // int marks[]=new int[100];//input

        // marks[0]=sc.nextInt();
        // marks[1]=sc.nextInt();
        // marks[2]=sc.nextInt();

        // System.out.println("Phy : "+marks[0]);
        // System.out.println("Chem : "+marks[1]);
        // System.out.println("Math : "+marks[2]);

        // marks[2]=marks[2]+1;
        // System.out.println("Math : "+marks[2]);

        //*Passing arrays an argument:-
        // int marks[]={95,96,97};
        // update(marks);

        // for(int i=0;i < marks.length;i++) {
        //     System.out.print(marks[i]+" ");
        // }
        // System.out.println();

        //*Linear Search:-
        // int numbers[]={2,4,6,8,10,12,14,16};
        // int key=10;

        // int index=linearSearch(numbers,key);

        // if(index == -1) {
        //     System.out.println("Not found");
        // }else {
        //     System.out.println("Number found at index :"+index);
        // }

        //*Binary Search:-

        // int numbers[]={2,4,6,8,10,12};
        // int key=8;
        // System.out.println(binarySearch(numbers,key));

        //*Reverse an array:-

        // int numbers[]={2,4,6,8};
        // reverseArray(numbers);

        // for(int i=0; i < numbers.length ;i++) {
        //     System.out.print(numbers[i]+" ");
        // }

        //*Pairs in an Array:-

        // int numbers[]={2,4,6,8,10};
        // printPairs(numbers);

        //* Print subArray:-

        int numbers[]={2,4,6,8,10};
        printSubArray(numbers);






        









        
    }
}