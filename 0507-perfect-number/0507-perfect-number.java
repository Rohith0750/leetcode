class Solution {
    public boolean checkPerfectNumber(int num) {
        // 1 and negative numbers cannot be perfect numbers
        if (num <= 1) {
            return false;
        }

        int sum = 1; // Start with 1 as it is always a proper divisor for num > 1

        // Loop only up to the square root of num
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                sum += i;
                // Add the complementary divisor if i is not the exact square root
                if (i * i != num) {
                    sum += num / i;
                }
            }
        }

        return sum == num;
    }
}