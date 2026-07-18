import java.util.ArrayList;
import java.util.Collections;

public class Arraylist {
    //*Swap Num:-
    public static void swapNum(ArrayList<Integer>list,int idx1,int idx2) {
        int temp=list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2,temp);
    }
    //*Container with most water:-

    public static int storeWater(ArrayList<Integer>height) {
        int maxWater=0;
        int lp=0;
        int rp=height.size()-1;

        while(lp < rp) {
            int ht=Math.min(height.get(lp),height.get(rp));
            int width=rp-lp;
            int currWater=ht * width;
            maxWater=Math.max(maxWater,currWater);

            if( height.get(lp) < height.get(rp) ) {
                lp ++;
            }else {
                rp--;
            }
            
        }
        return maxWater;
    }

    //*Pair sum1:-

    public static boolean pairSum1(ArrayList<Integer>list,int target) {
        int lp=0;
        int rp=list.size()-1;

        while(lp != rp) {
            if(list.get(lp) + list.get(rp) == target) {
                return true;
            }
            if(list.get(lp) + list.get(rp) < target) {
                lp++;
            }else {
                rp--;
            }
        }
        return false;
    }
    //* Pair sum-2 :-
    // public static boolean pairSum2 (ArrayList<Integer>list,int target) {
    //     int bp = -1;
    //     int n=list.size();
    //     for(int i=0; i < list.size();i++) {
    //         if(list.get(i) > list.get(i+1)) {
    //             bp=i;
    //             break;
    //         }
    //     }

    //     int lp=bp+1;
    //     int rp=bp;

    //     while(lp != rp) {
    //         if(list.get(lp) + list.get(rp) == target) {
    //             return true;
    //         }
    //         if(list.get(lp) + list.get(rp) < target) {
    //             lp=(lp+1) % n;
    //         }else {
    //             rp=(n+rp) % n;
    //         }
    //     }
    //     return false;

    // }
    public static boolean pairSum2(ArrayList<Integer> list, int target) {
    int bp = -1;
    int n = list.size();

    // Find the breaking point
    for (int i = 0; i < n - 1; i++) {
        if (list.get(i) > list.get(i + 1)) {
            bp = i;
            break;
        }
    }

    int lp = bp + 1;   // smallest element
    int rp = bp;       // largest element

    while (lp != rp) {
        int sum = list.get(lp) + list.get(rp);

        if (sum == target) {
            return true;
        }

        if (sum < target) {
            lp = (lp + 1) % n;
        } else {
            rp = (n + rp - 1) % n;
        }
    }

    return false;
}
    public static void main(String args[]) {
        // ArrayList<Integer> list=new ArrayList<>();
        //*add operations:-o(1)
        // list.add(1);
        // list.add(2);
        // list.add(3);
        // list.add(4);
        // list.add(5);
        // list.add(2,23);//o(n)

        // System.out.println(list.size());

        //*print the arrylist:-
        // for(int i=0;i < list.size();i++) {
        //     System.out.print(list.get(i)+ " ");
        // }

        //*Get:-o(1)

        // int el=list.get(2);
        // System.out.println(el);

        // //*Delete:-o(n)
        // list.remove(2);
        // System.out.println(list);

        // //*set:-o(n)
        // list.set(2,10);
        // System.out.println(list);

        //*Contains:-o(n)
        // System.out.println(list.contains(10));

        //*Reverse List:-
        // for(int i=list.size()-1;i >= 0;i--) {
        //     System.out.print(list.get(i)+ " ");
        // }
        // System.out.println();

        //*Maximum in an Arraylist:-
        // list.add(2);
        // list.add(5);
        // list.add(9);
        // list.add(6);
        // list.add(8);

        // int max=Integer.MIN_VALUE;

        // for(int i=0 ; i < list.size();i++) {
        //     // if(max < list.get(i)) {
        //     //     max=list.get(i);
        //     // }
        //     max=Math.max(max,list.get(i));
        // }
        // System.out.print("Max element = "+max);

        //*Swap Two numbers:-
        // list.add(2);
        // list.add(5);
        // list.add(9);
        // list.add(3);
        // list.add(6);

        //*Swap:-

        // int idx1=1, idx2=3;
        // System.out.println(list);
        // swapNum(list,idx1,idx2);
        // System.out.println(list);

        //*Sort:-

        // System.out.println(list);
        // Collections.sort(list);
        // System.out.println(list);

        //*Container with most water:-

        // ArrayList<Integer> height=new ArrayList<>();
        
        // height.add(1);
        // height.add(8);
        // height.add(6);
        // height.add(2);
        // height.add(5);
        // height.add(4);
        // height.add(8);
        // height.add(3);
        // height.add(7);

        // System.out.println(storeWater(height));

        //*Pair Sum 1:-

        // ArrayList<Integer>list=new ArrayList<>();

        // list.add(1);
        // list.add(2);
        // list.add(3);
        // list.add(4);
        // list.add(5);
        // list.add(6);

        // System.out.println(pairSum1(list,5));

        //*Pair sum-2 :-

        ArrayList<Integer>list=new ArrayList<>();

        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        int target=16;

        System.out.println(pairSum2(list,target));







        
        


    }
}