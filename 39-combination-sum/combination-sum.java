class Solution {

    void walk(List<List<Integer>> list, List<Integer> templist, int a[], int remain, int start) {

            if(remain<0) return;

            else if(remain==0) list.add(new ArrayList<>(templist));
            else
            {
                for(int i=start;i<a.length;i++){
                    templist.add(a[i]);
                    walk(list,templist, a, remain-a[i],i);// i because we want repeatation
                    templist.remove(templist.size()-1);
                }
            }
    }

    public List<List<Integer>> combinationSum(int[] a, int target) {


        List<List<Integer>> list=new ArrayList<>();

        walk(list, new ArrayList<>(),a, target, 0);
        return list;

    }
}