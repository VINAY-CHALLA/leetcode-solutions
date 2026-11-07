class Solution {
    public int removeElement(int[] nums, int val) {
        int nonDuplicatePointer = 0;
        for (int duplicateFindingPointer = 0;duplicateFindingPointer < nums.length;duplicateFindingPointer++) {
            if (nums[duplicateFindingPointer] != val) {
                nums[nonDuplicatePointer] =
                    nums[duplicateFindingPointer];
                nonDuplicatePointer++;
            }
        }
        return nonDuplicatePointer;
    }
}