class Solution {
    public int maxProduct(int[] nums) {
       int lp=1;
       int rp=1;
       int ans=nums[0]; 
       for(int i=0;i<nums.length;i++){
        lp=lp == 0? 1:lp;
        rp=rp == 0? 1:rp;
        lp*=nums[i];
        rp*=nums[nums.length-1-i];
        ans=Math.max(ans,Math.max(lp,rp));
       }
       return ans;
    }
}