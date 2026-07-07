class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        ArrayList<Integer>list = new ArrayList();
        HashMap<Integer,Integer> mpp = new HashMap();
        for(int i=0;i<nums.length;i++){
            mpp.put(nums[i],mpp.getOrDefault(nums[i],0)+1);
        }

        for(Map.Entry<Integer,Integer>entry:mpp.entrySet()){
            if(entry.getValue()>n/3){
                list.add(entry.getKey());
            }
        }
        return list;
    }
}