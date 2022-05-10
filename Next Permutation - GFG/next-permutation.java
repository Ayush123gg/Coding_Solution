// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            String a[] = in.readLine().trim().split("\\s+");
            int arr[] = new int[N];
            for(int i = 0;i < N;i++)
                arr[i] = Integer.parseInt(a[i]);
            
            Solution ob = new Solution();
            List<Integer> ans = new ArrayList<Integer>();
            ans = ob.nextPermutation(N, arr);
            StringBuilder out = new StringBuilder();
            for(int i = 0;i < N;i++)
                out.append(ans.get(i) + " ");
            System.out.println(out);
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solution{
    static void reverse(int[] nums,int i){
        int s=i;
        int e=nums.length-1;
        while(s<e){
            nums[s]=nums[s]+nums[e];
            nums[e]=nums[s]-nums[e];
            nums[s]=nums[s]-nums[e];
            s++;e--;
        }
    }
    static int binary(int num[],int i,int j,int key){
        int indx=-1;
        while(i<=j){
            int mid=i+(j-i)/2;
            if(num[mid]<=key){
                j=mid-1;
            }else{
                if(mid<j&&num[mid]==num[mid+1]) i=mid+1;
                else if(mid<j&&num[mid]>=num[mid+1]&&num[mid+1]>key) i=mid+1;
                else{
                    return mid;
                }
            }
        }
        return indx;
    }
  
    static List<Integer> nextPermutation(int N, int nums[]){
        // code here
        if(nums.length<2){
            //List l=new ArrayList<int[]>(Arrays.asList(nums));
            //Collections.addAll(l,nums);
            List<Integer> l=new ArrayList<>();
        for(int num:nums) l.add(num);
            return l;
        }
        int indx1=nums.length-2;
        while(indx1>=0&&nums[indx1]>=nums[indx1+1]) {
            indx1--;
        }
        if(indx1>=0){
            int indx2=nums.length-1;
            /*while(indx2>indx1&&nums[indx2]<=nums[indx1]) indx2--;*/
            indx2=binary(nums,indx1+1,indx2,nums[indx1]);
            nums[indx1]=nums[indx1]+nums[indx2];
            nums[indx2]=nums[indx1]-nums[indx2];
            nums[indx1]=nums[indx1]-nums[indx2];
        }
        reverse(nums,indx1+1);
        List<Integer> l=new ArrayList<>();
        for(int num:nums) l.add(num);
        return l;
    }
}