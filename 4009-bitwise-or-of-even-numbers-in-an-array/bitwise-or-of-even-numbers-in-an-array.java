class Solution {
    public int evenNumberBitwiseORs(int[] nums) {
        int num=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                num=num|nums[i];
            }
        }
        return num;
        
    }
}