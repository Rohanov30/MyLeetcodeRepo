package LeedCodes;

public class maxprofit {

    public int maxstockprofit(int[] arr){
        int min=Integer.MAX_VALUE;
        int profit=0;
        for(int i=0;i<arr.length;i++){
            min=Math.min(arr[i],min);
            profit=Math.max(arr[i]-min,profit);
        }
        return profit;
    }
}
