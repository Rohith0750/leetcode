class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength=Integer.MIN_VALUE;
        int st=0;
        int end=0;
        List<Character> al = new ArrayList<>();
        if(s.length()==0){
            return 0;
        }
        while(end<s.length()){
            if(!al.contains(s.charAt(end))){
                al.add(s.charAt(end));
                end++;
                maxLength=Math.max(maxLength,al.size());
            }else {
                al.remove(Character.valueOf(s.charAt(st)));
                st++;
            }
        }
        return maxLength;
    }
}