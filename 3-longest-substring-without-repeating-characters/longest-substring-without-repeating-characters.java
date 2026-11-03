
import java.util.HashSet;
import java.util.Set;

class Solution {
    public int lengthOfLongestSubstring(String s) {

        Set<Character> set = new HashSet<>();

        int left = 0;
        int longest = 0;

        for (int right = 0; right < s.length(); right++) {

            char current = s.charAt(right);

            // Remove characters until duplicate is removed
            while (set.contains(current)) {
                set.remove(s.charAt(left));
                left++;
            }

            // Add current character
            set.add(current);

            // Update maximum window length
            longest = Math.max(longest, right - left + 1);
        }

        return longest;
    }
}
