class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer>st=new Stack<>();
        int n=heights.length;
        int nsr[]=new int[n];
        int nsl[]=new int[n];
        // for nsr
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && heights[st.peek()]>=heights[i]){
                st.pop();
            }
            if(st.isEmpty()){
                nsr[i]=n;
            }else{
                nsr[i]=st.peek();
            }
            st.push(i);
        }
        //for nsl
        st=new Stack<>(); // stack ko khali kiya h 
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && heights[st.peek()]>=heights[i]){
                st.pop();
            }
            if(st.isEmpty()){
                nsl[i]=-1;
            }else{
                nsl[i]=st.peek();
            }
            st.push(i);
        }
        int maxarea=0;
        for(int i=0;i<n;i++){
          int width=nsr[i]-nsl[i]-1;
          int currarea=heights[i]*width;
          maxarea=Math.max(maxarea,currarea);
        }
        return maxarea;
    }
}