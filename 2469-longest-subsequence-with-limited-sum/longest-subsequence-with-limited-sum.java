class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);
        int n=nums.length;
    
        int[] prefix=new int[n];
        prefix[0]=nums[0];
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]+nums[i];
        }
        int m=queries.length;
        int[] answer=new int[m];
        for(int i=0;i<m;i++){
            int q=queries[i];
            int left=0;
            int right=n-1;
            int r=0;
            while(left<=right){
                int mid=left+(right-left)/2;
                if(prefix[mid]<=q){
                    r=mid+1;
                    left=mid+1;
                }
                else{
                    right=mid-1;
                }

            }
            answer[i]=r;



        }
        return answer;
        
        
    }
}