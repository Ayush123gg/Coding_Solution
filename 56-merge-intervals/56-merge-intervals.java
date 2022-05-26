class Solution {
    public int[][] merge(int[][] arr) {
        List<List<Integer>> ar=new ArrayList<List<Integer>>();
        Arrays.sort(arr,(a,b)->a[0]-b[0]);
        int n=arr.length;
        for(int i=0;i<n;){
            int min=arr[i][0];
            int max=arr[i][1];
            if(i+1<n&&max>=arr[i+1][0]){
                max=Math.max(arr[i+1][1],max);
                int j=i+1;
                while(j<n-1&&max>=arr[j+1][0]){
                    max=Math.max(arr[j+1][1],max);
                    j++;
                }
                i=j+1;
            }else{
                i++;
            }
            ArrayList<Integer> a=new ArrayList<Integer>();
            a.add(min);
            a.add(max);
            ar.add(a);
        }
        int aa[][]=new int[ar.size()][2];
        for(int i=0;i<aa.length;i++){
            aa[i][0]=ar.get(i).get(0);
            aa[i][1]=ar.get(i).get(1);
        }
        return aa;
    }
}