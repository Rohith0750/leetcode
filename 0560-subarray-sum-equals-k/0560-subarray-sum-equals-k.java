class Solution {
    public int subarraySum(int[] nums, int k) {

        int count = 0;

        int prefixsum []= new int[nums.length];
        prefixsum[0] = nums[0];

        for(int i=1;i<prefixsum.length;i++){
            prefixsum[i] = prefixsum[i-1]+nums[i];
        }

        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
               int curr = i==0?prefixsum[j]:prefixsum[j]-prefixsum[i-1];
               if (curr==k){
                count++;
               }
       
            }

        }
       

       return count;
// for betetr time complexity use hashmap to do it 
        
    }
}