class Solution {
    public int[] twoSum(int[] arr, int k) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int req=k-arr[i];
            if(mp.containsKey(req)){
                return new int[] {mp.get(req),i};
            }
            mp.put(arr[i],i);
        }
        return new int[] {-1,-1};
    }
}