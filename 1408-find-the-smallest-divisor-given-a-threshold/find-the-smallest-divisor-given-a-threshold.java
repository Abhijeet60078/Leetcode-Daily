class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int left=1;
        int right=getMax(nums);
        while(left<right){
            int mid=left+(right-left)/2;
            int sum=0;
            for(int num:nums){
                sum+=(num+mid-1)/mid;
            }
            if(sum>threshold){
                left=mid+1;
            }
            else{
                right=mid;
            }
        }
        return left;

        

        
    }
    private int getMax(int[] nums){
        int p=nums[0];
        for(int num:nums){
            p=Math.max(p,num);
        }
        return p;
    }
}