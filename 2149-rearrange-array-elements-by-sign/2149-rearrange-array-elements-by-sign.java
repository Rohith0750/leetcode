class Solution {
    public int[] rearrangeArray(int[] nums) {
        // ArrayList<Integer> pos = new ArrayList<>();
        // ArrayList<Integer> neg = new ArrayList<>();
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]>0){
        //         pos.add(nums[i]);
        //     }
        // }

        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]<0){
        //         neg.add(nums[i]);
        //     }
        // }
    // for(int i=0;i<nums.length;i++){
    //     if(nums[i]>0){
    //         pos.add(nums[i]);
    //     }else
    //     {
    //         neg.add(nums[i]);
    //     }
    // }
    //     int result[]=new int[nums.length];


    //     int idx=0;
    //     for(int i=0;i<pos.size();i++){
    //         result[idx]=pos.get(i);
    //         idx++;
    //         result[idx]=neg.get(i);
    //         idx++;
    //     }


    //     return result;

    int pos=0;
    int neg=1;
    int ans[] = new int[nums.length];
    for(int i=0;i<nums.length;i++){
        if(nums[i]>0){
            ans[pos]=nums[i];
            pos=pos+2;
        }else{
            ans[neg]=nums[i];
            neg=neg+2;
        }
    }
    return ans;
 
    }
}