class Solution {
    public int maxval(int piles[]){
        int max=Integer.MIN_VALUE;
        for(int pile:piles){
            max=Math.max(pile,max);
        }
        return max;
    }
    public int calculatetotalH(int piles[],int mid){
        int totalH=0;
        for(int pile:piles){
            totalH +=Math.ceil((double)pile/mid);

        }
        return totalH;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int ans=-1;
        int low=0;
        int high=maxval(piles);
        while(low<=high){
            int mid=low+(high-low)/2;
            int totalH=calculatetotalH(piles,mid);
            if(totalH<=h){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans ;

    }
}