class Solution {
    public String longestCommonPrefix(String[] strs) {
        int numberOfStrs = strs.length;

        for(int charIndex = 0; charIndex < strs[0].length(); charIndex++) {
            for(int strsIndex = 1; strsIndex < numberOfStrs; strsIndex++) {
                if(
                    strs[strsIndex].length() <= charIndex ||
                    strs[strsIndex].charAt(charIndex) != strs[0].charAt(charIndex)
                ) {
                    return strs[0].substring(0, charIndex);
                }
            }
        }

        return strs[0];
    }
}
