class Solution {

    boolean isPrime(long n){

        if(n==1) return false;

        for(int i=2;i<=Math.sqrt(n);i++){if(n%i==0) return false;} return true;
    }
    public long sumOfLargestPrimes(String s) {

        // 1. finding all subsequence

        TreeSet<Long> q = new TreeSet<>(Collections.reverseOrder());

        for (int i = 0; i < s.length(); i++) {
            StringBuffer ns = new StringBuffer();
            for (int j = i; j < s.length(); j++) {

                ns.append(s.charAt(j));
                q.add(Long.parseLong(new String(ns)));


            }
        }
        int found =0;
        long sum=0;

        for(long i:q){
            if(found==3)break;
            if(isPrime(i)){
                found++;
                sum+=i;
            }

        }
       
        return sum;

    }
}