class Solution {
    public int lengthOfLastWord(String s) {
        String[] stringArr=s.strip().split(" ");
        return stringArr[stringArr.length-1].length();
        
    }
}