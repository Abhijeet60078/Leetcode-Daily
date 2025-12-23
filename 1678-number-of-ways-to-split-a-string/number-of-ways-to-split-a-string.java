class Solution {
    public int numWays(String s) {
        
        long n=s.length();
        long mod=1000000007;
        int onesCount=0;

        for(int i=0;i<n;i++){
            if(s.charAt(i)=='1'){
                onesCount++;

            }
        }
        if(onesCount==0){
            long ways=(long)(n-1)*(n-2)/2;
            return (int)(ways%mod);

        }
        if(onesCount%3!=0){
            return 0;

        }
        int onesPart=onesCount/3;
        int runningOnes=0;
        long firstPart=0;
        long secondPart=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='1'){
                runningOnes++;
            }
            if(runningOnes==onesPart){
                firstPart++;
            }
            if(runningOnes==2*onesPart){
                secondPart++;
            }

        }
        return (int)((firstPart*secondPart)%mod);



        
        

    }
}