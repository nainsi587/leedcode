class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
       Arrays.sort(intervals,Comparator.comparingDouble (o->o[1]));
       int NonOp=0;
       int lastend=intervals[0][1];
       for(int i=1;i<intervals.length;i++){
        if(intervals[i][0]<lastend){
            NonOp++;
        }else{
            lastend=intervals[i][1];
        }
       }
       return NonOp;
    }
}