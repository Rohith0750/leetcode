class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int n =arr.length;
        HashMap<Integer,Integer>hm = new HashMap<>();
        for(int i=0;i<n;i++){
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }

        HashSet<Integer>hs = new HashSet<>();
        boolean isUnique=true;
        for(Integer num:hm.values()){
            if(!hs.add(num)){
                isUnique=false;
                break;
            }
        }
        return isUnique;
    }
}