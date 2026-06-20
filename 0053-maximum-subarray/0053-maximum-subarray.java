class Solution {
    public int maxSubArray(int[] num) {
        int n =num.length;
        int maxSum=Integer.MIN_VALUE;
        int sum=0;

        for(int i=0;i<n;i++){
            sum =sum+num[i];
            maxSum=Math.max(sum,maxSum);
            if(sum<0){
                sum=0;
            }
        }
        return maxSum;
        

    }
}