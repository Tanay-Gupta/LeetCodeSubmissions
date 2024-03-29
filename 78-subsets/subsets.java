class Solution {


    void walk(List<List<Integer>> list, List<Integer> templist, int a[],int s){

        list.add(new ArrayList<>(templist));
        for(int i=s;i<a.length;i++){
            templist.add(a[i]);
            walk(list,templist,a, i+1);// pick
            templist.remove(templist.size()-1);//not pick
        }

    }
    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> list=new ArrayList<>(); 
        walk(list, new ArrayList<>(), nums,0);
        return list;
        
    }
}