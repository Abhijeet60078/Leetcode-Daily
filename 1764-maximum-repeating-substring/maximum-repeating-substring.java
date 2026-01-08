class Solution {
    public int maxRepeating(String sequence, String word) {
        int count=0;
        String p=word;
        while(sequence.contains(p)){
            count++;
            p=p+word;
        }
        return count;
        
    }
}