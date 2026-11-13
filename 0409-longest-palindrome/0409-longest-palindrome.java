class Solution {
    public int longestPalindrome(String s) {
        if(s.length()==1){
           return 1;
        }
        
        
        
        HashMap<Character,Integer>map=new HashMap<>();
        
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            
            if (map.containsKey(ch)) {
               map.put(ch,map.get(ch)+1);
               
            }else{
               map.put(ch,1);
               
            }
            
        }
        int ans=0;
        boolean odd=false;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(map.containsKey(ch)){
                int freq=map.get(ch);
                ans+=(freq/2)*2;
                if(freq%2!=0){
                    odd=true;
                }
                map.remove(ch);
            }
        }
            if(odd){
                ans=ans+1;
            }
        
        return ans;
    }
}