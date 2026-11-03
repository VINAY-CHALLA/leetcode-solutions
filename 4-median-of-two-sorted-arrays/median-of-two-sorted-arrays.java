
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int previous = 0, current = 0;

        int total = nums1.length + nums2.length;
        int medianPoint = total / 2;

        int left = 0, right = 0;

        for (int i = 0; i <= medianPoint; i++) {

            previous = current;

            if (left < nums1.length &&
                (right >= nums2.length || nums1[left] <= nums2[right])) {

                current = nums1[left];
                left++;

            } else {
                current = nums2[right];
                right++;
            }
        }

        if (total % 2 == 0) {
            return ((double) previous + current) / 2;
        } else {
            return current;
        }
    }
}
