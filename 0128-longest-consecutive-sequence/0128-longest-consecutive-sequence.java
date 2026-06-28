class Solution {
    public int longestConsecutive(int[] nums) {
        // if(nums.length==0){
        //     return 0;
        // }
        // int n = nums.length;
        // Arrays.sort(nums);
        // int lastsmaller=Integer.MIN_VALUE;
        // int longest=1;
        // int currcnt=0;
        // for(int i=0;i<n;i++){
        //     if(nums[i]-1==lastsmaller){
        //         currcnt++;
        //         lastsmaller=nums[i];
        //     }else if(lastsmaller!=nums[i]){
        //         currcnt=1;
        //         lastsmaller=nums[i];
        //     }
        //     longest=Math.max(longest,currcnt);
        // }
        // return longest;

         if (nums.length == 0) {
            return 0;
        }

        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        int longest = 1;

        for (int num : set) {

            // Start only if num is the first element of a sequence
            if (!set.contains(num - 1)) {

                int current = num;
                int count = 1;

                while (set.contains(current + 1)) {
                    current++;
                    count++;
                }

                longest = Math.max(longest, count);
            }
        }

        return longest;

    }
}