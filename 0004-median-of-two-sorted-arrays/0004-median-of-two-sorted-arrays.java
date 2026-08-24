class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int merge[]= new int[nums1.length+nums2.length];
        for(int i=0;i<nums1.length;i++){
                merge[i]=nums1[i];
        }
        for(int i=0;i<nums2.length;i++){
                merge[nums1.length+i]=nums2[i];
        }
        Arrays.sort(merge);
        int n=merge.length;
        if(n%2==1){
             return merge[n/2];
        }else{
            return (double)(merge[n/2-1]+merge[n/2])/2.0;

        } 
        
        
       
    }

      
    
}