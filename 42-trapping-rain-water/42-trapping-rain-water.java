class Solution {
    public int trap(int[] arr) {
        int leftmax[]=new int[arr.length];//use to store left max element for particular index elm
        int rightmax[]=new int[arr.length];//use to store right max elm for particular indx elm
        int lmax=0;
        int rmax=0;
        for(int i=0;i<arr.length;i++){
            if(lmax<arr[i]){
                leftmax[i]=lmax;
                lmax=arr[i];   
            }else{
                leftmax[i]=lmax;
            }
            if(rmax<arr[arr.length-1-i]){
                rightmax[arr.length-1-i]=rmax;
                rmax=arr[arr.length-1-i];
            }else{
                 rightmax[arr.length-1-i]=rmax;
            }
        }
        int sum=0;
        //System.out.println(Arrays.toString(leftmax)+" "+Arrays.toString(rightmax));
        for(int i=0;i<arr.length;i++){
            sum+= (Math.min(leftmax[i],rightmax[i])-arr[i])>0?(Math.min(leftmax[i],rightmax[i])-arr[i]):0;
        }
        return sum;
    }
}