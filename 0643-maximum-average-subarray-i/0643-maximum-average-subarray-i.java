class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int max=0;
        int sum=0;
        int start=0;
        int end=k-1;
        for(int i=start;i<=end;i++){
            sum+=nums[i];
        }
        max=sum;
        while(end<nums.length-1){
            sum-=nums[start];
            start++;
            end++;
            sum+=nums[end];
            max=Math.max(max,sum);
        }
        return (double)max/k;
        
    }
}