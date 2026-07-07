class Solution {
    public long sumAndMultiply(int n) {
        if(n==0){
            return 0;
        }
        long sum=0;
        String s = String.valueOf(n);
        StringBuilder sb= new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch!= '0'){
                sb.append(ch);
                sum+=(ch-'0');
            }
        }
        String res=sb.toString();
        long resint=Long.parseLong(res);
        return resint*sum;

        
    }
}