class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int totalLen = nums1.length + nums2.length;

        int halfIndex = totalLen/2;

        int i = 0; // for nums1
        int j = 0; // for nums2
        int k = 0; // for merged array

        int[] merged = new int[totalLen];

        while(i < nums1.length && j < nums2.length) {
            if(nums1[i] <= nums2[j])
                merged[k++] = nums1[i++];
            else
                merged[k++] = nums2[j++];
        }

        while(i < nums1.length)
            merged[k++] = nums1[i++];

        while(j < nums2.length)
            merged[k++] = nums2[j++];

        if(totalLen % 2 == 0)
            return (double) (merged[halfIndex - 1] + merged[halfIndex]) / 2;
        else
            return (double) merged[halfIndex];

    }
}
