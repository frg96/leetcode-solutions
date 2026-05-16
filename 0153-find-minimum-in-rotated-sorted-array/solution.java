class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;

        int lo = 0;
        int hi = n-1;

        while(lo < hi) {
            // current range is already sorted, then leftmost element is minimum
            if(nums[lo] < nums[hi]){
                return nums[lo];
            }
            
            // else compute middle index
            int mid = lo + (hi - lo)/2;

            // If left half is sorted,
            // minimum cannot be in [lo ... mid]
            // because nums[lo] is already <= nums[mid]
            // So discard left half including mid
            if(nums[lo] <= nums[mid]) {
                lo = mid+ 1;
            }
            // Otherwise rotation point / minimum
            // lies in the left half including mid
            else  {
                hi = mid;
            }
        }

        // lo == hi -> minimum element found
        return nums[hi];
    }
}
