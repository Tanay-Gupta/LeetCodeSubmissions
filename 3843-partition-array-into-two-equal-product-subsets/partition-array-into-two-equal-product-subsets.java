class Solution {
    public boolean checkEqualPartitions(int[] nums, long target) {
      long mul=1;
        for(int i: nums){
            mul*=i;
        }


        return(mul==(target*target));

    }
}