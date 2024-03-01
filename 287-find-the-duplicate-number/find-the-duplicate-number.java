class Solution {
    public int findDuplicate(int[] a) {




    int slow=0;
    int fast=0;

    do{

        slow= a[slow];
        fast= a[a[fast]];
    }
    while(slow!=fast);

    int slow2=0;
    do{
        slow=a[slow];
        slow2=a[slow2];
    }while(slow!=slow2);
    return slow;



    }
}