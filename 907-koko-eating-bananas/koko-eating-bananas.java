class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=maximum(piles);
        while(low<=high){
            int mid=(low+high)/2;
            int totalH=minimumHours(piles,mid);
            if(totalH<=h){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;

        
    }
    public static int minimumHours(int[] piles,int hours){
        int totalH=0;
        for(int i=0;i<piles.length;i++){
            totalH+=Math.ceil((double)(piles[i])/(double)(hours));
        }
        return totalH;

    }
    public static int maximum(int[] piles){
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<piles.length;i++){
            maxi=Math.max(maxi,piles[i]);
        }
        return maxi;
    }
}