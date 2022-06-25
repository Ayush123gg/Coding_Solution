class Solution {
    class pair{
        int val;
        int i;
        pair(int val,int i){
            this.val=val;
            this.i=i;
        }
    }
    public List<List<Integer>> groupThePeople(int[] g) {
        /*Arrays.sort(groupSizes);
        int max=0;
        List<List<Integer>> arr=new ArrayList<List<Integer>>();
        List<pair> p=new ArrayList<>();
        for(int i=0;i<groupSizes.length;i++){
            p.add(new pair(groupSizes[i],i));
        }
        for(int i=0;i<groupSizes.length;i++){
            if(max==0){
                max=groupSizes[i];
                List<Integer> ar=new ArrayList<>();
                ar.add(i);
                arr.add(ar);
            }
            else{
                arr.get(arr.size()-1).add(i);
            }
            max--;
        }
        return arr;*/
        
        
        HashMap<Integer,List<Integer>> hm=new HashMap<>();
        for(int i=0;i<g.length;i++){
            List<Integer> l=hm.getOrDefault(g[i],new ArrayList<>());
            l.add(i);
            hm.put(g[i],l);
        }
        List<List<Integer>> arr=new ArrayList<List<Integer>>();
        
        for(int key:hm.keySet()){
            int i=0;
            List<Integer> l=hm.get(key);
           while(i+key<=l.size()){
                arr.add(l.subList(i,i+key));
                i+=key;
            }
        }
        return arr;
    }
}