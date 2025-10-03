class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Set<List<Integer>> result = new HashSet<>();

        for (int i = 0; i < n; i++) {
            Set<Integer> set = new HashSet<>();
            for (int j = i + 1; j < n; j++) {
                int target = -(nums[i] + nums[j]);
                if (set.contains(target)) {
                    List<Integer> triplet = new ArrayList<>(Arrays.asList(nums[i], nums[j], target));
                    Collections.sort(triplet);
                    result.add(triplet);
                }
                set.add(nums[j]);
            }
        }


        return new ArrayList<>(result);
    }}