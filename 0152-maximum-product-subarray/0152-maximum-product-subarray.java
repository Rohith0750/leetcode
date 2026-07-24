class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int prod=nums[0];
       
       
        // if(n==1){
        //     return nums[0];
        // }
        //     while(i<n&&j<n){
                
        //         prod=Math.max(prod,nums[i]*nums[j]);
        //             i++;
        //             j++;
        //     }
        for(int i=0;i<n;i++){
            int mul=1;
            for(int j=i;j<n;j++){
                mul*=nums[j];
                prod=Math.max(prod,mul);
            }
        }
        
        return prod;
    }
}