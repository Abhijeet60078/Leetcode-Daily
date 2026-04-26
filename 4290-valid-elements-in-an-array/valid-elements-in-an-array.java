class Solution {
    public List<Integer> findValidElements(int[] nums) {
        int n = nums.length;
        List<Integer> res = new ArrayList<>();
        boolean[] v = new boolean[n];

        int max = nums[0];
        v[0] = true;

        for (int i = 1; i < n; i++) {
            if (nums[i] > max) {
                v[i] = true;
                max = nums[i];
            } else {
                max = Math.max(max, nums[i]);
            }
        }

        max = nums[n - 1];
        v[n - 1] = true;

        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] > max) {
                v[i] = true;
                max = nums[i];
            } else {
                max = Math.max(max, nums[i]);
            }
        }

        for (int i = 0; i < n; i++) {
            if (v[i]) {
                res.add(nums[i]);
            }
        }

        return res;
    }
}