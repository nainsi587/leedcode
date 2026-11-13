class Solution {
    public int findLongestChain(int[][] pairs) {
       Arrays.sort(pairs,Comparator.comparingDouble(o-> o[1]));
        int longestchain=1;
        int lastend=pairs[0][1];
        for(int i=1;i<pairs.length;i++){
            if(pairs[i][0]>lastend){
                longestchain++;
                lastend=pairs[i][1];
            }
        }
        return longestchain;
       
    }
}