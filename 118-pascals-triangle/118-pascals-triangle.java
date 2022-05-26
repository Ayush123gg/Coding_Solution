class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> arr=new ArrayList<List<Integer>>();
        ArrayList<Integer> a1=new ArrayList<Integer>();
        ArrayList<Integer> a2=new ArrayList<Integer>();
        a1.add(1);
        arr.add(a1);
        if(numRows==1)
            return arr;
        a2.add(1);
        a2.add(1);
        
        arr.add(a2);
        for(int i=2;i<numRows;i++){
            ArrayList<Integer> temp=new ArrayList<Integer>();
            for(int j=0;j<=i;j++){
                if(j==0||j==i){
                    temp.add(1);
                }
                else{
                    temp.add((int)arr.get(i-1).get(j-1)+(int)arr.get(i-1).get(j));
                }
            }
            arr.add(temp);
        }
        return arr;
    }
}