class Solution {
    public int[][] merge(int[][] a) {
        List<int[]> arr=new ArrayList<>();
       /* if(a.length==0||a==null){
            arr.toArray(new int[0][]);//empty 2d array
        }*/
        Arrays.sort(a,(x,y)-> x[0]-y[0]);
        int s=a[0][0];
        int l=a[0][1];
        for(int []t:a){
            if(t[0]<=l){
                l=Math.max(l,t[1]);
            }
            else{
                arr.add(new int[]{s,l});
                s=t[0];
                l=t[1];
            }
        }
        arr.add(new int[]{s,l});
       // return arr.toArray(int int[0][]);
        int aa[][]=new int[arr.size()][];
        int p=0;
        for(int[] aaa:arr){
            aa[p++]=aaa;
        }
        return aa;
    }
}