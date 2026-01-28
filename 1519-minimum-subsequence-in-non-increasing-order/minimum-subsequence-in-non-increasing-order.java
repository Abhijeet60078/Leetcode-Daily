class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        List<Integer> result=new ArrayList<>();
        int totalSum=0;
        for(int num:nums){
            totalSum+=num;
        }
        Arrays.sort(nums);
        int subSum=0;
        for(int i=nums.length-1;i>=0;i--){
            subSum+=nums[i];
            result.add(nums[i]);
            if(subSum>totalSum-subSum){
                return result;
            }

        }
        return result;



        
    }
}