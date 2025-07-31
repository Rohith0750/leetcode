class Solution {
    public boolean isPalindrome(int n) {
        int rev_num=0;
        int temp =n;
        while(n>0){
            int last_dig=n%10;
            n=n/10;
            rev_num=(rev_num*10)+last_dig;
        }

        if(rev_num == temp){
            return true;
        }
        else{
            return false;
        }
        
    }
}