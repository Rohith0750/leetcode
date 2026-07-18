class Solution {
    public int findGCD(int[] arr) {
        int n = arr.length;
        int gcd=1;
        Arrays.sort(arr);
        int low=arr[0];
        int high=arr[n-1];
        for(int i=1;i<=low;i++){
            if(low%i==0 && high%i==0)
            {
                gcd=i;
            }
        }
        return gcd;
    }
    
}