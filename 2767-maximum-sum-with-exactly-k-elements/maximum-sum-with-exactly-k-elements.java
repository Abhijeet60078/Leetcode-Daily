class Solution {
    public int maximizeSum(int[] nums, int k) {
        Arrays.sort(nums);
        int max=nums[nums.length-1];
        int p=k*max+k*(k-1)/2;
        return p;

        
    }
}