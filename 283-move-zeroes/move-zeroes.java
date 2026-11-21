class Solution {
    public void moveZeroes(int[] nums) {
        int nonZeroPointer = 0;

        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != 0) {
                nums[nonZeroPointer] = nums[index];

                if (nonZeroPointer != index) {
                    nums[index] = 0;
                }

                nonZeroPointer++;
            }
        }
    }
}