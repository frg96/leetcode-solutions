class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0; 
        int currentCount = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 1) {
                currentCount++;
            }
            else {
                if(currentCount != 0) {
                    maxCount = Math.max(currentCount, maxCount);
                    currentCount = 0;
                }
            }
        }
        if(currentCount != 0) {
            maxCount = Math.max(currentCount, maxCount);
        }
        return maxCount;
    }
}
