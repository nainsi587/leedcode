class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
      int max=Integer.MIN_VALUE;
      for(int i=0;i<nums.length;i++){
        max=Math.max(nums[i],max);
      }
     
      int low=1;
      int high=max;
      while(low<=high){
        int mid=low+(high-low)/2;
        int sum= totalsum(nums,mid);
        if(sum<=threshold){
            high=mid-1;
        }else{
            low=mid+1;
        }
      }
      return low;
    }
    public int totalsum(int nums[],int number){
        int sum=0;
        for(int i=0;i<nums.length;i++){
           sum += (nums[i]+number-1)/number;
        }
            
       return sum;
       
    }
}