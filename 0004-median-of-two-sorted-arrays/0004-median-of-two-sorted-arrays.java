class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int k =nums1.length+nums2.length;
        int n;
        int sum=0;
        int arr[]= new int[k];
        for(int i=0;i<nums1.length;i++){
            arr[i]=nums1[i];
            
        }
        for(int i=0;i<nums2.length;i++){
            arr[nums1.length+i]=nums2[i];
        }
        Arrays.sort(arr);
        if(k%2==0){
            n =k/2;
           double mid =(double)(arr[n]+arr[n-1])/2.0;
            return mid;
        }else{
            n=k/2;
            
            return arr[n] ;
        }
       
    }
}