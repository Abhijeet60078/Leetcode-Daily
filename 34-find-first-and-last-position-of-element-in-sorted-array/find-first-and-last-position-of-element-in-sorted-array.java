class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first=findbound(nums,target,true);
        int last=findbound(nums,target,false);
        return new int[]{first,last};

        








        
    }
    private static int findbound(int[] nums,int target,boolean isFirst){
        int left=0;
        int right=nums.length-1;
        int result=-1;
        while(left<=right){
            int mid=(left+right)/2;

            if(nums[mid]==target){
                result=mid;
                if(isFirst){
                    right= mid-1;
                }
                else{
                    left=mid+1;
                }
            }
            else if(nums[mid]<target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return result;

    }
}