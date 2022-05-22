class Solution {
    public int numSubmatrixSumTarget(int[][] matrix, int target) {
        int n=matrix.length;
        int m=matrix[0].length;
        for(int i=0;i<n;i++){
            for(int j=1;j<m;j++){
                matrix[i][j]+=matrix[i][j-1];
            }
        }
        HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
        
        int ans=0;
        for(int start=0;start<m;start++){
            for(int end=start;end<m;end++){
                int sum=0;
                hm.clear();
                hm.put(0,1);
                for(int i=0;i<n;i++){
                    int cur=matrix[i][end];
                    if(start>0){
                        cur-=matrix[i][start-1];
                    }
                    sum+=cur;
                    if(hm.containsKey(sum-target)){
                        ans+=hm.get(sum-target);
                    }
                    hm.put(sum,hm.getOrDefault(sum,0)+1);
                }
            }
        }
        return ans;
    }
}