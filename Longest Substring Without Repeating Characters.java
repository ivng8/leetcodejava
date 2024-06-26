class Solution {
    public int lengthOfLongestSubstring(String s) {
        int highest = 0;
        int beginning = 0;
        int current = 0;
        for(int i = 0; i < s.length(); i += 1) {
            String currentLetter = s.substring(i, i + 1);
            String currentPhrase = s.substring(beginning, i);
            if (currentPhrase.contains(currentLetter)) {
                beginning += currentPhrase.indexOf(currentLetter) + 1;
            }
            current = i + 1 - beginning;
            if (current > highest) {
                highest = current;
            }
        }
        return highest;
    }
}