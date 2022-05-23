// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");
            
            Long L = Long.parseLong(S[0]);
            Long R = Long.parseLong(S[1]);

            Solution ob = new Solution();
            System.out.println(ob.count3DivNums(L,R));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    static boolean calDivisors(long a){
        long sum=0,c=0;
        //if((int)Math.sqrt(a)*(int)Math.sqrt(a)==a)return 0; //perfect square root have odd divisor
        for(long i=1;i<=Math.sqrt(a);i++){
            if(a%i==0){
                sum+=(i);
                if(a/i!=i){
                sum+=(a/i);
                c+=2;
                }else{
                c++;
                }
            }
        }
        return c==3?true:false;
    }
    static boolean isPrime(long a){
        long l=(long)Math.sqrt(a);
        if(a==1)return false;
        if(a==2) return true;
        for(int i=2;i<=l;i++){
            if(a%i==0) return false;
        }
        return true;
    }
    static int count3DivNums(Long L, Long R) {
        // code here
        int c=0;
        L=(long)Math.sqrt(L)+1;
        R=(long)Math.sqrt(R);
        for(long i=L;i<=R;i++){
            if(isPrime(i)) c++;
        }
        return c;
    }
};