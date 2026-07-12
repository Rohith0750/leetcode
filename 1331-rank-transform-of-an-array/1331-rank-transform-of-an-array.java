class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int sr[]= new int[arr.length];
        for(int i=0;i<arr.length;i++){
            sr[i]=arr[i];
        }
        Arrays.sort(sr);
        HashMap<Integer,Integer>mp = new HashMap<>();
        int r=1;
        for(int num : sr){
            if(!mp.containsKey(num)){
                mp.put(num,r);
                r++;
            }
        }
        for(int i=0;i<arr.length;i++){
            
            arr[i]=mp.get(arr[i]);
        }
        return arr;
    }
}