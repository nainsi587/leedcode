import java.util.HashMap;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer>m=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int first=nums[i];
            int sec=target-first;
            if(m.containsKey(sec)){
                return new int[]{i,m.get(sec)};
            }
            m.put(first,i);
        }
        return new int[]{};
    }
}