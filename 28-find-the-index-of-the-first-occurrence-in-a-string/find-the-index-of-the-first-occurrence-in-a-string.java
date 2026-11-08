class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length()>haystack.length()){
            return -1;
        }
        for(int index=0;index<=haystack.length()-needle.length();index++){
            if(haystack.substring(index,index+needle.length()).equals(needle)){
                return index;
            }
        }
        return -1;
    }
}