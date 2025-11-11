class Solution {
    public int maxSubArray(int[] nums) {
        int i=0;
        int max=nums[0];
        int currentSum=0;
        for(int num:nums){
            currentSum+=num;
            if(currentSum>max){
                max=currentSum;
            }
            if(currentSum<0){
                currentSum=0;
            }
        }
        return max;


        
    }
}