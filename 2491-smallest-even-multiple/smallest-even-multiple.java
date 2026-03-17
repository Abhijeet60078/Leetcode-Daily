class Solution {
    public int smallestEvenMultiple(int n) {
        int p=1;

        for(int i=n;i<=n*2;i++){
            if(i%2==0&&i%n==0){
                p=i;
                break;

                

            }
        }
        return p;
        

    }
}