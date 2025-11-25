class Solution {
    public int firstUniqChar(String s) {
        int[] freqCount = new int[26];
        int n = s.length();

        for(int i = 0; i < n; i++) {
            int index = s.charAt(i) - 'a';
            freqCount[index]++;
        }

        for(int i = 0; i < n; i++) {
            int index = s.charAt(i) - 'a';
            if(freqCount[index] == 1) {
                return i;
            }
        }

        return -1;
    }
}
