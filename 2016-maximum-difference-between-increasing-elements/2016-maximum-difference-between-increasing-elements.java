class Solution {
    public int maximumDifference(int[] arr) {
        int n=arr.length;
        int sub=0;
        int maxsub=-1;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j>i && arr[i]<arr[j]){
                     sub=arr[j]-arr[i];
                     maxsub=Math.max(maxsub,sub);
                }
            }
        }
        return maxsub;
    }
}