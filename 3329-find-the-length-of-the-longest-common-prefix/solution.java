class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        Set<Integer> prefixSet = new HashSet<>();
        
        for(int num: arr1) {
            while(num > 0) {
                prefixSet.add(num);
                num = num/10;
            }
        }

        int maxPrefixLength = 0;

        for(int num: arr2) {
            while(num>0) {
                if(prefixSet.contains(num)) {
                    int currentPrefixLength = String.valueOf(num).length();
                    maxPrefixLength = Math.max(maxPrefixLength, currentPrefixLength);
                }
                num = num/10;
            }
        }

        return maxPrefixLength;
    }
}
