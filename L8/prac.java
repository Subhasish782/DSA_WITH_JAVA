import java.util.*;

public class prac {
    //*Question 1:Distint array.
    public static boolean distinctArray(int num[]) {
        for(int i=0; i < num.length;i++) {
            for(int j=i+1; j < num.length;j++) {
                if(num[i] == num[j]) {
                    return true;
                }
            }
        }
        return false;
    }
    //*Question2:
    public static int  profit(int prices[]) {
        int n=prices.length;
        int profit=0;
        int maxProfit=0;
        int buyPrice=Integer.MAX_VALUE;//+i infinity

        for(int i=0;i < n;i++) {
            if(buyPrice < prices[i]){
                profit=prices[i]-buyPrice;
                maxProfit=Math.max(profit,maxProfit);
            }else {
                buyPrice=prices[i];
            }
        }
        return maxProfit;

    }
    //*3
    public static int trappedWater(int height[]){
        int n=height.length;

        int leftMax[]=new int[n];
        leftMax[0]=height[0];
        for(int i=1; i < n ;i++){
            leftMax[i]=Math.max(leftMax[i-1],height[i]);
        }

        int rightMax[]=new int[n];
        rightMax[n-1]=height[n-1];
        for(int i=n-2;i >= 0;i--){
            rightMax[i]=Math.max(rightMax[i+1],height[i]);
        }

        int trap=0;
        for(int i=0; i < n;i++) {
            int waterLevel=Math.min(leftMax[i],rightMax[i]);
            trap=trap+waterLevel-height[i];
        }
        return trap;

    }
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        //*2
        // System.out.println("Enter the array size : ");
        // int n=sc.nextInt();
        // int prices[]=new int[n];
        // for(int i=0 ; i < n ;i++) {
        //     prices[i]=sc.nextInt();
        // }
        // // System.out.println(distinctArray(num));
        // // System.out.println(profit(prices));
        // int res=profit(prices);
        // System.out.println("Profit = "+res);

        //*3
        int n=sc.nextInt();
        int height[]=new int[n];
        for(int i=0; i < n;i++) {
            height[i]=sc.nextInt();
        }
        int trapW=trappedWater(height);
        System.out.println("Total trapped water= "+trapW);

        
        
    }
}