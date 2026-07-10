class Solution {
    public boolean rotateString(String s, String goal) {
        int n=s.length();
        if(s.length()!= goal.length()){
            return false;
        }

        StringBuilder str = new StringBuilder(s);
        while(true){
            if(str.toString().equals(goal)){
                return true;
            }
            char ch = str.charAt(0);
            str.deleteCharAt(0);
            str.append(ch);
            n--;
            if(n==0 && !str.toString().equals(goal)){
                break;
            }

        }
        return false;

    }
}