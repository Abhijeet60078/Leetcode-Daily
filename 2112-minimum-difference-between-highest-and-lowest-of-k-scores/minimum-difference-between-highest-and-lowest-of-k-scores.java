class Solution {
    public int minimumDifference(int[] nums, int k) {
        if (k == 1) {
            return 0;
        }
        Arrays.sort(nums);
        int minDiff = nums[k - 1] - nums[0];
        for (int i = 1; i <= nums.length - k; i++) {
            int currentDiff = nums[i + k - 1] - nums[i];
            if (currentDiff < minDiff) {
                minDiff = currentDiff;
            }
        }

        return minDiff;
    }
}
