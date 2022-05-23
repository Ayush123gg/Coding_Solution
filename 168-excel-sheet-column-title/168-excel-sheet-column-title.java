class Solution {
    public String convertToTitle(int n) {
        StringBuilder sb=new StringBuilder();  
        while(n>0){
            int rem=(n-1)%26;
            char c=(char)('A'+rem);
            sb.append(c);
            n=(n-1)/26;
        }
        return (sb.reverse()).toString();
    }
}