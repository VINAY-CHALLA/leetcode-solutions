class Solution {
    public int lengthOfLongestSubstring(String s) {
        LinkedList<Character> array = new LinkedList<>();
        int LongestString = 0;
        for (char c : s.toCharArray()) {
            while (array.contains(c)) {
                array.removeFirst();
            }
            array.add(c);
            if (LongestString < array.size()) {
                LongestString = array.size();
            }
        }
        return LongestString;
    }
}