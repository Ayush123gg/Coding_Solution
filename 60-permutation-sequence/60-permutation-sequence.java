class Solution {
    void reverse(int[] arr,int i){
        int j=arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    void nextPermutation(int[] arr){
        if(arr.length<2) return;
        int n=arr.length;
        int ind1=n-2;
        while(ind1>=0&&arr[ind1]>=arr[ind1+1]) ind1--;
        int ind2=n-1;
        while(ind1>=0&&ind2>ind1&&arr[ind1]>=arr[ind2]) ind2--;
        if(ind1>=0){
            int temp=arr[ind1];
            arr[ind1]=arr[ind2];
            arr[ind2]=temp;
        }
        reverse(arr,ind1+1);
    }
    public String getPermutation(int n, int k) {
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=i+1;
        }
        for(int i=1;i<k;i++){
            nextPermutation(arr);
        }
       // return (Arrays.toString(arr).split("[\\[\\]]"))[1];
        StringBuilder str= new StringBuilder();
        for(int i=0;i<arr.length;i++){
            str.append(arr[i]);
        }
        return str.toString();
    }
}