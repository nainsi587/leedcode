class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int total_gas=0;
        int total_cost=0;
        for(int i=0;i<gas.length;i++){
            total_gas+=gas[i];
            total_cost+=cost[i];
        }
        if(total_cost>total_gas){
            return -1;
        }
        int currgas=0;
        int start=0;
        for(int i=0;i<gas.length;i++){
            currgas+=gas[i]-cost[i];
            if(currgas<0){
                currgas=0;
                start=i+1;
            }
        }
        return start;
    }
}