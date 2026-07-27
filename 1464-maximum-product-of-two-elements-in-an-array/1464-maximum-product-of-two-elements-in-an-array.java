class Solution {
    public int maxProduct(int[] arr) {
       Arrays.sort(arr);
       int n=arr.length;
        int a = arr[n-1]-1;
        int b=arr[n-2]-1;
        int ans=a*b;
        return ans;
    }
}