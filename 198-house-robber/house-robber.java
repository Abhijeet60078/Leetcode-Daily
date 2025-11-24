class Solution {
    public int rob(int[] nums) {
        int a=0;
        int b=0;
        for(int i:nums){
            int p=Math.max(a,b+i);
            b=a;
            a=p;

        }
        return a;
    }
}