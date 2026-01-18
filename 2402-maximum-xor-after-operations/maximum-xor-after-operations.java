class Solution {
    public int maximumXOR(int[] nums) {
    
        int exor=0;
        for(int i=0;i<nums.length;i++){
            exor=exor|nums[i];
        }
        return exor;
        
    }
}