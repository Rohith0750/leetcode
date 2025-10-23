class Solution {
    public int maxSubArray(int[] num) {
        int ms=Integer.MIN_VALUE;
        int cs =0;

        for(int i=0;i<num.length;i++){
            if(cs+num[i]>num[i]){
                cs=cs+num[i];
            }else{
                cs=num[i];
            }

            if(cs>ms){
                ms=cs;
            }

            
        }
        return ms;
        
    }
}