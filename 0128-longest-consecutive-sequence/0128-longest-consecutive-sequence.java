class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int n = nums.length;
        Arrays.sort(nums);
        int lastsmaller=Integer.MIN_VALUE;
        int longest=1;
        int currcnt=0;
        for(int i=0;i<n;i++){
            if(nums[i]-1==lastsmaller){
                currcnt++;
                lastsmaller=nums[i];
            }else if(lastsmaller!=nums[i]){
                currcnt=1;
                lastsmaller=nums[i];
            }
            longest=Math.max(longest,currcnt);
        }
        return longest;
    }
}