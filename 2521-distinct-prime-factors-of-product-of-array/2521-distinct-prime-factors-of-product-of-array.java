class Solution {
    public int distinctPrimeFactors(int[] nums) {
        
        Set<Integer> hs = new HashSet<>();
        for(int num : nums){//int k=0;k<nums.length;k++
           // int num = nums[k];
            for(int i=2;i*i<=num;i++){
                if(num%i==0){
                    hs.add(i);
                    while(num%i==0){
                        num=num/i;
                    }
                }
            }
            if(num>1){
                hs.add(num);
            }
        }

        return hs.size();

    }
}