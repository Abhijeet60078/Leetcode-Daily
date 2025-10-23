class Solution {
    public int maxVowels(String s, int k) {
        int windowsize=0;
        for(int i=0;i<k;i++){
            if(isVowel(s.charAt(i)))windowsize++;

        }
        int max=windowsize;
        for(int i=k;i<s.length();i++){
            if(isVowel(s.charAt(i)))windowsize++;
            if(isVowel(s.charAt(i-k)))windowsize--;
            max=Math.max(max,windowsize);
        }
        return max;



        
    }
    private boolean isVowel(char c){
        return "aeiou".indexOf(c)!=-1;

    }
}