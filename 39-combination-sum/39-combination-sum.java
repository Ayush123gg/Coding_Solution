class Solution {
    void rec(List<List<Integer>> arr,int i,int tar,ArrayList<Integer> ar,int num[]){
        if(i==num.length){
        if(tar==0){
            arr.add(new ArrayList<>(ar));
        }
            return;
        }
        if(num[i]<=tar){
        ar.add(num[i]);
        rec(arr,i,tar-num[i],ar,num);
        ar.remove(ar.size()-1);
        }
        rec(arr,i+1,tar,ar,num);
    }
    void recc(List<List<Integer>> arr,int i,int tar,ArrayList<Integer> ar,int num[]){
        if(i==num.length){
            if(tar==0){
                arr.add(new ArrayList<>(ar));
            }
            return;
        }
        if(num[i]<=tar){
            ar.add(num[i]);
            recc(arr,i,tar-num[i],ar,num);
            ar.remove(ar.size()-1);
        }
        recc(arr,i+1,tar,ar,num);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> arr=new ArrayList<>();
        ArrayList<Integer> ar=new ArrayList<Integer>();
        recc(arr,0,target,ar,candidates);
        return arr;
    }
}