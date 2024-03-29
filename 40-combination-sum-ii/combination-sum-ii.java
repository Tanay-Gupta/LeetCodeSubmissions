class Solution {

    public void walk(List<List<Integer>> list, List<Integer> templist, int a[],int remain, int start){


        if(remain<0) return;
       else if(remain==0) list.add(new ArrayList<>(templist));
       else
       {
        for(int i=start; i<a.length;i++){

            if(i>start&& a[i]==a[i-1]) continue;
            templist.add(a[i]);
            walk(list,templist, a, remain-a[i], i+1);
            templist.remove(templist.size()-1);
        }
       }


    }
    public List<List<Integer>> combinationSum2(int[] a, int target) {
        List<List<Integer>> list=new ArrayList<>();
        Arrays.sort(a);

        walk(list, new ArrayList<>(), a, target, 0);
        return list;

    }
}