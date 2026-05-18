class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n = nums.length;

        Arrays.sort(nums);

        int minAbsDiff = Integer.MAX_VALUE;
        int minSum = 0;

        for(int i = 0; i < n; i++) {

            int left = i+1;
            int right = n-1;

            while(left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                // System.out.println("\t%d,%d,%d -> %d + %d + %d = %d".formatted(i, left, right, nums[i], nums[left], nums[right], sum));

                int absDiff = Math.abs(target - sum);
                if(absDiff < minAbsDiff){
                    minAbsDiff = absDiff;
                    minSum = sum;
                }


                if(sum == target) {
                    return sum;
                }
                else if(sum < target) {
                    left++;
                }
                else{
                    right--;
                }
            }


        }

        return minSum;
    }
}
