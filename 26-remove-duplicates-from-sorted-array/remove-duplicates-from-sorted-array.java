class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length<2){
            return nums.length;
        }
        int nonDuplicatePointer = 0, duplicateFindingPointer = 0;
        while (duplicateFindingPointer < nums.length) {
            if (nums[nonDuplicatePointer] != nums[duplicateFindingPointer]) {
                nonDuplicatePointer++;
                nums[nonDuplicatePointer] = nums[duplicateFindingPointer];                
            }
            duplicateFindingPointer++;
        }
        return nonDuplicatePointer+1;
    }
}