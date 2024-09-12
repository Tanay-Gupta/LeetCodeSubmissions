class Solution {
    public boolean search(int[] a, int k) {
        int n = a.length;
        int s = 0, e = n - 1;

        while (s <= e) {

            int m = s + (e - s) / 2;
            if (a[m] == k)
                return true;


            if(a[s]==a[m]&&a[m]==a[e]){//endge case for repeated elements
                s++;
                e--;
                continue;
            }
            if (a[s] <= a[m]) {

                if (a[s] <= k && a[m] >= k)
                    e = m - 1;
                else
                    s = m + 1;

            }
            else
            {
               if (a[m] <= k && a[e] >= k)
                    s = m + 1;
                else
                    e = m - 1;  
            }
        }

        return false;
    }
}