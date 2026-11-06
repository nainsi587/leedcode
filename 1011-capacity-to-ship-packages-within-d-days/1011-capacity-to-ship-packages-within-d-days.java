class Solution {
    public int reqday(int weights[],int cap){
        int load=0;
        int day=1;
        for(int i=0;i<weights.length;i++){
            if(load+weights[i]>cap){
                load=weights[i];
                day++;
            }else{
                load+=weights[i];
            }
        }
        return day;
    
    }
    public int shipWithinDays(int[] weights, int days) {
        int max=0;
        int sum=0;
        for(int i=0;i<weights.length;i++){
            max=Math.max(max,weights[i]);
            sum+=weights[i];
        }
       int low=max;
       int high=sum;
       while(low<=high){
        int mid=low+(high-low)/2;
        int day=reqday(weights,mid);
        if(day<=days){
            high=mid-1;
        }else{
            low=mid+1;
        }
       }
       return low;
    }
}