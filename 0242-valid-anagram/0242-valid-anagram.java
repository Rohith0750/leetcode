class Solution {
    public boolean isAnagram(String s, String t) {
       

        if(s.length()!=t.length()){
            return false;
        }

        char str2[]=s.toCharArray();
        char str3[]=t.toCharArray();

      Arrays.sort(str2);
      Arrays.sort(str3);
      if(Arrays.equals(str2,str3)){
        return true;
      }
    return false;

    }
}