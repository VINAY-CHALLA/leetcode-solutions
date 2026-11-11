
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // Step 1: Sort the array to enable the Two Pointer approach
        Arrays.sort(nums);
        int fixedIndex = 0;
        // Store all unique triplets whose sum is zero
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        // Step 2: Select each element as the fixed element
        // Stop when fewer than 3 elements remain or fixed element becomes positive
        while (fixedIndex < nums.length - 2 && nums[fixedIndex] <= 0) {
            // Skip duplicate fixed elements to avoid duplicate triplets
            if (fixedIndex != 0 && nums[fixedIndex] == nums[fixedIndex - 1]) {
                fixedIndex++;
                continue;
            }
            // Step 3: Initialize two pointers
            // Left starts immediately after the fixed element
            int left = fixedIndex + 1;
            // Right starts at the last index
            int right = nums.length - 1;
            // Step 4: Search for the remaining two elements
            while (left < right) {
                // Calculate the sum of the three selected elements
                int sum = nums[fixedIndex] + nums[left] + nums[right];
                if (sum == 0) {
                    // Found a valid triplet; add it to the result
                    result.add(Arrays.asList(
                            nums[fixedIndex], nums[left], nums[right]));
                    // Move both pointers inward to find another combination
                    right--;
                    left++;
                    // Skip duplicate left values to avoid duplicate triplets
                    while (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }
                    // Skip duplicate right values to avoid duplicate triplets
                    while (left < right && nums[right] == nums[right + 1]) {
                        right--;
                    }
                } else if (sum > 0) {
                    // Sum is too large; move right pointer to a smaller value
                    right--;
                } else {
                    // Sum is too small; move left pointer to a larger value
                    left++;
                }
            }
            // Move to the next fixed element
            fixedIndex++;
        }
        // Return all unique triplets
        return result;
    }
}
