class Solution {
    public int mySqrt(int x) {
        if(x<=2){
            return x==2?1:x;
        }
        for(int i=1;i<x;i++){
            if((long)i*i==x){
                return i;
            }else if((long)i*i>x){
                return i-1;
            }
        }
        return 0;
    }
}
            
        