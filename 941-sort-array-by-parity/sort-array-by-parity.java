class Solution {
    public int[] sortArrayByParity(int[] nums) {
        ArrayList<Integer> m = new ArrayList<>();
        
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                m.add(nums[i]);
            }
        }
        
       
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0) {
                m.add(nums[i]);
            }
        }
        
       
        int[] arr = new int[nums.length];
        for (int i = 0; i < m.size(); i++) {
            arr[i] = m.get(i);
        }
        
        return arr;
    }
}
