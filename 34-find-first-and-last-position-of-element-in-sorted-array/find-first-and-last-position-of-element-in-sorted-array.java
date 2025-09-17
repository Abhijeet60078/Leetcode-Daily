class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] arr = {-1, -1};
       
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > target) {
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                if (mid == 0 || nums[mid - 1] != target) {
                    arr[0] = mid;
                    break;
                } else {
                    right = mid - 1;
                }
            }
        }

        
        left = 0;
        right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > target) {
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                if (mid == nums.length - 1 || nums[mid + 1] != target) {
                    arr[1] = mid;
                    break;
                } else {
                    left = mid + 1;
                }
            }
        }

        return arr;
    }
}