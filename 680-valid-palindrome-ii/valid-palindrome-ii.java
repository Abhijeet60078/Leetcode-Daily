class Solution {
    public boolean validPalindrome(String s) {
        String p=s;
        String reversed=new StringBuilder(s).reverse().toString();
        if(p.equals(reversed)&&p.length()<=3){
            return true;
            }
        
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                String leftchar=s.substring(i+1,j+1);
                String rightchar=s.substring(i,j);
                String rev1=new StringBuilder(leftchar).reverse().toString();
                String rev2=new StringBuilder(rightchar).reverse().toString();
                return leftchar.equals(rev1)||rightchar.equals(rev2);
            }
            i++;
            j--;
        }
        return true;








        
    }
}