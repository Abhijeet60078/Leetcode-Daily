class Solution {
    public char findTheDifference(String s, String t) {
        int sumT=0;
        int sumD=0;
        for(int i=0;i<s.length();i++){
            sumT+=s.charAt(i);

        }        
        for(int i=0;i<t.length();i++){
            sumD+=t.charAt(i);
        }
        return (char)(sumD-sumT);
    }
}