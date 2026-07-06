class Solution {
    public int maximumGap(int[] nums) {
        int max = Integer.MIN_VALUE;
        
       Arrays.sort(nums);
       if(nums.length<=1){
        return 0;
       }
       int n = nums.length-1;
       for(int i=nums.length-1;i>=1;i--){
        int res= nums[i]-nums[i-1];
        max=Math.max(res,max);

       }
       return max;
        
    }
}