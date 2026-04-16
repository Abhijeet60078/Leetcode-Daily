class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String s=strs[0];
        String d=strs[strs.length-1];
        int c=Math.min(s.length(),d.length());
        int i=0;
        while(i<c&&s.charAt(i)==d.charAt(i))
            {
                i++;
            
        }
        return s.substring(0,i);

        
    }
}