class Solution {
    public String sortVowels(String s) {
        ArrayList<Character> vowel = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (isVowel(ch)) {
                vowel.add(ch);
            }
        }
        Collections.sort(vowel);
        StringBuilder result = new StringBuilder(s);
        int vowelIndex = 0;
        for (int i = 0; i < result.length(); i++) {
            char ch = result.charAt(i);
            if (isVowel(ch)) {
                result.setCharAt(i, vowel.get(vowelIndex));
                vowelIndex++;
            }
        }

        return result.toString();
    }

    boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
            || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }
}
