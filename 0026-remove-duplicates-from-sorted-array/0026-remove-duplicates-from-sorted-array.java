class Solution {
    public int removeDuplicates(int[] nums) {
        int unique=0;
        for(int i=0;i<nums.length;i++){
            if(nums[unique]!=nums[i]){
                unique++;
                nums[unique]=nums[i];
            }
        }
        return unique+1;
    }
}