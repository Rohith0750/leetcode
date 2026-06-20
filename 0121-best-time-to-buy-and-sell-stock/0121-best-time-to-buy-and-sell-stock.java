class Solution {
    public int maxProfit(int[] arr) {
        // int maxprofit=0;
        // int bp=Integer.MAX_VALUE;

        // for(int i=0;i<prices.length;i++){
        //     if(bp<prices[i]){
        //         int profit = prices[i]-bp;
        //         maxprofit=Math.max(maxprofit,profit);
        //     }else{
        //         bp=prices[i];
        //     }
        // }
        // return maxprofit;
        int n = arr.length;
        int min=arr[0];
        int maxprofit=0;
        for(int i=0;i<n;i++){
            int cost =arr[i]-min;
            maxprofit=Math.max(maxprofit,cost);
            min=Math.min(min,arr[i]);
        }
            return maxprofit;

    }
    
}