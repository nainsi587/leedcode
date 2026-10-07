class Solution {
    public int maxProduct(int[] nums) {
      int LP=1;
      int RP=1;
      int ans=nums[0];
      for(int i=0;i<nums.length;i++){
        LP=LP==0?1:LP;
        RP=RP==0?1:RP;
        LP*=nums[i];
        RP*=nums[nums.length-1-i];
        ans=Math.max(ans,Math.max(LP,RP));
      }
      return ans;
    }
}