class Solution {
    public int countElements(int[] nums, int k) {
        int n = nums.length;
        if(k==0){
            return n;
        }
        int[] arr=nums.clone();
        Arrays.sort(arr);
        int threshold=arr[n-k];
        int count=0;
        for(int x:nums){
            if(x<threshold){
                count++;
            }
        }
        return count;
    }
}
