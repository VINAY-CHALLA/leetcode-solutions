class Solution {
    public int maxArea(int[] height) {
        int left=0,right=height.length-1;
        int maxWater=Math.min(height[left],height[right])*(right-left);
        int containerHeight;
        while(left<right){
            if(height[left]<height[right]){
                left++;
                containerHeight=Math.min(height[left],height[right]);
                if(maxWater<containerHeight*(right-left)){
                    maxWater=containerHeight*(right-left);
                }
            }
            else{
                right--;
                containerHeight=Math.min(height[left],height[right]);
                if(maxWater<containerHeight*(right-left)){
                    maxWater=containerHeight*(right-left);
                }
            }
        }
        return maxWater;
        
    }
}