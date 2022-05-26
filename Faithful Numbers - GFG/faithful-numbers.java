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
            int N = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.nthFaithfulNum(N));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    static Long nthFaithfulNum(int n) {
       // code here
       long pow=1;
       long ans=0;
       if((n & 1)==1) ans+=pow;
       n=n>>1;
       while(n!=0){
           pow*=7;
           if((n & 1)==1) ans+=pow;
           n=n>>1;
       }
       return ans;
    }
};