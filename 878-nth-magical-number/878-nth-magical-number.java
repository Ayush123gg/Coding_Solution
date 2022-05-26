class Solution {
    long gcd(long a,long b){
        if(a==0){
            return b;
        }
        return gcd(b%a,a);
    }
    public int nthMagicalNumber(int n, int A, int B) {
        long a=A,b=B;
        long l=(long)Math.min(a,b);
        long h=(long)Math.min(a,b)*n;
        long gcd=gcd(a,b);
        long lcm=(a*b)/gcd;
        while(l<h){
            long mid=l+(h-l)/2;
            if((mid/a)+(mid/b)-(mid/lcm) >=n) h=mid;
            else l=mid+1;
        }
        return (int)(l%(1000000000+7));
    }
}