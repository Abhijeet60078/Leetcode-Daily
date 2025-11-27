class Solution {
    public int singleNumber(int[] nums) {
        int a=nums.length;
        int x=0;
        for(int i=0;i<a;i++){
            x=x^nums[i];
        }
        return x;

        
    }
}