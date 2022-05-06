/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    int findPeakElemt( MountainArray mountainArr){
        int n=mountainArr.length();
        int s=0;
        int e=n-1;
        while(s<e){
            int m=s+(e-s)/2;
            if(mountainArr.get(m)>mountainArr.get(m+1)) e=m;
            else s=m+1;
        }
        return s;
    }
    int OgnesticBSearch(MountainArray mountainArr,int tar,int s,int e){
        int n=mountainArr.length();
       
        boolean b=true;
        if(mountainArr.get(s)<mountainArr.get(e)) b=false;
        if(b==false){
            while(s<=e){
            int m=s+(e-s)/2;
            if(mountainArr.get(m)==tar) return m;
            else if(mountainArr.get(m)>tar) e=m-1;
            else s=m+1;
        }
        }
        else{
            while(s<=e){
            int m=s+(e-s)/2;
            if(mountainArr.get(m)==tar) return m;
            else if(mountainArr.get(m)>tar) s=m+1;
            else e=m-1;
        }
        }
        return -1;
    }
    public int findInMountainArray(int tar, MountainArray mountainArr) {
        int p=findPeakElemt(mountainArr);
        int n=mountainArr.length()-1;
        int t=OgnesticBSearch(mountainArr,tar,0,p);
        //System.out.println(t);
        if(t!=-1){
            return t;
        }
        int q=OgnesticBSearch(mountainArr,tar,p+1,n);
        //System.out.println(q);
        return q;
    }
}