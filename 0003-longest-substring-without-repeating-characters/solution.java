class Solution {
    public int lengthOfLongestSubstring(String s) {
        // Using sliding window

        int n = s.length();
        int left = 0;
        int bestLen = 0;

        HashSet<Character> set = new HashSet<>();

        for(int right = 0; right < n; right++) {
            // if new right char is in set, then start closing left window and removing
            // chars from set until duplicate right char is removed from set
            while(set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(s.charAt(right));

            // recalculate best length when new right char is added
            bestLen = Math.max(bestLen, right - left + 1);

        }

        return bestLen;
    }
}
