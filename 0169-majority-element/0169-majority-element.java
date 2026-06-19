class Solution {
    public int majorityElement(int[] arr) {
        int n = arr.length;

        // HashMap<Integer,Integer>mpp=new HashMap<>();
        // for(int i=0;i<n;i++){
        //     mpp.put(arr[i],mpp.getOrDefault(arr[i],0)+1);
        // }

        // for(Map.Entry<Integer,Integer>ent:mpp.entrySet()){
        //     if(ent.getValue()>n/2){
        //         return ent.getKey();
        //     }
        // }
        // return -1;
        int cnt=0;
        int ele=0;
        for(int i=0;i<n;i++){
            if(cnt==0){
                cnt=1;
                ele=arr[i];
            }else if(arr[i] == ele){
                cnt++;
            }
            else{
                cnt--;
            }
        }
        int cnt2=0;
        for(int i=0;i<n;i++){
            if(arr[i]==ele){
                cnt2++;
            }
        }
        if(cnt2>n/2){
            return ele;
        }

    // int n=arr.length;
    // for(int i=0;i<n;i++){
    //     int count =0;
    //     for(int j=0;j<n;j++){
    //         if(arr[i]==arr[j]){
    //             count++;
    //         }
    //         if(count>(n/2)){
    //             return arr[i];
    //         }
    //     }
        
    // }
     return -1;

    }
}