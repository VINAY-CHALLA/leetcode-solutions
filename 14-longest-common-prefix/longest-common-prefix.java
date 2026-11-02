class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length<2){
            return strs[0];
        }
        int longest=Integer.MAX_VALUE;
        for(int i=0;i<strs.length-1;i++){
            int matching=0;
            int smallStringLen=strs[i].length()<strs[i+1].length()?strs[i].length():strs[i+1].length();
            for(int index=0;index<smallStringLen;index++){
                if(strs[i].charAt(index)==strs[i+1].charAt(index)){
                    matching++;
                }
                else{
                    break;
                }
            }
            longest=longest<matching?longest:matching;
        }
        return strs[0].substring(0,longest);
        
    }
}