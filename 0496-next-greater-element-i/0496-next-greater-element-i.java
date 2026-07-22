class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int nge[]= new int[m]; 
        Arrays.fill(nge,-1);
        int n=nums2.length;
        for(int k=0;k<m;k++){
            int num=nums1[k];
            for(int i=0;i<n;i++){
                if(num==nums2[i]){
                for(int j=i+1;j<n;j++){
                    if(nums2[j]>nums2[i]){
                        nge[k]=nums2[j];
                        break;
                    }else{
                        nge[k]=-1;
                    }
                }
            }
            }
        }
        return nge;
    }
}