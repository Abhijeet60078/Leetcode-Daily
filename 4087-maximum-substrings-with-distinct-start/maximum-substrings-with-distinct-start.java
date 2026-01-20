class Solution {
    public int maxDistinct(String s) {
        HashSet<Character> m=new HashSet<>();
        for(int i=0;i<s.length();i++){
            m.add(s.charAt(i));

        }
        return m.size();
        
    }
}