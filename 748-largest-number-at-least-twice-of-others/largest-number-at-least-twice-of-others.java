class Solution {
    public int dominantIndex(int[] nums) {
        int max = nums[0], index = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                index = i;
            }
        }

        Arrays.sort(nums);

        if (max >= 2 * nums[nums.length - 2]) {
            return index;
        }

        return -1;
    }
}
