class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = getNext(n);

        // Continue until fast pointer reaches 1 or fast meets slow (a cycle is detected)
        while (fast != 1 && slow != fast) {
            slow = getNext(slow);
            fast = getNext(getNext(fast));
        }

        return fast == 1;
    }

    // Helper method to compute the sum of the squares of digits
    private int getNext(int n) {
        int totalSum = 0;
        while (n > 0) {
            int digit = n % 10;
            totalSum += digit * digit;
            n /= 10;
        }
        return totalSum;
    }
}