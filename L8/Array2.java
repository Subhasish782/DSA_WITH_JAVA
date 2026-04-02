import java.util.*;

public class Array2 {
    //*Basic :-
    public static void maxSum1(int num[]) {
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;

        for(int i=0;i < num.length;i++) {
            int start=i;
            for(int j=i;j < num.length;j++) {
                int end=j;
                currSum=0;
                for(int k=start ; k <= end ;k++) {
                    currSum += num[k];
                }
                System.out.println(currSum);
                if(maxSum < currSum ) {
                    maxSum=currSum;
                }
            }
        }
        System.out.println("Max sum : "+maxSum);
    }
    //*prefix sum:-
    public static void prefixSum(int num[]) {
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        int prefix[]=new int [num.length];

        prefix[0]=num[0];
        //calculate prefix array:-
        for(int i=1;i < prefix.length;i++) {
            prefix[i]=prefix[i-1]+num[i];
        }

        for(int i=0;i < num.length;i++) {
            int start=i;
            for(int j=i;j < num.length;j++) {
                int end=j;
                currSum = start == 0 ? prefix[end] : prefix[end]-prefix[start-1];
                
                if(maxSum < currSum ) {
                    maxSum=currSum;
                }
            }
        }
        System.out.println("Max sum : "+maxSum);
    }

    //! Kadane's Algorithim:-(VVVVVI)
    public static void KadanesAlgo(int num[]) {
        int maxSum=Integer.MIN_VALUE;
        int currSum=0;

        for(int i=0; i < num.length;i++) {
            currSum = currSum + num[i];
            if(currSum < 0) {
                currSum=0;
            }
            // maxSum=Math.max(currSum,maxSum);  //its a Math method it is also correct.
            if(maxSum < currSum) {
                maxSum=currSum;
            }
            
        }
        System.out.println("Max sum is : "+maxSum);
    }

    //!Trapping Rain Water problem (VVVI):-

    public static int TrappingRainWater(int height[]) {
        int n =height.length;
        //calculate left maximum value:-

        int leftMax[]=new int[n];
        leftMax[0]=height[0];
        for(int i=1;i < n;i++) {
            leftMax[i]=Math.max(height[i],leftMax[i-1]);
        }
        // System.out.println(leftMax[2]);

        //Calculate right maximum value:-

        int rightMax[]=new int[n];
        rightMax[n-1]=height[n-1];
        for(int i=n-2; i >= 0;i--) {
            rightMax[i]=Math.max(height[i],rightMax[i+1]);
        }

        //loop
        int trappedWater=0;
        for(int i=0;i < n;i++) {
            //WaterLevel count (min of (leftmax boundary,rightmax boundary)):-
            int waterLevel=Math.min(leftMax[i],rightMax[i]);
            //trapped water:-
            trappedWater += waterLevel-height[i];
            // System.out.println(trappedWater);
            
            // System.out.println(trappedWater[i]);
            //*(vvi) here if width is given then {waterLevel-height[i]  * width}.
        }
        return trappedWater;
        //* Time complexity = O(n).


    }

    //!Buy or sell stockes:-
    public static int buySellStockes(int prices[]) {
        int buyPrice=Integer.MAX_VALUE;
        int maxProfit=0;

        //loop
        for(int i=0; i < prices.length;i++) {
            if(buyPrice < prices[i]) {
                int profit=prices[i]-buyPrice;//today profit 
                maxProfit=Math.max(maxProfit,profit);//universal profit 
            }else {
                buyPrice=prices[i];
            }
        }
        return maxProfit;
    }

    public static void main(String args[]) {
        // int num[]={1,-2,6,-1,3};
        // int num[]={-2,-3,4,-1,-2,1,5,-3};
        // maxSum1(num);
        // prefixSum(num);
        // KadanesAlgo(num);

        // int height[]={4,2,0,6,3,2,5};
        // TrappingRainWater(height);

        int prices[]={7,1,5,3,6,4};
        System.out.println(buySellStockes(prices));



        

    }
}