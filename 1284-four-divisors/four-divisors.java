class Solution {
    public int sumFourDivisors(int[] nums) {
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            int localSum = 0;

            for (int j = 1; j * j <= nums[i]; j++) {
                if (nums[i] % j == 0) {
                    if (j * j == nums[i]) {
                        count++;
                        localSum += j;
                    } else {
                        count += 2;
                        localSum += j + nums[i] / j;
                    }
                }
                if (count > 4) break;
            }

            if (count == 4) {
                sum += localSum;
            }
        }

        return sum;
    }
}
