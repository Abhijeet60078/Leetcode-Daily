class Solution {
    public int findComplement(int num) {
        String bin="";
        while(num>0){
            bin=(num%2)+bin;
            num/=2;
        }
        int res=0;
        for(int i=0;i<bin.length();i++){
            res=res*2+(bin.charAt(i)=='0'?1:0);
        }
        return res;

    }
}