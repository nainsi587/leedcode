class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int ans[]=new int[nums.length];
        Stack<Integer>st=new Stack<>();
        int n=nums.length;
        
        for(int i=2*n-1;i>=0;i--){
            int  idx=i%n;
            while(!st.isEmpty() && nums[idx]>=st.peek()){
                st.pop();
            }
            if(st.isEmpty()){
                ans[idx]=-1;
            }else{
                ans[idx]=st.peek();
            }
            st.push(nums[idx]);
        }
        return ans;
    }
}