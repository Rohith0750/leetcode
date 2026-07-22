class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n =nums.length;
        int nge[] = new int[n];
        Arrays.fill(nge,-1);
        for(int i=0;i<n;i++){
            for(int j=i+1;j<i+n;j++){
                if(nums[j%n]>nums[i]){
                    nge[i]=nums[j%n];
                    break;
                 }
            }
        }
        return nge;
// int n = nums.length;
//         int[] nge = new int[n];
//         Arrays.fill(nge, -1);
//         Stack<Integer> stack = new Stack<>();

//         // Iterate through the array twice virtually (2n - 1 down to 0)
//         for (int i = 2 * n - 1; i >= 0; i--) {
//             int index = i % n;//circular 

//             while (!stack.isEmpty() && stack.peek() <= nums[index]) {
//                 stack.pop();
//             }

//             if (i < n && !stack.isEmpty()) {
//                 nge[index] = stack.peek();
//             }

//             stack.push(nums[index]);
//         }
//         return nge;
    }
}