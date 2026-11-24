
import java.util.LinkedHashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        LinkedHashMap<Integer,Integer> lsm=new LinkedHashMap();
        for(int ele=0;ele<nums.length;ele++){
            if(lsm.containsKey(target-nums[ele])){
                return new int[]{lsm.get(target-nums[ele]),ele};
            }
            lsm.put(nums[ele],ele);
        }
        
        return new int[]{};
    }
}