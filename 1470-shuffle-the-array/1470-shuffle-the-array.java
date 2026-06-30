class Solution {
    public int[] shuffle(int[] nums, int n) {
        ArrayList<Integer> al = new ArrayList<>();
        int left=0;
        int right = n;
        for(int i=0;i<n;i++){
            al.add(nums[left]);
            al.add (nums[right]);
            left++;
            right++;
        }

        int []result= new int[nums.length];
        for(int i=0;i<al.size();i++){
            result[i]=al.get(i);
        }
        return result;
    }
}