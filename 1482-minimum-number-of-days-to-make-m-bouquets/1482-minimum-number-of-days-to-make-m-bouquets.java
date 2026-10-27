class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
      if((long)m*k>bloomDay.length){
        return -1;
      }
      int min=Integer.MAX_VALUE;
      for(int i=0;i<bloomDay.length;i++){
        min=Math.min(bloomDay[i],min);
      }
      int max=Integer.MIN_VALUE;
      for(int i=0;i<bloomDay.length;i++){
        max=Math.max(bloomDay[i],max);
      }
      int low=min;
      int high=max;
      while(low<=high){
        int mid=low+(high-low)/2;
          if( possible(bloomDay,mid,k,m)){
            high=mid-1;
          }else{
            low=mid+1;
          }
        
       
      }
       return low;
    }
    public boolean possible(int bloomDay[],int day,int k,int m){
        int count=0;
        int noofB=0;
        for(int i=0;i<bloomDay.length;i++){
            if(bloomDay[i]<=day){
                count++;
                if(count==k){
                    noofB++;
                    count=0;
                    if(noofB>=m){
                        return true;
                    }
                }
            }else{
             count=0;
                
            }
        }
        return false;
    }
}
    
    
    
    