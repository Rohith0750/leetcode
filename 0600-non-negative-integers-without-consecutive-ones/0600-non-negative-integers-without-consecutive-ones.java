class Solution {
    public int findIntegers(int n) {
        
        // Step 1: Fibonacci DP
        int[] dp = new int[32];
        dp[0] = 1;
        dp[1] = 2;

        for(int i = 2; i < 32; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }

        // Step 2: Traverse bits
        int prevBit = 0;
        int ans = 0;

        for(int i = 30; i >= 0; i--) {

            if((n & (1 << i)) != 0) {

                ans += dp[i];

                if(prevBit == 1) {
                    return ans;
                }

                prevBit = 1;
            } 
            else {
                prevBit = 0;
            }
        }

        return ans + 1;
    }
}