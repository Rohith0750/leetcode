class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        HashSet<List<Integer>> ans = new HashSet<>();
        
        for(int i=0;i<n;i++){
            HashSet<Integer> ht = new HashSet<>();
            for(int j=i+1;j<n;j++){
                int th= -(nums[i]+nums[j]);
                if(ht.contains(th)){
                    List<Integer> temp = Arrays.asList(nums[i],nums[j],th);
                    Collections.sort(temp);
                    ans.add(temp);
                }
                ht.add(nums[j]);
            }
        }
        List<List<Integer>> al =new ArrayList<>(ans);
        return al;
    }
}